package com.alimuya.resfacade.test.okhttp;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class AnnExclusionStrategy implements ExclusionStrategy{

	@Override
	public boolean shouldSkipClass(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shouldSkipField(FieldAttributes arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
