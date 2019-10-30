package com.sidc.blackcore.thirdparty.api.oauth.request;

public class CreateTokenWithSimpleGuestPointsRequest implements java.io.Serializable {
	private static final long serialVersionUID = 7621890143824553912L;
	private String clientid;
	private String clientsecret;
	private String granttype;
	private String roomno;
	private String firstname;
	private String lastname;

	public String getClientid() {
		return clientid;
	}

	public String getClientsecret() {
		return clientsecret;
	}

	public String getGranttype() {
		return granttype;
	}

	public String getRoomno() {
		return roomno;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreateTokenWithSimpleGuestPointsRequest [clientid=");
		builder.append(clientid);
		builder.append(", clientsecret=");
		builder.append(clientsecret);
		builder.append(", granttype=");
		builder.append(granttype);
		builder.append(", roomno=");
		builder.append(roomno);
		builder.append(", firstname=");
		builder.append(firstname);
		builder.append(", lastname=");
		builder.append(lastname);
		builder.append("]");
		return builder.toString();
	}

	public CreateTokenWithSimpleGuestPointsRequest(String clientid, String clientsecret, String granttype,
			String roomno, String firstname, String lastname) {
		super();
		this.clientid = clientid;
		this.clientsecret = clientsecret;
		this.granttype = granttype;
		this.roomno = roomno;
		this.firstname = firstname;
		this.lastname = lastname;
	}

}
