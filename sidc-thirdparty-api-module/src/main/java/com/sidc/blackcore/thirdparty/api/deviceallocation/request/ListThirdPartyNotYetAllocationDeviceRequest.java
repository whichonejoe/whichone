package com.sidc.blackcore.thirdparty.api.deviceallocation.request;

public class ListThirdPartyNotYetAllocationDeviceRequest implements java.io.Serializable {
	private static final long serialVersionUID = 2304302252285379145L;
	private String devicetype;

	public String getDevicetype() {
		return devicetype;
	}

	public ListThirdPartyNotYetAllocationDeviceRequest(String devicetype) {
		super();
		this.devicetype = devicetype;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ASUSSpeakerListNotYetAllocationDeviceRequest [devicetype=");
		builder.append(devicetype);
		builder.append("]");
		return builder.toString();
	}

}
