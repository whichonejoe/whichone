package com.sidc.blackcore.thirdparty.api.googleactions.request;

import java.util.List;

import com.sidc.blackcore.thirdparty.api.googleactions.bean.GoogleActionsInputBean;

public class GoogleActionsCommandRequest implements java.io.Serializable {
	private static final long serialVersionUID = 6629949955502317575L;
	private String requestId;
	private List<GoogleActionsInputBean> inputs;

	public String getRequestId() {
		return requestId;
	}

	public List<GoogleActionsInputBean> getInputs() {
		return inputs;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsCommandRequest [requestId=");
		builder.append(requestId);
		builder.append(", inputs=");
		builder.append(inputs);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsCommandRequest(String requestId, List<GoogleActionsInputBean> inputs) {
		super();
		this.requestId = requestId;
		this.inputs = inputs;
	}

}
