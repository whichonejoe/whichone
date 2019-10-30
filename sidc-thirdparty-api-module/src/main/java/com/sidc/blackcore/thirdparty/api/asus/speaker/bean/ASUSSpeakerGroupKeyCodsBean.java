package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

import java.util.List;

public class ASUSSpeakerGroupKeyCodsBean implements java.io.Serializable {
	private static final long serialVersionUID = -4331938419766311426L;
	private String group;
	private List<ASUSSpeakerContrastKeyCodeInfoKeyCodeBean> keycodes;

	public String getGroup() {
		return group;
	}

	public List<ASUSSpeakerContrastKeyCodeInfoKeyCodeBean> getKeycodes() {
		return keycodes;
	}

	public ASUSSpeakerGroupKeyCodsBean(String group, List<ASUSSpeakerContrastKeyCodeInfoKeyCodeBean> keycodes) {
		super();
		this.group = group;
		this.keycodes = keycodes;
	}

}
