package com.sidc.blackcore.thirdparty.api.googleactions.response;

import com.sidc.blackcore.thirdparty.api.googleactions.bean.GoogleActionsQueryPayloadDeviceBean;

public class GoogleActionsQueryCommandResponse implements java.io.Serializable {
	private static final long serialVersionUID = 3469771461123335297L;
	private String requestId;
	private GoogleActionsQueryPayloadDeviceBean payload;

	public String getRequestId() {
		return requestId;
	}

	public GoogleActionsQueryPayloadDeviceBean getPayload() {
		return payload;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsQueryPayloadBean [requestId=");
		builder.append(requestId);
		builder.append(", payload=");
		builder.append(payload);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsQueryCommandResponse(String requestId, GoogleActionsQueryPayloadDeviceBean payload) {
		super();
		this.requestId = requestId;
		this.payload = payload;
	}

}
