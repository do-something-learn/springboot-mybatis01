package com.duhong.springbootmybatis;

import com.duhong.springbootmybatis.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {
    @Autowired
	private UserDao bookDao;
	@Test
	void contextLoads() {
		System.out.println(bookDao.getById(1));
	}

}
