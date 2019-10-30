package com.sidc.blackcore.thirdparty.api.dueros.bean;

/**
 * 格式依照第三方所提供
 */
public class DuerOSDeviceFindPayloadDataValueBean implements java.io.Serializable {
	private static final long serialVersionUID = 211491093505720525L;
	private String value;

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSDeviceFindPayloadDataValueBean [value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSDeviceFindPayloadDataValueBean(String value) {
		super();
		this.value = value;
	}

}
