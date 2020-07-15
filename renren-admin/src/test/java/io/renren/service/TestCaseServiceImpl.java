package io.renren.service;


import io.renren.commons.dynamic.datasource.annotation.DataSource;
import io.renren.modules.cases.dao.TestCaseDao;
import io.renren.modules.cases.entity.TestCaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DataSource
public class TestCaseServiceImpl {


    @Autowired
    private TestCaseDao testCaseDao ;

//    @Transactional
    public List<TestCaseEntity> getTestCaseList(){

        return testCaseDao.getTestCaseList();
    }
}
