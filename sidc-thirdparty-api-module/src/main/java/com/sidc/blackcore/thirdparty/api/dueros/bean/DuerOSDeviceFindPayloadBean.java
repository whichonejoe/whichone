package com.sidc.blackcore.thirdparty.api.dueros.bean;

/**
 * 格式依照第三方所提供
 */
public class DuerOSDeviceFindPayloadBean implements java.io.Serializable {
	private static final long serialVersionUID = -3820313805167963711L;
	private String accessToken;
	private DuerOSDeviceFindPayloadApplianceBean appliance;
	private DuerOSDeviceFindPayloadDataValueBean deltaValue;
	private DuerOSDeviceFindPayloadTargetTemperatureBean targetTemperature;

	public String getAccessToken() {
		return accessToken;
	}

	public DuerOSDeviceFindPayloadApplianceBean getAppliance() {
		return appliance;
	}

	public DuerOSDeviceFindPayloadDataValueBean getDeltaValue() {
		return deltaValue;
	}

	public DuerOSDeviceFindPayloadTargetTemperatureBean getTargetTemperature() {
		return targetTemperature;
	}

	public DuerOSDeviceFindPayloadBean(String accessToken,
			DuerOSDeviceFindPayloadTargetTemperatureBean targetTemperature,
			DuerOSDeviceFindPayloadApplianceBean appliance, DuerOSDeviceFindPayloadDataValueBean deltaValue) {
		super();
		this.accessToken = accessToken;
		this.targetTemperature = targetTemperature;
		this.appliance = appliance;
		this.deltaValue = deltaValue;
	}

}
