package io.renren.modules.cases.service.impl;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;


import io.renren.modules.cases.entity.TestCaseEntity ;
import io.renren.modules.cases.dao.TestCaseDao ;
import io.renren.modules.cases.service.TestCaseService ;

@Service("testCaseService")
public class TestCaseServiceImpl extends ServiceImpl<TestCaseDao, TestCaseEntity> implements TestCaseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TestCaseEntity> page = this.page(
                new Query<TestCaseEntity>().getPage(params),
                new QueryWrapper<TestCaseEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public boolean save(TestCaseEntity entity) {

        entity.setTime(new Date());
        return super.save(entity);
    }

    @Override
    public List<TestCaseEntity> getTestCaseList(){

        return baseMapper.getTestCaseList();
    }
}
