package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.util.HashMap;

public class GoogleActionsQueryPayloadDeviceBean implements java.io.Serializable {
	private static final long serialVersionUID = -965702732112676799L;
	private HashMap<String, GoogleActionsPayloadCommandsStatesBean> devices;

	public HashMap<String, GoogleActionsPayloadCommandsStatesBean> getDevices() {
		return devices;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ABean [devices=");
		builder.append(devices);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsQueryPayloadDeviceBean(HashMap<String, GoogleActionsPayloadCommandsStatesBean> devices) {
		super();
		this.devices = devices;
	}

}
