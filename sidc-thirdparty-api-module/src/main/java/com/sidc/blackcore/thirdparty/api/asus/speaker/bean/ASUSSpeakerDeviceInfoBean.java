package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

public class ASUSSpeakerDeviceInfoBean implements java.io.Serializable {
	private static final long serialVersionUID = 3606496252847716402L;
	private String roomno;
	private String deviceid;

	public String getRoomno() {
		return roomno;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public ASUSSpeakerDeviceInfoBean withRoomno(String roomno) {
		this.roomno = roomno;
		return this;
	}

	public ASUSSpeakerDeviceInfoBean withDeviceid(String deviceid) {
		this.deviceid = deviceid;
		return this;
	}

	public ASUSSpeakerDeviceInfoBean(String deviceid) {
		super();
		this.deviceid = deviceid;
	}

}
