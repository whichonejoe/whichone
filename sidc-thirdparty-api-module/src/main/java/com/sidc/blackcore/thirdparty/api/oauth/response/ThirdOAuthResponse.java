package com.sidc.blackcore.thirdparty.api.oauth.response;

/**
 * 格式依照第三方所提供
 */
public class ThirdOAuthResponse implements java.io.Serializable {
	private static final long serialVersionUID = 8010887718195648735L;
	private String token_type;
	private String access_token;
	private String refresh_token;
	private int expires_in;
	private String open_id;

	public String getToken_type() {
		return token_type;
	}

	public String getAccess_token() {
		return access_token;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public ThirdOAuthResponse withAccessToken(String accessToken) {
		this.access_token = accessToken;
		return this;
	}

	public ThirdOAuthResponse withRefreshToken(String refreshToken) {
		this.refresh_token = refreshToken;
		return this;
	}

	public ThirdOAuthResponse withExpiresIn(int expiresIn) {
		this.expires_in = expiresIn;
		return this;
	}

	public String getOpen_id() {
		return open_id;
	}

	public void setOpen_id(String open_id) {
		this.open_id = open_id;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ThirdOAuthResponse [token_type=");
		builder.append(token_type);
		builder.append(", access_token=");
		builder.append(access_token);
		builder.append(", refresh_token=");
		builder.append(refresh_token);
		builder.append(", expires_in=");
		builder.append(expires_in);
		builder.append(", open_id=");
		builder.append(open_id);
		builder.append("]");
		return builder.toString();
	}

	public ThirdOAuthResponse(String token_type, String access_token, String refresh_token, int expires_in) {
		super();
		this.token_type = token_type;
		this.access_token = access_token;
		this.refresh_token = refresh_token;
		this.expires_in = expires_in;
	}

	public ThirdOAuthResponse(String token_type, String access_token, String refresh_token, int expires_in,
			String open_id) {
		super();
		this.token_type = token_type;
		this.access_token = access_token;
		this.refresh_token = refresh_token;
		this.expires_in = expires_in;
		this.open_id = open_id;
	}

	public ThirdOAuthResponse(String token_type, String access_token, int expires_in) {
		super();
		this.token_type = token_type;
		this.access_token = access_token;
		this.expires_in = expires_in;
	}

	public ThirdOAuthResponse(String token_type) {
		super();
		this.token_type = token_type;
	}

}
