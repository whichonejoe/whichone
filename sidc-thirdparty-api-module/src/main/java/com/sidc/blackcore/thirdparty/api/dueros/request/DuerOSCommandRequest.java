package com.sidc.blackcore.thirdparty.api.dueros.request;

import com.sidc.blackcore.thirdparty.api.dueros.bean.DuerOSDeviceFindPayloadBean;
import com.sidc.blackcore.thirdparty.api.dueros.bean.DuerOSDeviceHeaderBean;

/**
 * 格式依照第三方所提供
 */
public class DuerOSCommandRequest implements java.io.Serializable {
	private static final long serialVersionUID = -1679392538492531347L;
	private DuerOSDeviceHeaderBean header;
	private DuerOSDeviceFindPayloadBean payload;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSDeviceFindRequest [header=");
		builder.append(header);
		builder.append(", payload=");
		builder.append(payload);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSDeviceHeaderBean getHeader() {
		return header;
	}

	public DuerOSDeviceFindPayloadBean getPayload() {
		return payload;
	}

	public DuerOSCommandRequest(DuerOSDeviceHeaderBean header, DuerOSDeviceFindPayloadBean payload) {
		super();
		this.header = header;
		this.payload = payload;
	}

}
