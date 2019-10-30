package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.util.List;

public class GoogleActionsPayloadTraitsBean implements java.io.Serializable {
	private static final long serialVersionUID = 1653898387904314107L;
	private List<String> traits;

	public List<String> getTraits() {
		return traits;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadTraitsBean [traits=");
		builder.append(traits);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsPayloadTraitsBean(List<String> traits) {
		super();
		this.traits = traits;
	}

}
