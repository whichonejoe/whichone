package com.sidc.blackcore.thirdparty.api.deviceallocation.bean;

public class ThirdPartyDeviceLocationBean implements java.io.Serializable {
	private static final long serialVersionUID = 4941995034748382942L;
	private int locationid;
	private String location;

	public int getLocationid() {
		return locationid;
	}

	public String getLocation() {
		return location;
	}

	public ThirdPartyDeviceLocationBean(int locationid, String location) {
		super();
		this.locationid = locationid;
		this.location = location;
	}
}
