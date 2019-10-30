package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

import java.util.List;

public class ASUSSpeakerContrastKeyCodeInfoBean implements java.io.Serializable {
	private static final long serialVersionUID = 4384835349166200691L;
	private String keycodename;
	private List<ASUSSpeakerContrastKeyCodeInfoKeyCodeBean> keycodes;

	public String getKeycodename() {
		return keycodename;
	}

	public List<ASUSSpeakerContrastKeyCodeInfoKeyCodeBean> getKeycodes() {
		return keycodes;
	}

	public ASUSSpeakerContrastKeyCodeInfoBean(String keycodename,
			List<ASUSSpeakerContrastKeyCodeInfoKeyCodeBean> keycodes) {
		super();
		this.keycodename = keycodename;
		this.keycodes = keycodes;
	}

}
