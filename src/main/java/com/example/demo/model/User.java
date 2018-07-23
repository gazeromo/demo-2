package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	private String accessToken;
	private Account account;
	@JsonProperty(value = "access_token")
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}
