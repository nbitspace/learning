package com.nbit.learn;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpReq {

    public static void httpRequest() {
    	try {
	    	HttpClient httpClient = HttpClients.createDefault();
	        HttpGet request = new HttpGet("https://twitter.com/actorvijay");
	        request.addHeader("Authorization", "Bearer jsknonrgregkasdfgads");
	        HttpResponse response = httpClient.execute(request);
	        String responseBody = EntityUtils.toString(response.getEntity());
	        System.out.println(responseBody);
    	}
    	catch (Exception e) {
    		System.out.println(e);
    	}
    }
    
    public static void httpPostRequest() throws Exception {
    	HttpClient httpClient = HttpClients.createDefault();
        HttpPost request = new HttpPost("https://www.example.com/api");
        StringEntity params = new StringEntity("{\"name\":\"John\", \"age\":30}");
        request.addHeader("content-type", "application/json");
        request.setEntity(params);
        HttpResponse response = httpClient.execute(request);
        String responseBody = EntityUtils.toString(response.getEntity());
        System.out.println(responseBody);

    }
}
