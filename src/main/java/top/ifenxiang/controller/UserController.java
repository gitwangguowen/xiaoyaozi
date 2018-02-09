package top.ifenxiang.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import top.ifenxiang.pojo.User;
import top.ifenxiang.pojo.vo.DataResult;
import top.ifenxiang.service.UserService;

@Controller
@Api(value="test",description="测试接口描述")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/user/getUser/{id}")
	@ResponseBody
	public User getUser(@PathVariable Long id,String username) {
		System.out.println(id);
		User user = new User();
		return user;
	}
	
	@RequestMapping("/user/setUser")
	@ResponseBody
	public User setUser(User user) {
		return user;
	}
	
	/**
	 * 用户注册接口
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/user/register")
	@ResponseBody
	@ApiOperation(value="用户注册", httpMethod ="POST", response=DataResult.class, notes ="用户注册")
	public DataResult userRegister(String username,String password) {
		boolean isExist = userService.findUserIsExist(username);//判断用户是否存在
		DataResult<User> dataResult = new DataResult<User>();
		if (isExist) {
			dataResult.setCode(1025);
			dataResult.setMessage("用户名已存在");
			dataResult.setData(null);
		} else {
			userRegister(username,password);
		}
		return dataResult;
	}
	
}
