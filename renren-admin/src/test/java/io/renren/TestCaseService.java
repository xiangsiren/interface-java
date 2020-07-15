package io.renren;

import io.renren.modules.cases.entity.TestCaseEntity;

import io.renren.service.TestCaseServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class TestCaseService extends AbstractTestNGSpringContextTests {
    @Autowired
    private TestCaseServiceImpl testCaseService ;

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){

        System.out.println("test111方法 name="+name+";age="+age);
    }

    @Test
    public void test2(String name,int age){

        System.out.println("test22方法 name="+name+";age="+age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",20},
                    {"lisi",25}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }

        return result;
    }

    @Test(dataProvider = "methodData1")
    public void test3(TestCaseEntity testCaseEntity){
        System.out.println("===22222222====" + testCaseEntity.getPath());
    }

    @DataProvider(name="methodData1")
    public Iterator<Object[]> getTestCaseList() {

        List<TestCaseEntity> cases = testCaseService.getTestCaseList();

        List<Object[]> testCases = new ArrayList<>();

        for (TestCaseEntity testCaseEntity : cases) {

            testCases.add(new Object[]{testCaseEntity});
        }

        return testCases.iterator() ;
    }
}
