package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.io.Serializable;
import java.util.List;

public class GoogleActionsPayloadDevicesAttributesBean implements java.io.Serializable {
	private static final long serialVersionUID = 8637903869364820259L;
	private List<GoogleActionsPayloadDevicesAttributesModesBean> availableModes;
	private java.io.Serializable attributes;

	public List<GoogleActionsPayloadDevicesAttributesModesBean> getAvailableModes() {
		return availableModes;
	}

	public java.io.Serializable getAttributes() {
		return attributes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadDevicesAttributesBean [availableModes=");
		builder.append(availableModes);
		builder.append(", attributes=");
		builder.append(attributes);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsPayloadDevicesAttributesBean(Serializable attributes) {
		super();
		this.attributes = attributes;
	}

}
