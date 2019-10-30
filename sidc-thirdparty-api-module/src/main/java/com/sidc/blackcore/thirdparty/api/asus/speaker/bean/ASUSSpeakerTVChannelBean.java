package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

public class ASUSSpeakerTVChannelBean implements java.io.Serializable {
	private static final long serialVersionUID = -8304719995954230222L;
	private String channelname;
	private String channelno;

	public String getChannelname() {
		return channelname;
	}

	public String getChannelno() {
		return channelno;
	}

	public ASUSSpeakerTVChannelBean(String channelname, String channelno) {
		super();
		this.channelname = channelname;
		this.channelno = channelno;
	}

}
