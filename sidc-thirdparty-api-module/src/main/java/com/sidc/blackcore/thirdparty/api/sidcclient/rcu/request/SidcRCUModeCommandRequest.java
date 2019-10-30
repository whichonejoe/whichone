package com.sidc.blackcore.thirdparty.api.sidcclient.rcu.request;

import java.io.Serializable;

import com.sidc.blackcore.thirdparty.api.sidcclient.rcu.bean.SidcRCUSwitchBean;

public class SidcRCUModeCommandRequest implements Serializable {
	private static final long serialVersionUID = 6119843968722904371L;
	private String token;
	private String modename;
	private SidcRCUSwitchBean data;

	public String getToken() {
		return token;
	}

	public String getModename() {
		return modename;
	}

	public SidcRCUSwitchBean getData() {
		return data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SidcRCUModeCommandRequest [token=");
		builder.append(token);
		builder.append(", modename=");
		builder.append(modename);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}

	public SidcRCUModeCommandRequest(String token, String modename, SidcRCUSwitchBean data) {
		super();
		this.token = token;
		this.modename = modename;
		this.data = data;
	}

}
