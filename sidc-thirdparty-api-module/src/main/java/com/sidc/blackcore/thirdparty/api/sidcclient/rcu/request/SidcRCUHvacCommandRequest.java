package com.sidc.blackcore.thirdparty.api.sidcclient.rcu.request;

import java.io.Serializable;

import com.sidc.blackcore.thirdparty.api.sidcclient.rcu.bean.SidcRCUHvacBean;

public class SidcRCUHvacCommandRequest implements Serializable {
	private static final long serialVersionUID = -6421026018179140394L;
	private String token;
	private String keycode;
	private SidcRCUHvacBean data;

	public String getToken() {
		return token;
	}

	public String getKeycode() {
		return keycode;
	}

	public SidcRCUHvacBean getData() {
		return data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SidcRCUHvacCommandRequest [token=");
		builder.append(token);
		builder.append(", keycode=");
		builder.append(keycode);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}

	public SidcRCUHvacCommandRequest(String token, String keycode, SidcRCUHvacBean data) {
		super();
		this.token = token;
		this.keycode = keycode;
		this.data = data;
	}

}
