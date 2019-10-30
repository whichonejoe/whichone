package com.sidc.blackcore.thirdparty.api.dueros.bean;

public class DuerOSOAuthAuthorizationBean implements java.io.Serializable {
	private static final long serialVersionUID = -268202770370340019L;
	private String clientid;
	private String clientsecret;
	private String granttype;
	private String redirecturl;
	private String code;

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

	public DuerOSOAuthAuthorizationBean withClientid(String clientid) {
		this.clientid = clientid;
		return this;
	}

	public DuerOSOAuthAuthorizationBean withClientsecret(String clientsecret) {
		this.clientsecret = clientsecret;
		return this;
	}

	public DuerOSOAuthAuthorizationBean withGranttype(String granttype) {
		this.granttype = granttype;
		return this;
	}

	public DuerOSOAuthAuthorizationBean withRedirecturi(String redirecturl) {
		this.redirecturl = redirecturl;
		return this;
	}

	public DuerOSOAuthAuthorizationBean withCode(String code) {
		this.code = code;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSOAuthAuthorizationBean [clientid=");
		builder.append(clientid);
		builder.append(", clientsecret=");
		builder.append(clientsecret);
		builder.append(", granttype=");
		builder.append(granttype);
		builder.append(", redirecturl=");
		builder.append(redirecturl);
		builder.append(", code=");
		builder.append(code);
		builder.append("]");
		return builder.toString();
	}

}
