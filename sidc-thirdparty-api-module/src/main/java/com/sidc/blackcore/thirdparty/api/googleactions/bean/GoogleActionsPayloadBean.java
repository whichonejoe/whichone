package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.util.List;

public class GoogleActionsPayloadBean implements java.io.Serializable {
	private static final long serialVersionUID = -535925069199243050L;
	private String agentUserId;
	private List<GoogleActionsPayloadDevicesBean> devices;
	private List<GoogleActionsPayloadCommandsBean> commands;

	public String getAgentUserId() {
		return agentUserId;
	}

	public List<GoogleActionsPayloadDevicesBean> getDevices() {
		return devices;
	}

	public List<GoogleActionsPayloadCommandsBean> getCommands() {
		return commands;
	}

	public GoogleActionsPayloadBean withAgentUserId(String agentUserId) {
		this.agentUserId = agentUserId;
		return this;
	}

	public GoogleActionsPayloadBean withDevices(List<GoogleActionsPayloadDevicesBean> devices) {
		this.devices = devices;
		return this;
	}

	public GoogleActionsPayloadBean withCommands(List<GoogleActionsPayloadCommandsBean> commands) {
		this.commands = commands;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadBean [agentUserId=");
		builder.append(agentUserId);
		builder.append(", devices=");
		builder.append(devices);
		builder.append(", commands=");
		builder.append(commands);
		builder.append("]");
		return builder.toString();
	}

}
