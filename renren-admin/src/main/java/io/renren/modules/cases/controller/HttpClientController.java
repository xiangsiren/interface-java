package io.renren.modules.cases.controller;

import io.renren.common.config.DatabaseUtil;
import io.renren.common.utils.R;
import io.renren.modules.cases.entity.TestCaseEntity;
import io.renren.modules.cases.service.TestCaseService;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.testng.TestNG;
import org.testng.collections.Lists;
import sun.tools.jconsole.Worker;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("http/client")

public class HttpClientController {
    @Autowired
    private TestCaseService testCaseService;

    @RequestMapping("/list")
    public List<TestCaseEntity> getTestCaseLists(){

        List<TestCaseEntity> cases = testCaseService.getTestCaseList();

        return  cases ;
    }

    public R testCase() {

        List<TestCaseEntity> cases = testCaseService.getTestCaseList();

        // httpclient客户端，类似于一个浏览器，可以由这个客户端执行http请求
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 请求
        HttpGet httpGet = new HttpGet("https://www.jianshu.com/");
        // 响应
        CloseableHttpResponse response = null;
        try {
            // execute()执行成功会返回HttpResponse响应
            response = httpClient.execute(httpGet);
            // 响应体
            HttpEntity responseEntity = response.getEntity();
            System.out.println("响应状态：" + response.getStatusLine());
            // gzip,deflate,compress
            System.out.println("响应体编码方式：" + responseEntity.getContentEncoding());
            // 响应类型如text/html charset也有可能在ContentType中
            System.out.println("响应体类型：" + responseEntity.getContentType());
            /**
             *  EntityUtils.toString()方法会将响应体的输入流关闭，相当于消耗了响应体，
             *  此时连接会回到httpclient中的连接管理器的连接池中，如果下次访问的路由
             *  是一样的（如第一次访问https://www.jianshu.com/,第二次访问
             *  https://www.jianshu.com/search?q=java&page=1&type=note)，
             *  则此连接可以被复用。
             */

//            System.out.println("响应体内容：" + EntityUtils.toString(responseEntity));
            // 如果关闭了httpEntity的inputStream，httpEntity长度应该为0，而且再次请求相同路由的连接可以共用一个连接。
            // 可以通过设置连接管理器最大连接为1来验证。
//            response = httpClient.execute(httpGet);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    // 关闭连接，则此次连接被丢弃
                    response.close();
                }
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return R.ok();

    }

    @RequestMapping("/sutes")
    public void sutes() {

        TestNG testNG = new TestNG();

        List sutes = Lists.newArrayList();

        sutes.add("renren-admin/src/main/resources/sutes.xml");

        testNG.setTestSuites(sutes);

        testNG.run();
    }

    public static void mains(String[] args) throws IOException {

        SqlSession session = DatabaseUtil.getSqlSession();

        List<TestCaseEntity> cases= session.selectList("getTestCaseList");

        System.out.println(cases.toString());

    }

    public static void main(String[] args) throws InterruptedException
    {
        final StringBuffer a=new StringBuffer("ppp");
        System.out.println(a);
        System.out.println(a.hashCode());
        a.append("kkk");
        System.out.println(a);
        System.out.println(a.hashCode());
    }

}
