package com.sidc.blackcore.thirdparty.api.googleactions.bean;

import java.util.List;

public class GoogleActionsPayloadCommandsBean implements java.io.Serializable {
	private static final long serialVersionUID = 4528782223161982289L;
	private List<String> ids;
	private String status;
	private GoogleActionsPayloadCommandsStatesBean states;

	public List<String> getIds() {
		return ids;
	}

	public String getStatus() {
		return status;
	}

	public GoogleActionsPayloadCommandsStatesBean getStates() {
		return states;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadCommandsBean [ids=");
		builder.append(ids);
		builder.append(", status=");
		builder.append(status);
		builder.append(", states=");
		builder.append(states);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsPayloadCommandsBean(List<String> ids, String status,
			GoogleActionsPayloadCommandsStatesBean states) {
		super();
		this.ids = ids;
		this.status = status;
		this.states = states;
	}

}
