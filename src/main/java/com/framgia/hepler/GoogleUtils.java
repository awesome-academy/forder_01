package com.framgia.hepler;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.framgia.bean.GoogleInfo;

	@Component
	public class GoogleUtils {
		public static String GOOGLE_CLIENT_ID = "650605713330-9s9j72fd23vgfqdlc380mh0re75mj7cm.apps.googleusercontent.com";
		public static String GOOGLE_CLIENT_SECRET = "AqZijoAVDVizVb8I1qOpUhIu";
		public static String GOOGLE_REDIRECT_URI = "http://localhost:8083/forder_01/login-google";
		public static String GOOGLE_LINK_GET_TOKEN = "https://accounts.google.com/o/oauth2/token";
		public static String GOOGLE_LINK_GET_USER_INFO = "https://www.googleapis.com/oauth2/v1/userinfo?access_token=";
		public static String GOOGLE_GRANT_TYPE = "authorization_code";

		public String getToken(final String code) throws ClientProtocolException, IOException {
			String response = Request.Post(GOOGLE_LINK_GET_TOKEN)
					.bodyForm(Form.form().add("client_id", GOOGLE_CLIENT_ID).add("client_secret", GOOGLE_CLIENT_SECRET)
							.add("redirect_uri", GOOGLE_REDIRECT_URI).add("code", code)
							.add("grant_type", GOOGLE_GRANT_TYPE).build())
					.execute().returnContent().asString();

			ObjectMapper mapper = new ObjectMapper();
			JsonNode node = mapper.readTree(response).get("access_token");
			return node.textValue();
		}

		public GoogleInfo getUserInfo(final String accessToken) throws ClientProtocolException, IOException {
			String link = GOOGLE_LINK_GET_USER_INFO + accessToken;
			String response = Request.Get(link).execute().returnContent().asString();
			ObjectMapper mapper = new ObjectMapper();
			GoogleInfo googleInfo = mapper.readValue(response, GoogleInfo.class);
			return googleInfo;

		}
	}
