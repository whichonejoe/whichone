package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.util.List;

public class GoogleActionsInputPayloadBean implements java.io.Serializable {
	private static final long serialVersionUID = -8103653429809355765L;
	private List<GoogleActionsInputPayloadCommandsBean> commands;
	private List<GoogleActionsPayloadDevicesBean> devices;

	public List<GoogleActionsPayloadDevicesBean> getDevices() {
		return devices;
	}

	public List<GoogleActionsInputPayloadCommandsBean> getCommands() {
		return commands;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsInputPayloadBean [commands=");
		builder.append(commands);
		builder.append(", devices=");
		builder.append(devices);
		builder.append("]");
		return builder.toString();
	}

}
