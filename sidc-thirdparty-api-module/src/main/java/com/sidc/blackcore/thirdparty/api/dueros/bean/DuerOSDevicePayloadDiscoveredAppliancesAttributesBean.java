package com.sidc.blackcore.thirdparty.api.dueros.bean;

public class DuerOSDevicePayloadDiscoveredAppliancesAttributesBean implements java.io.Serializable {
	private static final long serialVersionUID = 4992924045922557569L;
	private String name;
	private String value;
	private String scale;
	private String timestampOfSample;
	private String uncertaintyInMilliseconds;

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public String getScale() {
		return scale;
	}

	public String getTimestampOfSample() {
		return timestampOfSample;
	}

	public String getUncertaintyInMilliseconds() {
		return uncertaintyInMilliseconds;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSDevicePayloadDiscoveredAppliancesAttributesBean [name=");
		builder.append(name);
		builder.append(", value=");
		builder.append(value);
		builder.append(", scale=");
		builder.append(scale);
		builder.append(", timestampOfSample=");
		builder.append(timestampOfSample);
		builder.append(", uncertaintyInMilliseconds=");
		builder.append(uncertaintyInMilliseconds);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSDevicePayloadDiscoveredAppliancesAttributesBean(String name, String value, String scale,
			String timestampOfSample, String uncertaintyInMilliseconds) {
		super();
		this.name = name;
		this.value = value;
		this.scale = scale;
		this.timestampOfSample = timestampOfSample;
		this.uncertaintyInMilliseconds = uncertaintyInMilliseconds;
	}

}
