package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

import java.util.List;

public class ASUSSpeakerContrastGroupBean implements java.io.Serializable {
	private static final long serialVersionUID = 7062827552316905387L;
	private String group;
	private List<ASUSSpeakerContrastKeyCodeInfoBean> keycodeinfo;

	public String getGroup() {
		return group;
	}

	public List<ASUSSpeakerContrastKeyCodeInfoBean> getKeycodeinfo() {
		return keycodeinfo;
	}

	public ASUSSpeakerContrastGroupBean(String group, List<ASUSSpeakerContrastKeyCodeInfoBean> keycodeinfo) {
		super();
		this.group = group;
		this.keycodeinfo = keycodeinfo;
	}

}
