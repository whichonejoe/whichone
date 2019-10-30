package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.util.List;

public class GoogleActionsPayloadDevicesAttributesModesSettingsBean implements java.io.Serializable {
	private static final long serialVersionUID = 1570700341842058729L;
	private List<GoogleActionsPayloadDevicesAttributesModesSettingsValuesBean> setting_values;
	private String setting_name;

	public List<GoogleActionsPayloadDevicesAttributesModesSettingsValuesBean> getSetting_values() {
		return setting_values;
	}

	public String getSetting_name() {
		return setting_name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadDevicesAttributesModesSettingsBean [setting_values=");
		builder.append(setting_values);
		builder.append(", setting_name=");
		builder.append(setting_name);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsPayloadDevicesAttributesModesSettingsBean(
			List<GoogleActionsPayloadDevicesAttributesModesSettingsValuesBean> setting_values, String setting_name) {
		super();
		this.setting_values = setting_values;
		this.setting_name = setting_name;
	}

}
