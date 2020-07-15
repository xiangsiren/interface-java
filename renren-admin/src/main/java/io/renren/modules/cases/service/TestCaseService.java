package io.renren.modules.cases.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.cases.entity.TestCaseEntity ;

import java.util.List;
import java.util.Map;

/**
 * 用例表
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-05-25 11:39:26
 */
public interface TestCaseService extends IService<TestCaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<TestCaseEntity> getTestCaseList();

}

