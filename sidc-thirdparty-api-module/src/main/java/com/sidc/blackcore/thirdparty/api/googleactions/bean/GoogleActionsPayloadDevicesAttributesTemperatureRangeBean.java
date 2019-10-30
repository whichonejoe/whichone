package com.sidc.blackcore.thirdparty.api.googleactions.bean;

public class GoogleActionsPayloadDevicesAttributesTemperatureRangeBean implements java.io.Serializable {
	private static final long serialVersionUID = -3839428001208717764L;
	private int minThresholdCelsius;
	private int maxThresholdCelsius;

	public int getMinThresholdCelsius() {
		return minThresholdCelsius;
	}

	public int getMaxThresholdCelsius() {
		return maxThresholdCelsius;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadDevicesAttributesTemperatureRangeBean [minThresholdCelsius=");
		builder.append(minThresholdCelsius);
		builder.append(", maxThresholdCelsius=");
		builder.append(maxThresholdCelsius);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsPayloadDevicesAttributesTemperatureRangeBean(int minThresholdCelsius, int maxThresholdCelsius) {
		super();
		this.minThresholdCelsius = minThresholdCelsius;
		this.maxThresholdCelsius = maxThresholdCelsius;
	}

}
