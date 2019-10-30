package com.sidc.blackcore.thirdparty.api.dueros.bean;

/**
 * 格式依照第三方所提供
 */
public class DuerOSDeviceFindPayloadApplianceBean implements java.io.Serializable {
	private static final long serialVersionUID = -5998534754741097014L;
	private String applianceId;
	private DuerOSDevicePayloadDiscoveredAdditionalApplianceDetailsBean additionalApplianceDetails;

	public String getApplianceId() {
		return applianceId;
	}

	public DuerOSDevicePayloadDiscoveredAdditionalApplianceDetailsBean getAdditionalApplianceDetails() {
		return additionalApplianceDetails;
	}

	public DuerOSDeviceFindPayloadApplianceBean(String applianceId,
			DuerOSDevicePayloadDiscoveredAdditionalApplianceDetailsBean additionalApplianceDetails) {
		super();
		this.applianceId = applianceId;
		this.additionalApplianceDetails = additionalApplianceDetails;
	}

}
