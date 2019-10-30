package com.sidc.blackcore.thirdparty.api.dueros.bean;

import java.util.Map;

public class DuerOSDevicePayloadDiscoveredAdditionalApplianceDetailsBean implements java.io.Serializable {
	private static final long serialVersionUID = 3284506754946156941L;
	private Map<String, String> additionalApplianceDetails;

	public Map<String, String> getAdditionalApplianceDetails() {
		return additionalApplianceDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSDevicePayloadDiscoveredAdditionalApplianceDetailsBean [additionalApplianceDetails=");
		builder.append(additionalApplianceDetails);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSDevicePayloadDiscoveredAdditionalApplianceDetailsBean(Map<String, String> additionalApplianceDetails) {
		super();
		this.additionalApplianceDetails = additionalApplianceDetails;
	}

}
