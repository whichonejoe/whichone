package com.sidc.blackcore.thirdparty.api.oauth.bean;

public class OAuthAuthorizationBean implements java.io.Serializable {
	private static final long serialVersionUID = 7237774139828355388L;
	private String clientid;
	private String clientsecret;
	private String granttype;
	private String redirecturl;
	private String code;
	private String refreshtoken;

	public OAuthAuthorizationBean withClientid(String clientid) {
		this.clientid = clientid;
		return this;
	}

	public OAuthAuthorizationBean withClientsecret(String clientsecret) {
		this.clientsecret = clientsecret;
		return this;
	}

	public OAuthAuthorizationBean withGranttype(String granttype) {
		this.granttype = granttype;
		return this;
	}

	public OAuthAuthorizationBean withRedirecturi(String redirecturl) {
		this.redirecturl = redirecturl;
		return this;
	}

	public OAuthAuthorizationBean withCode(String code) {
		this.code = code;
		return this;
	}

	public OAuthAuthorizationBean withRefreshtoken(String refreshtoken) {
		this.refreshtoken = refreshtoken;
		return this;
	}

	public String getClientid() {
		return clientid;
	}

	public String getClientsecret() {
		return clientsecret;
	}

	public String getGranttype() {
		return granttype;
	}

	public String getRedirecturl() {
		return redirecturl;
	}

	public String getCode() {
		return code;
	}

	public String getRefreshtoken() {
		return refreshtoken;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OAuthAuthorizationBean [clientid=");
		builder.append(clientid);
		builder.append(", clientsecret=");
		builder.append(clientsecret);
		builder.append(", granttype=");
		builder.append(granttype);
		builder.append(", redirecturl=");
		builder.append(redirecturl);
		builder.append(", code=");
		builder.append(code);
		builder.append(", refreshtoken=");
		builder.append(refreshtoken);
		builder.append("]");
		return builder.toString();
	}

}
