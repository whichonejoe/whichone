package com.sidc.blackcore.thirdparty.api.deviceallocation.request;

import java.util.List;

import com.sidc.blackcore.thirdparty.api.deviceallocation.bean.UpdateThirdPartyDeviceAllocationBean;

public class UpdateThirdPartyAllocationRequest implements java.io.Serializable {
	private static final long serialVersionUID = -8498572733623783182L;
	private String hotelcode;
	private String devicetype;
	private List<UpdateThirdPartyDeviceAllocationBean> list;

	public String getHotelcode() {
		return hotelcode;
	}

	public List<UpdateThirdPartyDeviceAllocationBean> getList() {
		return list;
	}

	public String getDevicetype() {
		return devicetype;
	}

	public UpdateThirdPartyAllocationRequest(String hotelcode, String devicetype,
			List<UpdateThirdPartyDeviceAllocationBean> list) {
		super();
		this.hotelcode = hotelcode;
		this.devicetype = devicetype;
		this.list = list;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ASUSSpeakerUpdateAllocationRequest [hotelcode=");
		builder.append(hotelcode);
		builder.append(", devicetype=");
		builder.append(devicetype);
		builder.append(", list=");
		builder.append(list);
		builder.append("]");
		return builder.toString();
	}

}
