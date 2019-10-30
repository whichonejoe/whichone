package com.sidc.blackcore.thirdparty.api.dueros.bean;

import java.util.List;

/**
 * 格式依照第三方所提供
 */
public class DuerOSDevicePayloadBean implements java.io.Serializable {
	private static final long serialVersionUID = -9134235439786607278L;
	private List<DuerOSDevicePayloadDiscoveredAppliancesBean> discoveredAppliances;
	private List<DuerOSDevicePayloadDiscoveredGroupBean> discoveredGroups;

	public List<DuerOSDevicePayloadDiscoveredAppliancesBean> getDiscoveredAppliances() {
		return discoveredAppliances;
	}

	public List<DuerOSDevicePayloadDiscoveredGroupBean> getDiscoveredGroups() {
		return discoveredGroups;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSDevicePayloadBean [discoveredAppliances=");
		builder.append(discoveredAppliances);
		builder.append(", discoveredGroups=");
		builder.append(discoveredGroups);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSDevicePayloadBean(List<DuerOSDevicePayloadDiscoveredAppliancesBean> discoveredAppliances) {
		super();
		this.discoveredAppliances = discoveredAppliances;
	}

	public DuerOSDevicePayloadBean(List<DuerOSDevicePayloadDiscoveredAppliancesBean> discoveredAppliances,
			List<DuerOSDevicePayloadDiscoveredGroupBean> discoveredGroups) {
		super();
		this.discoveredAppliances = discoveredAppliances;
		this.discoveredGroups = discoveredGroups;
	}

}
