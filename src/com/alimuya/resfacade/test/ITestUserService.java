package com.alimuya.resfacade.test;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface ITestUserService {
	@GET("/user/{id}")
	public TestUser loadUser(@Path("id") int id);
	@POST("/user")
	public TestUser newUser(@Body TestUser testUser);
	
	
}
