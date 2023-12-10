package com.evm.controller;


import java.io.IOException;
import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest_Controller {
	@GetMapping("/login")
	public String welcome()
	{
		return "Welcome to google";
	}
	
	
	@RequestMapping("https://www.googleapis.com/oauth2/v1/userinfo")
	public String getUserInfoJson(final String authCode) throws IOException {
	  //  final GoogleTokenRespons response = flow.newTokenRequest(authCode).setRedirectUri(REDIRECT_URI).execute();
	  //  final Credential credential = flow.createAndStoreCredential(response, null);
	  //  final HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory(credential);
	  //  final GenericUrl url = new GenericUrl(USER_INFO_URL);
	  //  final HttpRequest request = requestFactory.buildGetRequest(url);
	  //  request.getHeaders().setContentType("application/json");
	  //  final String jsonIdentity = request.execute().parseAsString();
	  //  return jsonIdentity;
System.out.println("az");return "a";
	}
	/*public Principal user(Principal principal)
	{
		System.out.println((String)principal.getName());
		System.out.println(principal);
		return principal;
	}*/

}
