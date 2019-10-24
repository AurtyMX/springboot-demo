package com.michelle.springbootdemo;

import com.michelle.SpringbootDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class SpringbootDemoApplicationTests {
//	@Autowired
//	@Qualifier(value ="dataSource2" )
//	private DataSource dataSource;
//	@Autowired
//	@Qualifier(value = "jdbcTemplate2")
//	private JdbcTemplate jdbcTemplate;


	@Test
	public void contextLoads() throws SQLException {
//		System.out.println(dataSource.getConnection().getClientInfo());
//		jdbcTemplate.getDataSource();
	}

}
