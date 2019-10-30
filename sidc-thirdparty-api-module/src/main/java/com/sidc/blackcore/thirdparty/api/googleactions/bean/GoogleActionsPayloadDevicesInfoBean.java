package com.sidc.blackcore.thirdparty.api.googleactions.bean;

public class GoogleActionsPayloadDevicesInfoBean implements java.io.Serializable {
	private static final long serialVersionUID = 9006153370761827820L;
	private String model;
	private String hwVersion;
	private String manufacturer;
	private String swVersion;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getHwVersion() {
		return hwVersion;
	}

	public void setHwVersion(String hwVersion) {
		this.hwVersion = hwVersion;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getSwVersion() {
		return swVersion;
	}

	public void setSwVersion(String swVersion) {
		this.swVersion = swVersion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadDevicesInfoBean [model=");
		builder.append(model);
		builder.append(", hwVersion=");
		builder.append(hwVersion);
		builder.append(", manufacturer=");
		builder.append(manufacturer);
		builder.append(", swVersion=");
		builder.append(swVersion);
		builder.append("]");
		return builder.toString();
	}

}
