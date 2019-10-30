package com.sidc.blackcore.thirdparty.api.dueros.bean;

/**
 * 格式依照第三方所提供
 */
public class DuerOSDevicePayloadExtensionsBean implements java.io.Serializable {
	private static final long serialVersionUID = 3699509148344822429L;
	private String extension1;
	private String extension2;

	public String getExtension1() {
		return extension1;
	}

	public String getExtension2() {
		return extension2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSDevicePayloadExtensionsBean [extension1=");
		builder.append(extension1);
		builder.append(", extension2=");
		builder.append(extension2);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSDevicePayloadExtensionsBean(String extension1, String extension2) {
		super();
		this.extension1 = extension1;
		this.extension2 = extension2;
	}

}
