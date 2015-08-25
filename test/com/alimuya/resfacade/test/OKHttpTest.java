package com.alimuya.resfacade.test;

import java.io.IOException;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;


public class OKHttpTest {
	public static final MediaType JSON= MediaType.parse("application/json; charset=utf-8");
	private static OkHttpClient client = new OkHttpClient();
	
	
	private String post(String url,String json) throws IOException{
		RequestBody body = RequestBody.create(JSON, json);
		  Request request = new Request.Builder()
		      .url(url)
		      .post(body)
		      .build();
		  Response response = client.newCall(request).execute();
		  return response.body().string();
	}
	
	public TestUser load(int id) {
		return null;
	}

	public TestUser create(TestUser testUser) {
		return null;
	}
}
