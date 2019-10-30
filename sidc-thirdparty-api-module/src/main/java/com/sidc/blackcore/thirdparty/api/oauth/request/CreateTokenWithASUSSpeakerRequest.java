package com.sidc.blackcore.thirdparty.api.oauth.request;

public class CreateTokenWithASUSSpeakerRequest implements java.io.Serializable {
	private static final long serialVersionUID = 8645889467046382579L;
	private String clientid;
	private String clientsecret;
	private String granttype;

	public String getClientid() {
		return clientid;
	}

	public String getClientsecret() {
		return clientsecret;
	}

	public String getGranttype() {
		return granttype;
	}

	public CreateTokenWithASUSSpeakerRequest(String clientid, String clientsecret, String granttype) {
		super();
		this.clientid = clientid;
		this.clientsecret = clientsecret;
		this.granttype = granttype;
	}

}
