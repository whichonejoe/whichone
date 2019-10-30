package com.sidc.blackcore.thirdparty.api.dueros.bean;

/**
 * 格式依照第三方所提供
 */
public class DuerOSCommandPayloadBean implements java.io.Serializable {
	private static final long serialVersionUID = -5251479821200865334L;
	private String deviceId;

	public String getDeviceId() {
		return deviceId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSCommandPayloadBean [deviceId=");
		builder.append(deviceId);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSCommandPayloadBean(String deviceId) {
		super();
		this.deviceId = deviceId;
	}

}
