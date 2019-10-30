package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

public class ASUSSpeakerIntentionIDLocationBean implements java.io.Serializable {
	private static final long serialVersionUID = 1174569593369357094L;
	private ASUSSpeakerIntentionIDLocationDeviceBean Device;

	public ASUSSpeakerIntentionIDLocationDeviceBean getDevice() {
		return Device;
	}

	public ASUSSpeakerIntentionIDLocationBean(ASUSSpeakerIntentionIDLocationDeviceBean device) {
		super();
		Device = device;
	}

}
