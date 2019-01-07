package test;

import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.cj.jdbc.Driver;


public class SimpleTestCase {
	
	/*BasicDataSource a;*/
	MapperScannerConfigurer msc;
	SqlSessionFactoryBean ssfb;
	Driver driver;
	
	@Test
	public void getConnection() throws SQLException{
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring-dao.xml");
		
		BasicDataSource basicDataSource = ac.getBean("dataSource",BasicDataSource.class);
		
		System.out.println(basicDataSource.getConnection());
		
		ac.close();
	}
}
