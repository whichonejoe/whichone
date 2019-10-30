package com.sidc.blackcore.thirdparty.api.oauth.request;

public class LoginOAuthRequest implements java.io.Serializable {
	private static final long serialVersionUID = -8462295092393330398L;
	private String id;
	private String password;

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginOAuthRequest [id=");
		builder.append(id);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

	public LoginOAuthRequest(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
}
