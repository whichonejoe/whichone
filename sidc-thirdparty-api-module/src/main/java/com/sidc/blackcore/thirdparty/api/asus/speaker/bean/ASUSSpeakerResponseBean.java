package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

import java.util.List;

public class ASUSSpeakerResponseBean implements java.io.Serializable {
	private static final long serialVersionUID = -1544677451206137374L;
	private String name;
	private List<ASUSSpeakerResponseTextBean> textlist;

	public String getName() {
		return name;
	}

	public List<ASUSSpeakerResponseTextBean> getTextlist() {
		return textlist;
	}

	public ASUSSpeakerResponseBean(String name, List<ASUSSpeakerResponseTextBean> textlist) {
		super();
		this.name = name;
		this.textlist = textlist;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ASUSSpeakerResponseBean [name=");
		builder.append(name);
		builder.append(", textlist=");
		builder.append(textlist);
		builder.append("]");
		return builder.toString();
	}

}
