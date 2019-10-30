package com.sidc.blackcore.thirdparty.api.deviceallocation.bean;

public class ThirdPartyDeviceBean implements java.io.Serializable {
	private static final long serialVersionUID = -5088937008500700848L;
	private int deviceid;
	private String device;

	public int getDeviceid() {
		return deviceid;
	}

	public String getDevice() {
		return device;
	}

	public ThirdPartyDeviceBean(int deviceid, String device) {
		super();
		this.deviceid = deviceid;
		this.device = device;
	}

}
