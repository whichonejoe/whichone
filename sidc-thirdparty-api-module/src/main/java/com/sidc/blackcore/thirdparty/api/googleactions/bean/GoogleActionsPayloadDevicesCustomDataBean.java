package com.sidc.blackcore.thirdparty.api.googleactions.bean;

public class GoogleActionsPayloadDevicesCustomDataBean implements java.io.Serializable {
	private static final long serialVersionUID = -4523091321839035132L;
	private String rcugroup;

	public String getRCUGroup() {
		return rcugroup;
	}

	public void setRCUGroup(String rcugroup) {
		this.rcugroup = rcugroup;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadDevicesCustomDataBean [rcugroup=");
		builder.append(rcugroup);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsPayloadDevicesCustomDataBean(String rcugroup) {
		super();
		this.rcugroup = rcugroup;
	}

}
