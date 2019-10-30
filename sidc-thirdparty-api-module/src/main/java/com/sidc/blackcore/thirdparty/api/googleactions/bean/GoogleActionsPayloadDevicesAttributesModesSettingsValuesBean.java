package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.util.List;

public class GoogleActionsPayloadDevicesAttributesModesSettingsValuesBean implements java.io.Serializable {
	private static final long serialVersionUID = 4529303259918624981L;
	private List<String> setting_synonym;
	private String lang;

	public List<String> getSetting_synonym() {
		return setting_synonym;
	}

	public String getLang() {
		return lang;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadDevicesAttributesModesSettingsValuesBean [setting_synonym=");
		builder.append(setting_synonym);
		builder.append(", lang=");
		builder.append(lang);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsPayloadDevicesAttributesModesSettingsValuesBean(List<String> setting_synonym, String lang) {
		super();
		this.setting_synonym = setting_synonym;
		this.lang = lang;
	}

}
