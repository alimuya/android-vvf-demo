package com.alimuya.resfacade.test.retrofit;

import retrofit.RestAdapter;

import com.alimuya.resfacade.test.TestUser;
import com.google.gson.JsonObject;

public class RetrofitTest {
	public static TestUser load(int id){
		RestAdapter restAdapter = new RestAdapter.Builder()
		.setLogLevel(RestAdapter.LogLevel.FULL)
	    .setEndpoint("http://192.168.10.58/fixcon/frontend/vvf")
	    .build();
		JsonObject json=new JsonObject();
		IRetrofitTestUserService service = restAdapter.create(IRetrofitTestUserService.class);
		return service.loadUser(id);
	}
	
	
	public static TestUser create(TestUser testUser){
		RestAdapter restAdapter = new RestAdapter.Builder()
		.setLogLevel(RestAdapter.LogLevel.FULL)
	    .setEndpoint("http://192.168.10.58/fixcon/frontend/vvf")
	    .build();

		IRetrofitTestUserService service = restAdapter.create(IRetrofitTestUserService.class);
		return service.newUser(testUser);
	}
}
