package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

public class ASUSSpeakerBeliefConceptBean implements java.io.Serializable {
	private static final long serialVersionUID = -3738752574069932475L;
	private String concept;
	private String value;

	public String getConcept() {
		return concept;
	}

	public String getValue() {
		return value;
	}

	public ASUSSpeakerBeliefConceptBean(String concept, String value) {
		super();
		this.concept = concept;
		this.value = value;
	}
}
