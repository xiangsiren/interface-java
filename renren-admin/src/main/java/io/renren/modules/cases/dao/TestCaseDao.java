package io.renren.modules.cases.dao ;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import io.renren.modules.cases.entity.TestCaseEntity ;

import java.util.List;

/**
 * 用例表
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-05-25 11:39:26
 */
@Mapper
public interface TestCaseDao extends BaseMapper<TestCaseEntity> {

    List<TestCaseEntity> getTestCaseList();
	
}
