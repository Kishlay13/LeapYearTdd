package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

@ActiveProfiles({ "test" })
public class LeapControllerTest {
	@Autowired
	private RestTemplate restTemplate;
	// 1200

	private final String URI = "http://localhost:8881/home?year=%s";

	@Test
	void contextLoads() {
	}

	@Test
	public void checkLeapOrNotTest_DivisibleBy4() {
		String url = String.format(URI, "1200");
		System.out.println(url);
		boolean result = restTemplate.getForObject(url, boolean.class);
		assertTrue(result);
	}
	@Test
	public void checkLeapOrNotTest_DivisibleBy400() {
		String url = String.format(URI, "1200");
		System.out.println(url);
		boolean result = restTemplate.getForObject(url, boolean.class);
		assertTrue(result);
	}
	@Test
	public void checkLeapOrNotTest_DivisibleBy100And400() {
		String url = String.format(URI, "2000");
		System.out.println(url);
		boolean result = restTemplate.getForObject(url, boolean.class);
		assertTrue(result);
	}
	@Test
	public void checkLeapOrNotTest_DivisibleBy100Not400() {
		String url = String.format(URI, "1700");
		System.out.println(url);
		boolean result = restTemplate.getForObject(url, boolean.class);
		
		assertFalse(result);
	}


}
