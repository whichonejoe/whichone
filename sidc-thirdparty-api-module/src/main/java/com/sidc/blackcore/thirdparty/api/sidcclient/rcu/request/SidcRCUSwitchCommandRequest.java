package com.sidc.blackcore.thirdparty.api.sidcclient.rcu.request;

import java.io.Serializable;

import com.sidc.blackcore.thirdparty.api.sidcclient.rcu.bean.SidcRCUSwitchBean;

public class SidcRCUSwitchCommandRequest implements Serializable {
	private static final long serialVersionUID = -926711228433027931L;
	private String token;
	private String keycode;
	private SidcRCUSwitchBean data;

	public String getToken() {
		return token;
	}

	public String getKeycode() {
		return keycode;
	}

	public SidcRCUSwitchBean getData() {
		return data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SidcRCUSwitchCommandRequest [token=");
		builder.append(token);
		builder.append(", keycode=");
		builder.append(keycode);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}

	public SidcRCUSwitchCommandRequest(String token, String keycode, SidcRCUSwitchBean data) {
		super();
		this.token = token;
		this.keycode = keycode;
		this.data = data;
	}

}
