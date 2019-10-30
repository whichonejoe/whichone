package com.sidc.blackcore.thirdparty.api.oauth.response;

public class OAuthResponse implements java.io.Serializable {
	private static final long serialVersionUID = 8200534268322547148L;
	private String tokentype;
	private String accesstoken;
	private String refreshtoken;
	private int expiresin;

	public String getTokentype() {
		return tokentype;
	}

	public String getAccesstoken() {
		return accesstoken;
	}

	public String getRefreshtoken() {
		return refreshtoken;
	}

	public int getExpiresin() {
		return expiresin;
	}

	public OAuthResponse(String accesstoken, int expiresin) {
		super();
		this.accesstoken = accesstoken;
		this.expiresin = expiresin;
	}

}
