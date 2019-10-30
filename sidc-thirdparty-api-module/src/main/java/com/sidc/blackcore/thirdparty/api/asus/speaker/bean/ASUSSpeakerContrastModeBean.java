package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

public class ASUSSpeakerContrastModeBean implements java.io.Serializable {
	private static final long serialVersionUID = 5899518422336004559L;
	private String modename;
	private ASUSSpeakerContrastKeyCodeInfoBean keycodeinfo;

	public String getModename() {
		return modename;
	}

	public ASUSSpeakerContrastKeyCodeInfoBean getKeycodeinfo() {
		return keycodeinfo;
	}

	public ASUSSpeakerContrastModeBean(String modename, ASUSSpeakerContrastKeyCodeInfoBean keycodeinfo) {
		super();
		this.modename = modename;
		this.keycodeinfo = keycodeinfo;
	}

}
