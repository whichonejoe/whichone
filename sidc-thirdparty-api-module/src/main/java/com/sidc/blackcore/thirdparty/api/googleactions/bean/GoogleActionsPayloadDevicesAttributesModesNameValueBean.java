package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.util.List;

public class GoogleActionsPayloadDevicesAttributesModesNameValueBean implements java.io.Serializable {
	private static final long serialVersionUID = -3042445253969737968L;
	private List<String> name_synonym;
	private String lang;

	public List<String> getName_synonym() {
		return name_synonym;
	}

	public String getLang() {
		return lang;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadDevicesAttributesModesNameValueBean [name_synonym=");
		builder.append(name_synonym);
		builder.append(", lang=");
		builder.append(lang);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsPayloadDevicesAttributesModesNameValueBean(List<String> name_synonym, String lang) {
		super();
		this.name_synonym = name_synonym;
		this.lang = lang;
	}

}
