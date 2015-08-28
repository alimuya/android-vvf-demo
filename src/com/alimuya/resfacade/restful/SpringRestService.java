package com.alimuya.resfacade.restful;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import com.alimuya.resfacade.test.TestUser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SpringRestService {
	
	
	public static final String ENDPOINT = "http://192.168.10.58/fixcon/frontend/vvf";
	private HttpHeaders requestHeaders;
	private RestTemplate restTemplate;

	{
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setAccept(Collections.singletonList(new MediaType("application", "json")));
		this.restTemplate = new RestTemplate();
//		restTemplate.setErrorHandler(null);
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter(Charset.forName("utf-8")));
//		restTemplate.setRequestFactory(new OkHttpRequestFactory());
	}
	
	public <T> T get(Class<T> claz,String url,Object ... args){
		try {
			HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
			ResponseEntity<String> result = restTemplate.exchange(url,
					HttpMethod.GET, requestEntity, String.class, args);
			String body = result.getBody();
			Gson gson=createGson();
			T obj=gson.fromJson(body, claz);
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public <T> T post(Class<T> claz,String url,Object bean,Object ... args){
		Gson gson=this.createGson();
		String requestBody=gson.toJson(bean);
		HttpEntity<String> requestEntity = new HttpEntity<String>(requestBody,requestHeaders);
		ResponseEntity<String> result = restTemplate.exchange(url,
				HttpMethod.POST, requestEntity, String.class);
		String body = result.getBody();
		Gson responseGson=createGson();
		T obj=responseGson.fromJson(body, claz);
		return obj;
	}
	
	private Gson createGson(){
		Gson gson=new GsonBuilder()
		.enableComplexMapKeySerialization()
		.setExclusionStrategies(new AnnExclusionStrategy())
		.create();
		return gson;
	}
}
