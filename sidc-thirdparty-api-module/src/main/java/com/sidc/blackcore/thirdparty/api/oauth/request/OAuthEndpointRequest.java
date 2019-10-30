package com.sidc.blackcore.thirdparty.api.oauth.request;

public class OAuthEndpointRequest implements java.io.Serializable {
	private static final long serialVersionUID = 6388598576932707619L;
	private String clientid;
	private String state;
	private String redirecturl;
	private String responsetype;
	private String roomno;

	public String getClientid() {
		return clientid;
	}

	public String getState() {
		return state;
	}

	public String getRedirecturl() {
		return redirecturl;
	}

	public String getResponsetype() {
		return responsetype;
	}

	public String getRoomno() {
		return roomno;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OAuthEndpointRequest [clientid=");
		builder.append(clientid);
		builder.append(", state=");
		builder.append(state);
		builder.append(", redirecturl=");
		builder.append(redirecturl);
		builder.append(", responsetype=");
		builder.append(responsetype);
		builder.append(", roomno=");
		builder.append(roomno);
		builder.append("]");
		return builder.toString();
	}

	public OAuthEndpointRequest(String clientid, String state, String redirecturl, String responsetype, String roomno) {
		super();
		this.clientid = clientid;
		this.state = state;
		this.redirecturl = redirecturl;
		this.responsetype = responsetype;
		this.roomno = roomno;
	}

}
