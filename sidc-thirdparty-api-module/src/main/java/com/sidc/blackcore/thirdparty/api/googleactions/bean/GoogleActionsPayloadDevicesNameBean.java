package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.util.List;

public class GoogleActionsPayloadDevicesNameBean implements java.io.Serializable {
	private static final long serialVersionUID = 4266058566759901653L;
	private List<String> defaultNames;
	private String name;
	private List<String> nicknames;

	public void setDefaultNames(List<String> defaultNames) {
		this.defaultNames = defaultNames;
	}

	public void setNicknames(List<String> nicknames) {
		this.nicknames = nicknames;
	}

	public List<String> getDefaultNames() {
		return defaultNames;
	}

	public String getName() {
		return name;
	}

	public List<String> getNicknames() {
		return nicknames;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadDevicesNameBean [defaultNames=");
		builder.append(defaultNames);
		builder.append(", name=");
		builder.append(name);
		builder.append(", nicknames=");
		builder.append(nicknames);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsPayloadDevicesNameBean(String name, List<String> nicknames) {
		super();
		this.name = name;
		this.nicknames = nicknames;
	}

}
