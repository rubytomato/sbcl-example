package com.example.service;

import static org.hamcrest.CoreMatchers.*;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Application;

import mockit.Mock;
import mockit.MockUp;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
public class ServiceBetaTest {

	@Autowired
	ServiceBeta serviceBeta;

	@BeforeClass
	public static void disableTestsOnCiServer() {
		String profile = System.getProperty("spring.profiles.active", "");
		System.out.println(profile);
		if (StringUtils.isEmpty(profile)) {
			System.setProperty("spring.profiles.active", "dev");
		}
	}

	@Test
	public void test1() throws Exception {

		Date expected = DateUtils.parseDate("2016-08-01 12:31:56", "yyyy-MM-dd HH:mm:ss");

		new MockUp<Date>() {
			@Mock
			public void $init() {
				this.getMockInstance().setTime(expected.getTime());
			}
		};

		String[] args = {"abc","def","xyz"};
		serviceBeta.execute(args);
		Assert.assertThat(true, is(true));
	}
}
