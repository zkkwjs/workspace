package test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.mybatis.entity.Apply;
import cn.tedu.mybatis.entity.User;
import cn.tedu.mybatis.mapper.UserMapper;

public class UserMapperTestCase {
	
	private AbstractApplicationContext ac;
	private UserMapper userMapper;

	@Before
	public void doBefore(){
		ac = new ClassPathXmlApplicationContext("spring-dao.xml");
		userMapper = ac.getBean("userMapper",UserMapper.class);
	}

	@After
	public void After(){
		ac.close();
	}
	
	@Test
	public void insert(){
		User user = new User();
		user.setUsername("root");
		user.setPassword("20170419jl");
		user.setAge(31);
		user.setPhone("13900139001");
		user.setEmail("45643");
		System.out.println(user);
		Integer rows = userMapper.insert(user);
		System.out.println("rows="+rows);
		System.out.println(user);
	}
	
	@Test
	public void findAll(){
		List<User> users = userMapper.findAll();
		for (User user : users) {
			System.out.println(user);
		}
		
	}
	
	@Test
	public void findByUserName(){
		
		User user = userMapper.findByUserName("Сһһ");
		System.out.println(user);
		
	}
	
	@Test
	public void findAllApply(){
		
		List<Apply> applys = userMapper.findAllApply();
		for (Apply apply : applys) {
			System.out.println(apply);
		}
		
	}
	
	@Test
	public void delete(){
		
		Integer a = userMapper.delete(9);
		System.out.println(a);
		
	}
	
}
