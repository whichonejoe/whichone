package com.sidc.blackcore.thirdparty.api.dueros.bean;

/**
 * 格式依照第三方所提供
 */
public class DuerOSDeviceFindPayloadTargetTemperatureBean implements java.io.Serializable {
	private static final long serialVersionUID = -1221262419620172033L;
	private String value;
	private String scale;

	public String getValue() {
		return value;
	}

	public String getScale() {
		return scale;
	}

	public DuerOSDeviceFindPayloadTargetTemperatureBean(String value, String scale) {
		super();
		this.value = value;
		this.scale = scale;
	}

}
