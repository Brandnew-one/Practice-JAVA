package com.sprint1.lotto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;

public class Lotto {

  // create a client
  var client = HttpClient.newHttpClient();

  // create a request
  var request = HttpRequest.newBuilder(
      URI.create("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY")
      )
      .header("accept", "application/json")
      .build();

  // use the client to send the request
  var response = client.send(request, new JsonBodyHandler<>(APOD.class));

// the response:
  System.out.println(response.body().get().title);

  public static void main(String[] args) {

  }
}
