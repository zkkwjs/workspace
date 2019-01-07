package cn.tedu.mybatis.mapper;

import java.util.List;

import cn.tedu.mybatis.entity.Apply;
import cn.tedu.mybatis.entity.User;

public interface UserMapper {

	Integer insert(User user);
	List<User> findAll();
	Integer delete(int id);
	List<Apply> findAllApply();
	User findByUserName(String username);
	Integer deleteapply(int id);
}
