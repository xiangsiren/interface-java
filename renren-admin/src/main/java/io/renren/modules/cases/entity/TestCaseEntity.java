package io.renren.modules.cases.entity ;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.renren.common.validator.group.AddGroup;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * 用例表
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-05-25 11:39:26
 */
@Data
@TableName("test_case")
public class TestCaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 接口名称
	 */
	private String caseName;
	/**
	 * 请求路径
	 */
	@NotBlank(message="请求路径不能为空", groups = AddGroup.class)
	private String path;
	/**
	 * 请求类型
	 */
	private String  method ;
	/**
	 * 请求数据
	 */
	private String requestData;
	/**
	 * 请求地址
	 */
	private String requestUrl;
	/**
	 * 创建时间
	 */
	private Date time;
	/**
	 * 响应数据
	 */
	private String responseData;

}
