package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

public class ASUSSpeakerResponseTextBean implements java.io.Serializable {
	private static final long serialVersionUID = 2642601013385217242L;
	private String text;

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ASUSSpeakerResponseTextBean [text=");
		builder.append(text);
		builder.append("]");
		return builder.toString();
	}

	public ASUSSpeakerResponseTextBean(String text) {
		super();
		this.text = text;
	}

}
