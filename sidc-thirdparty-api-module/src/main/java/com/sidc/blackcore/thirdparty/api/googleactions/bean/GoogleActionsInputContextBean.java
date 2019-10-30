package com.sidc.blackcore.thirdparty.api.googleactions.bean;

public class GoogleActionsInputContextBean implements java.io.Serializable {
	private static final long serialVersionUID = 83167156737644796L;
	private String locale_language;

	public String getLocale_language() {
		return locale_language;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsInputContextBean [locale_language=");
		builder.append(locale_language);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsInputContextBean(String locale_language) {
		super();
		this.locale_language = locale_language;
	}

}
