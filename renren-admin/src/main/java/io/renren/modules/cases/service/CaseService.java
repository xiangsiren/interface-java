package io.renren.modules.cases.service;

import io.renren.common.config.DatabaseUtil;
import io.renren.modules.cases.entity.TestCaseEntity;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CaseService {
    @Autowired
    private TestCaseService testCaseService ;

    @Test(dataProvider = "methodData1")
    public void test3(TestCaseEntity testCaseEntity){
        System.out.println("===22222222====" + testCaseEntity.getPath());
    }

    @DataProvider(name="methodData1")
    public Iterator<Object[]> getTestCaseList() throws IOException {

//        List<TestCaseEntity> cases = testCaseService.getTestCaseList();
        SqlSession session = DatabaseUtil.getSqlSession();

        List<TestCaseEntity> cases = session.selectList("getTestCaseList");

        List<Object[]> testCases = new ArrayList<>();

        for (TestCaseEntity testCaseEntity : cases) {

            testCases.add(new Object[]{testCaseEntity});
        }

        return testCases.iterator() ;
    }
}
