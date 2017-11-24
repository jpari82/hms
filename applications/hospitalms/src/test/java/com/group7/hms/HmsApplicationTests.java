package com.group7.hms;

/*
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HmsApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("Test started ----->>>>>>>>");
	}

}
*/

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;

		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.test.context.SpringBootTest;
		import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
		import org.springframework.boot.test.web.client.TestRestTemplate;
		import org.springframework.test.context.junit4.SpringRunner;

		import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HmsApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void exampleTest() {
		String body = this.restTemplate.getForObject("/", String.class);
		System.out.println("Test started ----->>>>>>>>");
		MatcherAssert.assertThat(body, containsString("Welcome to Hospital Management System By Group 7 : Richa"));

	}

}

