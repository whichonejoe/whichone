package com.sidc.blackcore.thirdparty.api.asus.speaker.request;

import java.util.List;

import com.sidc.blackcore.thirdparty.api.asus.speaker.bean.ASUSSpeakerInsertDeviceBean;

public class ASUSSpeakerInsertDeviceRequest implements java.io.Serializable {
	private static final long serialVersionUID = -8779225760815839856L;
	private List<ASUSSpeakerInsertDeviceBean> devices;

	public List<ASUSSpeakerInsertDeviceBean> getDevices() {
		return devices;
	}

	public ASUSSpeakerInsertDeviceRequest(List<ASUSSpeakerInsertDeviceBean> devices) {
		super();
		this.devices = devices;
	}
}
