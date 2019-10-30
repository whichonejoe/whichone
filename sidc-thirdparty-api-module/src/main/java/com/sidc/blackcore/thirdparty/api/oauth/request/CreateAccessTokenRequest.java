package com.sidc.blackcore.thirdparty.api.oauth.request;

public class CreateAccessTokenRequest implements java.io.Serializable {
	private static final long serialVersionUID = 6512722884026725067L;
	private String clientid;
	private String clientsecret;
	private String granttype;
	private String redirecturl;

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

	public CreateAccessTokenRequest(String clientid, String clientsecret, String granttype, String redirecturl) {
		super();
		this.clientid = clientid;
		this.clientsecret = clientsecret;
		this.granttype = granttype;
		this.redirecturl = redirecturl;
	}

}
