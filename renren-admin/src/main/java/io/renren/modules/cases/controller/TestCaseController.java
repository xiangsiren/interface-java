package io.renren.modules.cases.controller ;

import java.util.*;
import java.util.stream.Collectors;

import io.renren.common.validator.ValidatorUtils;
import io.renren.common.validator.group.AddGroup;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.modules.cases.service.TestCaseService ;
import io.renren.modules.cases.entity.TestCaseEntity;


/**
 * 用例表
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-05-25 11:39:26
 */
@RestController
@RequestMapping("case/testcase")
public class TestCaseController {
    @Autowired
    private TestCaseService testCaseService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("case:testcase:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = testCaseService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("case:testcase:info")
    public R info(@PathVariable("id") Long id){
        TestCaseEntity testCase = testCaseService.getById(id);

        return R.ok().put("testCase", testCase);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("case:testcase:save")
    public R save(@RequestBody TestCaseEntity testCase){

        ValidatorUtils.validateEntity(testCase, AddGroup.class);
        testCaseService.save(testCase);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("case:testcase:update")
    public R update(@RequestBody TestCaseEntity testCase){
        ValidatorUtils.validateEntity(testCase);
        testCaseService.updateById(testCase);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("case:testcase:delete")
    public R delete(@RequestBody Long[] ids){
        testCaseService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

    public static void mains(String[] args) {

        new Timer("testTimer").schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("TimerTask");
            }
        }, 1000,2000);
    }

    public static void main(String[] args) {
        List<String> asList=Arrays.asList("aa", "bb","aa", "cc", "");

        List<String> filters = asList.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

        System.out.println(filters.toString());

    }

}
