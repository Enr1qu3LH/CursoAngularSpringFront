package com.praticasp.demo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestResponse {
	
	private Integer responseCode;
	private String menssage;
	
	public RestResponse(int res) {
		super();
		this.responseCode = res;
	}
	
	public RestResponse(Integer res, String mensaje) {
		super();
		this.responseCode = res;
		this.menssage = mensaje;
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getMenssage() {
		return menssage;
	}

	public void setMenssage(String menssage) {
		this.menssage = menssage;
	}

}
