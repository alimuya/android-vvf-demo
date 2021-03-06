package com.alimuya.resfacade.test.spring;

import java.nio.charset.Charset;
import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.alimuya.resfacade.restful.AnnExclusionStrategy;
import com.alimuya.resfacade.test.TestUser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SpringTest {
	public static final String ENDPOINT = "http://192.168.10.58/fixcon/frontend/vvf";
	private HttpHeaders requestHeaders;
	private RestTemplate restTemplate;

	{
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setAccept(Collections.singletonList(new MediaType("application", "json")));
		this.restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter(Charset.forName("utf-8")));
//		restTemplate.setRequestFactory(new OkHttpRequestFactory());
	}


	public TestUser load(int id) {
		String url = ENDPOINT + "/user/{id}";
		HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
		ResponseEntity<String> result = restTemplate.exchange(url,
				HttpMethod.GET, requestEntity, String.class, id);
		String body = result.getBody();
		Gson gson=new GsonBuilder()
		.enableComplexMapKeySerialization()
		.setExclusionStrategies(new AnnExclusionStrategy())
		.create();
		TestUser obj=gson.fromJson(body, TestUser.class);
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
