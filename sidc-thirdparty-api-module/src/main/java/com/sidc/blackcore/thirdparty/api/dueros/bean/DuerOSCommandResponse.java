package com.sidc.blackcore.thirdparty.api.dueros.bean;

/**
 * 格式依照第三方所提供
 */
public class DuerOSCommandResponse implements java.io.Serializable {
	private static final long serialVersionUID = -4518391233380311885L;
	private DuerOSDeviceHeaderBean header;
	private DuerOSCommandPayloadBean payload;

	public DuerOSDeviceHeaderBean getHeader() {
		return header;
	}

	public DuerOSCommandPayloadBean getPayload() {
		return payload;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSCommandResponse [header=");
		builder.append(header);
		builder.append(", payload=");
		builder.append(payload);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSCommandResponse(DuerOSDeviceHeaderBean header, DuerOSCommandPayloadBean payload) {
		super();
		this.header = header;
		this.payload = payload;
	}

}
