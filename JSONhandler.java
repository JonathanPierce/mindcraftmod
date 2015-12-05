package com.example.examplemod;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class JSONhandler {

    public static void sendJSON(int instanceId, String eventName, String args) {
    	  try{
    		  String json = "{\"experiment\": \"ProbMatch\", \"subject\":" + instanceId + 
    				  ", \"event\": \"" + eventName + "\", \"args\": " + args + "}";
    		  System.out.println("\n\n\n" + json + "\n\n\n");
    		  
    		  CloseableHttpClient httpclient = HttpClients.createDefault();
    		  HttpPost httppost = new HttpPost("http://localhost:1337/save");
    		  
    		  StringEntity body = new StringEntity(json);
    		  
    		  httppost.addHeader("content-type", "text/json");
    		  httppost.setEntity(body);
    		  httpclient.execute(httppost);
    	  } catch(Exception ex) {
    		  System.out.println("HTTP POST FAILED.\n\n\n");
    	  }
    	  
      }
}
