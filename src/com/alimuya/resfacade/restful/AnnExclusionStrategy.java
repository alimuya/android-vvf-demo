package com.alimuya.resfacade.restful;

import com.alimuya.resfacade.annotation.ResField;
import com.alimuya.resfacade.annotation.RestRemote;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

/**
 * @author ov_alimuya
 *
 */
public class AnnExclusionStrategy implements ExclusionStrategy{

	@Override
	public boolean shouldSkipClass(Class<?> clazz) {
		RestRemote ann = clazz.getAnnotation(RestRemote.class);
		return ann==null;
	}

	@Override
	public boolean shouldSkipField(FieldAttributes fieldAttributes) {
		ResField res = fieldAttributes.getAnnotation(ResField.class);
		return res==null;
	}

}
