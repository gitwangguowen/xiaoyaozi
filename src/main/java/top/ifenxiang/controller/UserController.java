package top.ifenxiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.ifenxiang.pojo.User;

@Controller
public class UserController {

	@RequestMapping("/user/getUser/{id}")
	@ResponseBody
	public User getUser(@PathVariable Long id,String username) {
		System.out.println(id);
		User user = new User();
		user.setName("tom");
		user.setAge("20");
		user.setSex("男");//性别
		return user;
	}
	
	@RequestMapping("/user/setUser")
	@ResponseBody
	public User setUser(User user) {
		return user;
	}
	
}
