package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.util.List;

public class GoogleActionsInputPayloadCommandsBean implements java.io.Serializable {
	private static final long serialVersionUID = 8444808317037389201L;
	private List<GoogleActionsInputPayloadCommandsDevicesBean> devices;
	private List<GoogleActionsInputPayloadCommandsExecutionBean> execution;

	public List<GoogleActionsInputPayloadCommandsDevicesBean> getDevices() {
		return devices;
	}

	public List<GoogleActionsInputPayloadCommandsExecutionBean> getExecution() {
		return execution;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsInputPayloadCommandsBean [devices=");
		builder.append(devices);
		builder.append(", execution=");
		builder.append(execution);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsInputPayloadCommandsBean(List<GoogleActionsInputPayloadCommandsDevicesBean> devices,
			List<GoogleActionsInputPayloadCommandsExecutionBean> execution) {
		super();
		this.devices = devices;
		this.execution = execution;
	}

}
