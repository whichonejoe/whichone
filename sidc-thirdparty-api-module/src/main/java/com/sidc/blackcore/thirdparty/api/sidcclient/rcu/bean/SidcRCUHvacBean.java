package com.sidc.blackcore.thirdparty.api.sidcclient.rcu.bean;

public class SidcRCUHvacBean implements java.io.Serializable {
	private static final long serialVersionUID = -5797271144735410417L;
	private boolean power;
	private int function;
	private int temperature;
	private int speed;
	private int timer;

	public boolean isPower() {
		return power;
	}

	public int getFunction() {
		return function;
	}

	public int getTemperature() {
		return temperature;
	}

	public int getSpeed() {
		return speed;
	}

	public int getTimer() {
		return timer;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SidcRCUHvacBean [power=");
		builder.append(power);
		builder.append(", function=");
		builder.append(function);
		builder.append(", temperature=");
		builder.append(temperature);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", timer=");
		builder.append(timer);
		builder.append("]");
		return builder.toString();
	}

	public SidcRCUHvacBean(boolean power, int function, int temperature, int speed, int timer) {
		super();
		this.power = power;
		this.function = function;
		this.temperature = temperature;
		this.speed = speed;
		this.timer = timer;
	}

}
