package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

public class ASUSSpeakerContrastKeyCodeInfoKeyCodeBean implements java.io.Serializable {
	private static final long serialVersionUID = -7830973756784250399L;
	private String keycode;
	private String action;

	public String getKeycode() {
		return keycode;
	}

	public String getAction() {
		return action;
	}

	public ASUSSpeakerContrastKeyCodeInfoKeyCodeBean(String keycode, String action) {
		super();
		this.keycode = keycode;
		this.action = action;
	}

}
