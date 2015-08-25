package com.alimuya.resfacade.test.retrofit;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

import com.alimuya.resfacade.test.TestUser;

public interface IRetrofitTestUserService {
	@GET("/user/{id}")
	public TestUser loadUser(@Path("id") int id);
	@POST("/user")
	public TestUser newUser(@Body TestUser testUser);
	
	
}
