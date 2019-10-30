package com.sidc.blackcore.thirdparty.api.googleactions.response;

import com.sidc.blackcore.thirdparty.api.googleactions.bean.GoogleActionsPayloadBean;

public class GoogleActionsCommandResponse implements java.io.Serializable {
	private static final long serialVersionUID = 7785949785824969888L;
	private String requestId;
	private GoogleActionsPayloadBean payload;

	public String getRequestId() {
		return requestId;
	}

	public GoogleActionsPayloadBean getPayload() {
		return payload;
	}

	public void setPayload(GoogleActionsPayloadBean payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsCommandResponse [requestId=");
		builder.append(requestId);
		builder.append(", payload=");
		builder.append(payload);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsCommandResponse(String requestId) {
		super();
		this.requestId = requestId;
	}

}
