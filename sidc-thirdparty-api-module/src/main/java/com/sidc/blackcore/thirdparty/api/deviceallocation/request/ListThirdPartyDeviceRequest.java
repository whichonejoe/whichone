package com.sidc.blackcore.thirdparty.api.deviceallocation.request;

public class ListThirdPartyDeviceRequest implements java.io.Serializable {
	private static final long serialVersionUID = -2056063586745367976L;
	private String hotelcode;

	public String getHotelcode() {
		return hotelcode;
	}

	public ListThirdPartyDeviceRequest(String hotelcode) {
		super();
		this.hotelcode = hotelcode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ASUSSpeakerListDeviceRequest [hotelcode=");
		builder.append(hotelcode);
		builder.append("]");
		return builder.toString();
	}

}
