package com.alimuya.resfacade.restful;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.ResponseErrorHandler;

public class CustomResponseErrorHandler implements ResponseErrorHandler {
	private ResponseErrorHandler errorHandler = new DefaultResponseErrorHandler();

    public boolean hasError(ClientHttpResponse response) throws IOException {
        return errorHandler.hasError(response);
    }

    public void handleError(ClientHttpResponse response) throws IOException {
//    	response.getBody().
//        String theString = IOUtils.toString(response.getBody());
//        CustomException exception = new CustomException();
//        Map<String, Object> properties = new HashMap<String, Object>();
//        properties.put("code", response.getStatusCode().toString());
//        properties.put("body", theString);
//        properties.put("header", response.getHeaders());
//        exception.setProperties(properties);
//        throw exception;
    }
}
