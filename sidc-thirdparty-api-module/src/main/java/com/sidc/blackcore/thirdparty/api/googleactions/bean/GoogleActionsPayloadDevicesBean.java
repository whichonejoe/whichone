package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.util.List;

public class GoogleActionsPayloadDevicesBean implements java.io.Serializable {
	private static final long serialVersionUID = 1137549963187311977L;
	private String id;
	private String type;
	private List<String> traits;
	private GoogleActionsPayloadDevicesNameBean name;
	private boolean willReportState;
	private GoogleActionsPayloadDevicesAttributesBean attributes;
	private GoogleActionsPayloadDevicesInfoBean deviceInfo;
	private GoogleActionsPayloadDevicesCustomDataBean customData;

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public List<String> getTraits() {
		return traits;
	}

	public GoogleActionsPayloadDevicesNameBean getName() {
		return name;
	}

	public boolean isWillReportState() {
		return willReportState;
	}

	public GoogleActionsPayloadDevicesAttributesBean getAttributes() {
		return attributes;
	}

	public GoogleActionsPayloadDevicesInfoBean getDeviceInfo() {
		return deviceInfo;
	}

	public GoogleActionsPayloadDevicesCustomDataBean getCustomData() {
		return customData;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadDevicesBean [id=");
		builder.append(id);
		builder.append(", type=");
		builder.append(type);
		builder.append(", traits=");
		builder.append(traits);
		builder.append(", name=");
		builder.append(name);
		builder.append(", willReportState=");
		builder.append(willReportState);
		builder.append(", attributes=");
		builder.append(attributes);
		builder.append(", deviceInfo=");
		builder.append(deviceInfo);
		builder.append(", customData=");
		builder.append(customData);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsPayloadDevicesBean(String id, String type, List<String> traits,
			GoogleActionsPayloadDevicesNameBean name, boolean willReportState,
			GoogleActionsPayloadDevicesAttributesBean attributes, GoogleActionsPayloadDevicesInfoBean deviceInfo,
			GoogleActionsPayloadDevicesCustomDataBean customData) {
		super();
		this.id = id;
		this.type = type;
		this.traits = traits;
		this.name = name;
		this.willReportState = willReportState;
		this.attributes = attributes;
		this.deviceInfo = deviceInfo;
		this.customData = customData;
	}

	public GoogleActionsPayloadDevicesBean(String id, String type, List<String> traits,
			GoogleActionsPayloadDevicesNameBean name, boolean willReportState) {
		super();
		this.id = id;
		this.type = type;
		this.traits = traits;
		this.name = name;
		this.willReportState = willReportState;
	}

	public GoogleActionsPayloadDevicesBean(String id, String type, List<String> traits,
			GoogleActionsPayloadDevicesNameBean name, boolean willReportState,
			GoogleActionsPayloadDevicesCustomDataBean customData) {
		super();
		this.id = id;
		this.type = type;
		this.traits = traits;
		this.name = name;
		this.willReportState = willReportState;
		this.customData = customData;
	}

	public GoogleActionsPayloadDevicesBean(String id, String type, List<String> traits,
			GoogleActionsPayloadDevicesNameBean name, boolean willReportState,
			GoogleActionsPayloadDevicesCustomDataBean customData,
			GoogleActionsPayloadDevicesAttributesBean attributes) {
		super();
		this.id = id;
		this.type = type;
		this.traits = traits;
		this.name = name;
		this.willReportState = willReportState;
		this.attributes = attributes;
		this.customData = customData;
	}

}
