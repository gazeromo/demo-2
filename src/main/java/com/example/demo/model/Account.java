package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
	private Long id;
	private String serviceName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@JsonProperty(value = "service_name")
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}
