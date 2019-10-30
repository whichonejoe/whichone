package com.sidc.blackcore.thirdparty.api.dueros.bean;

/**
 * 格式依照第三方所提供
 */
public class DuerOSDevicePayloadPropertiesBean implements java.io.Serializable {
	private static final long serialVersionUID = 7713720199552969031L;
	private String name;
	private String value;

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSDevicePayloadPropertiesBean [name=");
		builder.append(name);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSDevicePayloadPropertiesBean(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

}
