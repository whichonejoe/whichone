package com.sidc.blackcore.thirdparty.api.dueros.bean;

/**
 * 格式依照第三方所提供
 */
public class DuerOSDeviceInfoResponse implements java.io.Serializable {
	private static final long serialVersionUID = 5308692808951162281L;
	private DuerOSDeviceHeaderBean header;
	private DuerOSDevicePayloadBean payload;

	public DuerOSDeviceHeaderBean getHeader() {
		return header;
	}

	public DuerOSDevicePayloadBean getPayload() {
		return payload;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSDeviceInfoResponse [header=");
		builder.append(header);
		builder.append(", payload=");
		builder.append(payload);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSDeviceInfoResponse(DuerOSDeviceHeaderBean header, DuerOSDevicePayloadBean payload) {
		super();
		this.header = header;
		this.payload = payload;
	}

}
