package com.sidc.blackcore.thirdparty.api.googleactions.bean;

public class GoogleActionsInputBean implements java.io.Serializable {
	private static final long serialVersionUID = -6760826153495346851L;
	private String intent;
	private GoogleActionsInputPayloadBean payload;
	private GoogleActionsInputContextBean context;

	public String getIntent() {
		return intent;
	}

	public GoogleActionsInputPayloadBean getPayload() {
		return payload;
	}

	public GoogleActionsInputContextBean getContext() {
		return context;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsInputBean [intent=");
		builder.append(intent);
		builder.append(", payload=");
		builder.append(payload);
		builder.append(", context=");
		builder.append(context);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsInputBean(String intent, GoogleActionsInputPayloadBean payload,
			GoogleActionsInputContextBean context) {
		super();
		this.intent = intent;
		this.payload = payload;
		this.context = context;
	}

}
