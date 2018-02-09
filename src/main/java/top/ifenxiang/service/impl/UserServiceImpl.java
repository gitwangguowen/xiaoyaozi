package top.ifenxiang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.ifenxiang.mapper.UserMapper;
import top.ifenxiang.pojo.User;
import top.ifenxiang.pojo.UserExample;
import top.ifenxiang.pojo.UserExample.Criteria;
import top.ifenxiang.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean findUserIsExist(String username) {
		UserExample example = new UserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUsernameEqualTo(username);
		List<User> selectByExample = userMapper.selectByExample(example);
		if (selectByExample != null && selectByExample.size() > 0) {
			return true;
		}
		return false;
	}

}
