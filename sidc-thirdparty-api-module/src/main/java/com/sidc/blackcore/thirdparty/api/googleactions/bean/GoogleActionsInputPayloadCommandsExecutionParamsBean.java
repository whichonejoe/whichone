package com.sidc.blackcore.thirdparty.api.googleactions.bean;

public class GoogleActionsInputPayloadCommandsExecutionParamsBean implements java.io.Serializable {
	private static final long serialVersionUID = 2203378765712886190L;
	private int brightness;
	private String fanSpeed;
	private boolean pause;
	private double temperature;
	private boolean on;

	public int getBrightness() {
		return brightness;
	}

	public String getFanSpeed() {
		return fanSpeed;
	}

	public boolean isPause() {
		return pause;
	}

	public double getTemperature() {
		return temperature;
	}

	public boolean isOn() {
		return on;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsInputPayloadCommandsExecutionParamsBean [brightness=");
		builder.append(brightness);
		builder.append(", fanSpeed=");
		builder.append(fanSpeed);
		builder.append(", pause=");
		builder.append(pause);
		builder.append(", temperature=");
		builder.append(temperature);
		builder.append(", on=");
		builder.append(on);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsInputPayloadCommandsExecutionParamsBean(int brightness, String fanSpeed, boolean pause,
			double temperature, boolean on) {
		super();
		this.brightness = brightness;
		this.fanSpeed = fanSpeed;
		this.pause = pause;
		this.temperature = temperature;
		this.on = on;
	}

}
