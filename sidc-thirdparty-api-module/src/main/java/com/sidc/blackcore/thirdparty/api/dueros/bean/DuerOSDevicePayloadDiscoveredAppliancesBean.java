package com.sidc.blackcore.thirdparty.api.dueros.bean;

import java.util.List;

/**
 * 格式依照第三方所提供
 * https://dueros.baidu.com/didp/doc/dueros-bot-platform/dbp-smart-home/protocol
 * /discovery-message_markdown
 */
public class DuerOSDevicePayloadDiscoveredAppliancesBean implements java.io.Serializable {
	private static final long serialVersionUID = 1634681802323495202L;
	private List<String> actions;
	private List<String> applianceTypes;
	private String applianceId;
	private String friendlyDescription;
	private String friendlyName;
	private boolean isReachable;
	private String manufacturerName;
	private String modelName;
	private String version;
	private List<DuerOSDevicePayloadDiscoveredAppliancesAttributesBean> attributes;
	private DuerOSDevicePayloadDiscoveredAdditionalApplianceDetailsBean additionalApplianceDetails;

	public List<String> getActions() {
		return actions;
	}

	public List<String> getApplianceTypes() {
		return applianceTypes;
	}

	public String getApplianceId() {
		return applianceId;
	}

	public String getFriendlyDescription() {
		return friendlyDescription;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public boolean isReachable() {
		return isReachable;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public String getModelName() {
		return modelName;
	}

	public String getVersion() {
		return version;
	}

	public List<DuerOSDevicePayloadDiscoveredAppliancesAttributesBean> getAttributes() {
		return attributes;
	}

	public DuerOSDevicePayloadDiscoveredAdditionalApplianceDetailsBean getAdditionalApplianceDetails() {
		return additionalApplianceDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSDevicePayloadDiscoveredAppliancesBean [actions=");
		builder.append(actions);
		builder.append(", applianceTypes=");
		builder.append(applianceTypes);
		builder.append(", applianceId=");
		builder.append(applianceId);
		builder.append(", friendlyDescription=");
		builder.append(friendlyDescription);
		builder.append(", friendlyName=");
		builder.append(friendlyName);
		builder.append(", isReachable=");
		builder.append(isReachable);
		builder.append(", manufacturerName=");
		builder.append(manufacturerName);
		builder.append(", modelName=");
		builder.append(modelName);
		builder.append(", version=");
		builder.append(version);
		builder.append(", attributes=");
		builder.append(attributes);
		builder.append(", additionalApplianceDetails=");
		builder.append(additionalApplianceDetails);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSDevicePayloadDiscoveredAppliancesBean(List<String> actions, List<String> applianceTypes,
			String applianceId, String friendlyDescription, String friendlyName, boolean isReachable,
			String manufacturerName, String modelName, String version,
			List<DuerOSDevicePayloadDiscoveredAppliancesAttributesBean> attributes,
			DuerOSDevicePayloadDiscoveredAdditionalApplianceDetailsBean additionalApplianceDetails) {
		super();
		this.actions = actions;
		this.applianceTypes = applianceTypes;
		this.applianceId = applianceId;
		this.friendlyDescription = friendlyDescription;
		this.friendlyName = friendlyName;
		this.isReachable = isReachable;
		this.manufacturerName = manufacturerName;
		this.modelName = modelName;
		this.version = version;
		this.attributes = attributes;
		this.additionalApplianceDetails = additionalApplianceDetails;
	}

}
