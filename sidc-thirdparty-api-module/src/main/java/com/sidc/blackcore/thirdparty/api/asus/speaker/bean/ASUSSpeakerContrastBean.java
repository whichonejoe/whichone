package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

import java.util.List;

public class ASUSSpeakerContrastBean implements java.io.Serializable {
	private static final long serialVersionUID = -5281045848282200108L;
	private String location;
	private List<ASUSSpeakerContrastGroupBean> groups;

	public String getLocation() {
		return location;
	}

	public List<ASUSSpeakerContrastGroupBean> getGroups() {
		return groups;
	}

	public ASUSSpeakerContrastBean(String location, List<ASUSSpeakerContrastGroupBean> groups) {
		super();
		this.location = location;
		this.groups = groups;
	}

}
