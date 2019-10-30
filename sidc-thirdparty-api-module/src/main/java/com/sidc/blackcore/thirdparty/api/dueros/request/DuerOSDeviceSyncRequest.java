package com.sidc.blackcore.thirdparty.api.dueros.request;

public class DuerOSDeviceSyncRequest implements java.io.Serializable {
	private static final long serialVersionUID = 8316696079372192647L;
	private String hotelcode;
	private String serverip;
	private String serverport;
	private String roomno;

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

	public DuerOSDeviceSyncRequest(String hotelcode, String serverip, String serverport, String roomno) {
		super();
		this.hotelcode = hotelcode;
		this.serverip = serverip;
		this.serverport = serverport;
		this.roomno = roomno;
	}

}
