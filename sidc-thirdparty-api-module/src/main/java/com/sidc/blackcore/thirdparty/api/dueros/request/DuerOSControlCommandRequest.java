package com.sidc.blackcore.thirdparty.api.dueros.request;

public class DuerOSControlCommandRequest implements java.io.Serializable {
	private static final long serialVersionUID = -5061158347162578705L;
	private String token;
	private String hotelcode;
	private String serverip;
	private String serverport;
	private String roomno;
	private String headername;
	private String keycode;
	private String groupname;
	private String datavalue;

	public String getToken() {
		return token;
	}

	public String getHotelcode() {
		return hotelcode;
	}

	public String getServerip() {
		return serverip;
	}

	public String getServerport() {
		return serverport;
	}

	public String getRoomno() {
		return roomno;
	}

	public String getHeadername() {
		return headername;
	}

	public String getKeycode() {
		return keycode;
	}

	public String getGroupname() {
		return groupname;
	}

	public String getDatavalue() {
		return datavalue;
	}

	public DuerOSControlCommandRequest(String token, String hotelcode, String serverip, String serverport,
			String roomno, String headername, String keycode, String groupname, String datavalue) {
		super();
		this.token = token;
		this.hotelcode = hotelcode;
		this.serverip = serverip;
		this.serverport = serverport;
		this.roomno = roomno;
		this.headername = headername;
		this.keycode = keycode;
		this.groupname = groupname;
		this.datavalue = datavalue;
	}

}
