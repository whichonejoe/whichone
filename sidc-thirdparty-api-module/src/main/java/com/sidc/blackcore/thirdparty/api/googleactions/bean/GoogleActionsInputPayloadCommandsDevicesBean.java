package com.sidc.blackcore.thirdparty.api.googleactions.bean;

public class GoogleActionsInputPayloadCommandsDevicesBean implements java.io.Serializable {
	private static final long serialVersionUID = 5658395945923981294L;
	private String id;
	private GoogleActionsPayloadDevicesCustomDataBean customData;

	public String getId() {
		return id;
	}

	public GoogleActionsPayloadDevicesCustomDataBean getCustomData() {
		return customData;
	}

	public GoogleActionsInputPayloadCommandsDevicesBean(String id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsInputPayloadCommandsDevicesBean [id=");
		builder.append(id);
		builder.append(", customData=");
		builder.append(customData);
		builder.append("]");
		return builder.toString();
	}

}
