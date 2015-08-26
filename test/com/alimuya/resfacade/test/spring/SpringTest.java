package com.alimuya.resfacade.test.spring;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.alimuya.resfacade.test.TestUser;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class SpringTest {
	public static final String ENDPOINT = "http://192.168.10.58/fixcon/frontend/vvf";
	private HttpHeaders requestHeaders;
	private RestTemplate restTemplate;

	{
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setAccept(Collections.singletonList(new MediaType("application", "json")));
		

		this.restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());
//		restTemplate.setRequestFactory(new OkHttpRequestFactory());
	}


	public TestUser load(int id) {
		String url = ENDPOINT + "/user/{id}";
		HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
		ResponseEntity<TestUser> result = restTemplate.exchange(url,
				HttpMethod.GET, requestEntity, TestUser.class, id);
		TestUser obj = result.getBody();
		return obj;
	}

	public TestUser create(TestUser testUser) {
		String url = ENDPOINT + "/user";
		HttpEntity<TestUser> requestEntity = new HttpEntity<TestUser>(testUser,requestHeaders);
		ResponseEntity<TestUser> result = restTemplate.exchange(url,
				HttpMethod.POST, requestEntity, TestUser.class);
		TestUser obj = result.getBody();
		return obj;
	}
}
