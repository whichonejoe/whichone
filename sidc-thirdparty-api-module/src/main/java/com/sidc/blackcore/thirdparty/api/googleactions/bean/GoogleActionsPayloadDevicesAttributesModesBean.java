package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.util.List;

public class GoogleActionsPayloadDevicesAttributesModesBean implements java.io.Serializable {
	private static final long serialVersionUID = 135904804103664561L;
	private boolean ordered;
	private List<GoogleActionsPayloadDevicesAttributesModesSettingsBean> settings;
	private String name;
	private List<GoogleActionsPayloadDevicesAttributesModesNameValueBean> name_values;

	public boolean isOrdered() {
		return ordered;
	}

	public List<GoogleActionsPayloadDevicesAttributesModesSettingsBean> getSettings() {
		return settings;
	}

	public String getName() {
		return name;
	}

	public List<GoogleActionsPayloadDevicesAttributesModesNameValueBean> getName_values() {
		return name_values;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadDevicesAttributesModesBean [ordered=");
		builder.append(ordered);
		builder.append(", settings=");
		builder.append(settings);
		builder.append(", name=");
		builder.append(name);
		builder.append(", name_values=");
		builder.append(name_values);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsPayloadDevicesAttributesModesBean(boolean ordered,
			List<GoogleActionsPayloadDevicesAttributesModesSettingsBean> settings, String name,
			List<GoogleActionsPayloadDevicesAttributesModesNameValueBean> name_values) {
		super();
		this.ordered = ordered;
		this.settings = settings;
		this.name = name;
		this.name_values = name_values;
	}

}
