package com.nt.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;



public class WelcomeResourceClient {

	public static void main(String[] args)throws Exception {
		String resUrl="http://localhost:8080/Rest01-firstApp/rest/welcome/welcomes";
		URL url=new URL(resUrl);
		HttpURLConnection httpCon=(HttpURLConnection)url.openConnection();
		httpCon.setRequestMethod("GET");
		
		int statusCode=httpCon.getResponseCode();
		if(statusCode==200) {
			InputStream is=httpCon.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
		    System.out.println(br.readLine());
		}else {
			System.out.println("failed to invoke");
		}

	}

}
