package com.sidc.blackcore.thirdparty.api.googleactions.bean;

public class GoogleActionsPayloadCommandsStatesBean implements java.io.Serializable {
	private static final long serialVersionUID = -4761049531397956582L;
	private String temperatureSetpointCelsius;
	private String temperatureAmbientCelsius;
	private boolean on;
	private boolean online;
	private String currentFanSpeedSetting;
	private String brightness;
	private String thermostatTemperatureSetpoint;
	private String thermostatTemperatureAmbient;
	private String thermostatHumidityAmbient;
	private String thermostatMode;

	public GoogleActionsPayloadCommandsStatesBean withTemperatureSetpointCelsius(String temperatureSetpointCelsius) {
		this.temperatureSetpointCelsius = temperatureSetpointCelsius;
		return this;
	}

	public GoogleActionsPayloadCommandsStatesBean withTemperatureAmbientCelsius(String temperatureAmbientCelsius) {
		this.temperatureAmbientCelsius = temperatureAmbientCelsius;
		return this;
	}

	public GoogleActionsPayloadCommandsStatesBean withOn(boolean on) {
		this.on = on;
		return this;
	}

	public GoogleActionsPayloadCommandsStatesBean withOnline(boolean online) {
		this.online = online;
		return this;
	}

	public GoogleActionsPayloadCommandsStatesBean withCurrentFanSpeedSetting(String currentFanSpeedSetting) {
		this.currentFanSpeedSetting = currentFanSpeedSetting;
		return this;
	}

	public GoogleActionsPayloadCommandsStatesBean withBrightness(String brightness) {
		this.brightness = brightness;
		return this;
	}

	public GoogleActionsPayloadCommandsStatesBean withThermostatTemperatureSetpoint(
			String thermostatTemperatureSetpoint) {
		this.thermostatTemperatureSetpoint = thermostatTemperatureSetpoint;
		return this;
	}

	public GoogleActionsPayloadCommandsStatesBean withThermostatTemperatureAmbient(
			String thermostatTemperatureAmbient) {
		this.thermostatTemperatureAmbient = thermostatTemperatureAmbient;
		return this;
	}

	public GoogleActionsPayloadCommandsStatesBean withThermostatHumidityAmbient(String thermostatHumidityAmbient) {
		this.thermostatHumidityAmbient = thermostatHumidityAmbient;
		return this;
	}

	public String getTemperatureSetpointCelsius() {
		return temperatureSetpointCelsius;
	}

	public String getTemperatureAmbientCelsius() {
		return temperatureAmbientCelsius;
	}

	public boolean isOn() {
		return on;
	}

	public boolean isOnline() {
		return online;
	}

	public String getCurrentFanSpeedSetting() {
		return currentFanSpeedSetting;
	}

	public String getBrightness() {
		return brightness;
	}

	public String getThermostatTemperatureSetpoint() {
		return thermostatTemperatureSetpoint;
	}

	public String getThermostatTemperatureAmbient() {
		return thermostatTemperatureAmbient;
	}

	public String getThermostatHumidityAmbient() {
		return thermostatHumidityAmbient;
	}

	public String getThermostatMode() {
		return thermostatMode;
	}

	public GoogleActionsPayloadCommandsStatesBean withThermostatMode(String thermostatMode) {
		this.thermostatMode = thermostatMode;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadCommandsStatesBean [temperatureSetpointCelsius=");
		builder.append(temperatureSetpointCelsius);
		builder.append(", temperatureAmbientCelsius=");
		builder.append(temperatureAmbientCelsius);
		builder.append(", on=");
		builder.append(on);
		builder.append(", online=");
		builder.append(online);
		builder.append(", currentFanSpeedSetting=");
		builder.append(currentFanSpeedSetting);
		builder.append(", brightness=");
		builder.append(brightness);
		builder.append(", thermostatTemperatureSetpoint=");
		builder.append(thermostatTemperatureSetpoint);
		builder.append(", thermostatTemperatureAmbient=");
		builder.append(thermostatTemperatureAmbient);
		builder.append(", thermostatHumidityAmbient=");
		builder.append(thermostatHumidityAmbient);
		builder.append(", thermostatMode=");
		builder.append(thermostatMode);
		builder.append("]");
		return builder.toString();
	}

}
