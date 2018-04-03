package com.basic;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Temp1 {

	public static void main(String[] args) throws IOException {
		/*System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.version"));

        System.setProperty(
                "javax.net.ssl.trustStore",
                System.getProperty("java.home") + "/lib/security/cacerts"
        );

        System.setProperty("https.proxyHost", "host");
        System.setProperty("https.proxyPort", "port");*/

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
				.url("https://api.github.com/repos/attivio/sdk/contents?ref=5.5").get().build();

		Response response = client.newCall(request).execute();
		System.out.println(response.toString());

	}

}
