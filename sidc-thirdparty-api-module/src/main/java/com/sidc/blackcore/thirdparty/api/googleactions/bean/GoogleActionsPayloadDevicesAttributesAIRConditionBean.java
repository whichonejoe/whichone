package com.sidc.blackcore.thirdparty.api.googleactions.bean;

public class GoogleActionsPayloadDevicesAttributesAIRConditionBean implements java.io.Serializable {
	private static final long serialVersionUID = -3256262121907199701L;
	private String availableThermostatModes;
	private String thermostatTemperatureUnit;

	public String getAvailableThermostatModes() {
		return availableThermostatModes;
	}

	public String getThermostatTemperatureUnit() {
		return thermostatTemperatureUnit;
	}

	public GoogleActionsPayloadDevicesAttributesAIRConditionBean(String availableThermostatModes,
			String thermostatTemperatureUnit) {
		super();
		this.availableThermostatModes = availableThermostatModes;
		this.thermostatTemperatureUnit = thermostatTemperatureUnit;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadDevicesAttributesAIRConditionBean [availableThermostatModes=");
		builder.append(availableThermostatModes);
		builder.append(", thermostatTemperatureUnit=");
		builder.append(thermostatTemperatureUnit);
		builder.append("]");
		return builder.toString();
	}

}
