package com.sidc.blackcore.thirdparty.api.asus.speaker.response;

public class ASUSSpeakerResponse implements java.io.Serializable {
	private static final long serialVersionUID = -6581988633081729499L;
	private String DS_TTS;

	public String getDS_TTS() {
		return DS_TTS;
	}

	public ASUSSpeakerResponse(String dS_TTS) {
		super();
		DS_TTS = dS_TTS;
	}
}
