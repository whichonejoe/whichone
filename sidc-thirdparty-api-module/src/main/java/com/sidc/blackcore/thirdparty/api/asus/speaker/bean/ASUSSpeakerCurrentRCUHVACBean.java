package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

public class ASUSSpeakerCurrentRCUHVACBean implements java.io.Serializable {
	private static final long serialVersionUID = -4167080990841023761L;
	private String keycode;
	private int pipe;
	private boolean power;
	private int roomtemperature;
	private int temperature;

	public String getKeycode() {
		return keycode;
	}

	public int getPipe() {
		return pipe;
	}

	public boolean isPower() {
		return power;
	}

	public int getRoomtemperature() {
		return roomtemperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public ASUSSpeakerCurrentRCUHVACBean(String keycode, int pipe, boolean power, int roomtemperature,
			int temperature) {
		super();
		this.keycode = keycode;
		this.pipe = pipe;
		this.power = power;
		this.roomtemperature = roomtemperature;
		this.temperature = temperature;
	}

}
