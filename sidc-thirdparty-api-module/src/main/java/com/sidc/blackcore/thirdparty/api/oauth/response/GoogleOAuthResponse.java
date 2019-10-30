package com.sidc.blackcore.thirdparty.api.oauth.response;

/**
 * 格式依照第三方所提供
 */
public class GoogleOAuthResponse implements java.io.Serializable {
	private static final long serialVersionUID = 8010887718195648735L;
	private String token_type;
	private String access_token;
	private String refresh_token;
	private int expires_in;

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

	public GoogleOAuthResponse withAccessToken(String accessToken) {
		this.access_token = accessToken;
		return this;
	}

	public GoogleOAuthResponse withRefreshToken(String refreshToken) {
		this.refresh_token = refreshToken;
		return this;
	}

	public GoogleOAuthResponse withExpiresIn(int expiresIn) {
		this.expires_in = expiresIn;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleOAuthResponse [token_type=");
		builder.append(token_type);
		builder.append(", access_token=");
		builder.append(access_token);
		builder.append(", refresh_token=");
		builder.append(refresh_token);
		builder.append(", expires_in=");
		builder.append(expires_in);
		builder.append("]");
		return builder.toString();
	}

	public GoogleOAuthResponse(String token_type, String access_token, String refresh_token, int expires_in) {
		super();
		this.token_type = token_type;
		this.access_token = access_token;
		this.refresh_token = refresh_token;
		this.expires_in = expires_in;
	}

	public GoogleOAuthResponse(String token_type, String access_token, int expires_in) {
		super();
		this.token_type = token_type;
		this.access_token = access_token;
		this.expires_in = expires_in;
	}

	public GoogleOAuthResponse(String token_type) {
		super();
		this.token_type = token_type;
	}

}
