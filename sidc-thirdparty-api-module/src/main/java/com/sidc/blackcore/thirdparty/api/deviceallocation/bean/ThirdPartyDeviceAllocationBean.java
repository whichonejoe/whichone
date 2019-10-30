package com.sidc.blackcore.thirdparty.api.deviceallocation.bean;

public class ThirdPartyDeviceAllocationBean implements java.io.Serializable {
	private static final long serialVersionUID = -2065253143326156647L;
	private String deviceid;
	private String device;
	private String roomno;
	private int locationid;
	private String location;

	public String getDeviceid() {
		return deviceid;
	}

	public String getRoomno() {
		return roomno;
	}

	public String getLocation() {
		return location;
	}

	public String getDevice() {
		return device;
	}

	public int getLocationid() {
		return locationid;
	}

	public ThirdPartyDeviceAllocationBean(String deviceid, String device, String roomno, int locationid, String location) {
		super();
		this.deviceid = deviceid;
		this.device = device;
		this.roomno = roomno;
		this.locationid = locationid;
		this.location = location;
	}

	public ThirdPartyDeviceAllocationBean(String deviceid, String roomno, int locationid) {
		super();
		this.deviceid = deviceid;
		this.roomno = roomno;
		this.locationid = locationid;
	}

}
