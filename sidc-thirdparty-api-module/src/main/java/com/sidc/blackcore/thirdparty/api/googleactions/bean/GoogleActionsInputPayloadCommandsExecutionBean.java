package com.sidc.blackcore.thirdparty.api.googleactions.bean;

public class GoogleActionsInputPayloadCommandsExecutionBean implements java.io.Serializable {
	private static final long serialVersionUID = -4576309949396772479L;
	private String command;
	private GoogleActionsInputPayloadCommandsExecutionParamsBean params;

	public String getCommand() {
		return command;
	}

	public GoogleActionsInputPayloadCommandsExecutionParamsBean getParams() {
		return params;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsInputPayloadCommandsExecutionBean [command=");
		builder.append(command);
		builder.append(", params=");
		builder.append(params);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsInputPayloadCommandsExecutionBean(String command,
			GoogleActionsInputPayloadCommandsExecutionParamsBean params) {
		super();
		this.command = command;
		this.params = params;
	}

}
