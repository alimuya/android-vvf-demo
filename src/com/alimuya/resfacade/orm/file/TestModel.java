package com.alimuya.resfacade.orm.file;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttpRequestFactory;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;


public class TestModel extends FileOrmModel{
	public static void main(String[] args) {
		// The connection URL 
		String url = "https://ajax.googleapis.com/ajax/" + 
		    "services/search/web?v=1.0&q={query}";
		
		
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setAccept(Collections.singletonList(new MediaType("application","json")));
		HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
		// Create a new RestTemplate instance
		RestTemplate restTemplate = new RestTemplate(new OkHttpRequestFactory());

		// Add the String message converter
		restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());
		restTemplate.setRequestFactory(new OkHttpRequestFactory());

		// Make the HTTP GET request, marshaling the response to a String
		ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.GET,requestEntity,String.class, "Android");
		
		result.getBody();
	}
}
