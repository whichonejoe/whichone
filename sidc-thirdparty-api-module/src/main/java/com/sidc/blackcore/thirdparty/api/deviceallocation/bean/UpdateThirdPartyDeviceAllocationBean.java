package com.sidc.blackcore.thirdparty.api.deviceallocation.bean;

public class UpdateThirdPartyDeviceAllocationBean implements java.io.Serializable {
	private static final long serialVersionUID = 7670823314857867984L;
	private int deviceid;
	private String roomno;
	private int locationid;

	public int getDeviceid() {
		return deviceid;
	}

	public String getRoomno() {
		return roomno;
	}

	public int getLocationid() {
		return locationid;
	}

	public UpdateThirdPartyDeviceAllocationBean(int deviceid, String roomno, int locationid) {
		super();
		this.deviceid = deviceid;
		this.roomno = roomno;
		this.locationid = locationid;
	}
}
