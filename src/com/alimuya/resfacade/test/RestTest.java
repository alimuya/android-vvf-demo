package com.alimuya.resfacade.test;

import retrofit.RestAdapter;

public class RestTest {
	public static TestUser load(int id){
		RestAdapter restAdapter = new RestAdapter.Builder()
		.setLogLevel(RestAdapter.LogLevel.FULL)
	    .setEndpoint("http://192.168.10.58/fixcon/frontend/vvf")
	    .build();

		ITestUserService service = restAdapter.create(ITestUserService.class);
		return service.loadUser(id);
	}
	
	
	public static TestUser create(TestUser testUser){
		RestAdapter restAdapter = new RestAdapter.Builder()
		.setLogLevel(RestAdapter.LogLevel.FULL)
	    .setEndpoint("http://192.168.10.58/fixcon/frontend/vvf")
	    .build();

		ITestUserService service = restAdapter.create(ITestUserService.class);
		return service.newUser(testUser);
	}
}
