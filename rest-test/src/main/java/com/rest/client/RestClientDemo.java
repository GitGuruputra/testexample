package com.rest.client;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

public class RestClientDemo {

	public static void main(String[] args){
		  try{
	            String url = "http://localhost:8080/rest/rservice/accout";
	            HttpClient client = new HttpClient();
	            GetMethod mPost = new GetMethod(url);
	            Header mtHeader = new Header();
	            mtHeader.setName("content-type");
	            mtHeader.setValue("application/json");
	            //mtHeader.setValue("application/json");
	            mPost.addRequestHeader(mtHeader);
	            client.executeMethod(mPost);
	            String output = mPost.getResponseBodyAsString( );
	            mPost.releaseConnection( );
	            System.out.println("output : " + output);
	        }catch(Exception e){
	        }

	}
}
