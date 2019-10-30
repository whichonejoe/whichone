package com.sidc.blackcore.thirdparty.api.dueros.bean;

import java.util.List;
import java.util.Map;

public class DuerOSDevicePayloadDiscoveredGroupBean implements java.io.Serializable {
	private static final long serialVersionUID = 5582714678133400572L;
	private String groupName;
	private List<String> applianceIds;
	private String groupNotes;
	private Map<String, String> additionalGroupDetails;

	public String getGroupName() {
		return groupName;
	}

	public List<String> getApplianceIds() {
		return applianceIds;
	}

	public String getGroupNotes() {
		return groupNotes;
	}

	public Map<String, String> getAdditionalGroupDetails() {
		return additionalGroupDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSDevicePayloadDiscoveredGroupBean [groupName=");
		builder.append(groupName);
		builder.append(", applianceIds=");
		builder.append(applianceIds);
		builder.append(", groupNotes=");
		builder.append(groupNotes);
		builder.append(", additionalGroupDetails=");
		builder.append(additionalGroupDetails);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSDevicePayloadDiscoveredGroupBean(String groupName, List<String> applianceIds, String groupNotes,
			Map<String, String> additionalGroupDetails) {
		super();
		this.groupName = groupName;
		this.applianceIds = applianceIds;
		this.groupNotes = groupNotes;
		this.additionalGroupDetails = additionalGroupDetails;
	}

}
