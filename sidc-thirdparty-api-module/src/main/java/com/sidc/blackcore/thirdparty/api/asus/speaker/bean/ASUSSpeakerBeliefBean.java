package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ASUSSpeakerBeliefBean implements java.io.Serializable {
	private static final long serialVersionUID = 3601822305897856815L;
	private ASUSSpeakerBeliefConceptBean SwitchTo;
	private ASUSSpeakerBeliefConceptBean Device;
	private ASUSSpeakerBeliefConceptBean Location;
	@SerializedName("TV.Number")
	@Expose
	private ASUSSpeakerBeliefConceptBean TVNumber;
	@SerializedName("Mode.Setting")
	@Expose
	private ASUSSpeakerBeliefConceptBean ModeSetting;
	private ASUSSpeakerBeliefConceptBean OperatingMode;
	private ASUSSpeakerBeliefConceptBean SpecialSpaceLight;
	private ASUSSpeakerBeliefConceptBean TVChannelList;
	private ASUSSpeakerBeliefConceptBean ChannelNumber;
	private ASUSSpeakerBeliefConceptBean ChannelName;
	private ASUSSpeakerBeliefConceptBean Number;
	private ASUSSpeakerBeliefConceptBean FanSetting;

	@SerializedName("Device_Lamp")
	@Expose
	private ASUSSpeakerBeliefConceptBean DeviceLamp;
	@SerializedName("Device_AC")
	@Expose
	private ASUSSpeakerBeliefConceptBean DeviceAC;
	@SerializedName("Fan_Q.S")
	@Expose
	private ASUSSpeakerBeliefConceptBean FanQS;
	@SerializedName("Device_Heater")
	@Expose
	private ASUSSpeakerBeliefConceptBean DeviceHeater;
	@SerializedName("Device_TV")
	@Expose
	private ASUSSpeakerBeliefConceptBean DeviceTV;
	@SerializedName("Device_Curtain")
	@Expose
	private ASUSSpeakerBeliefConceptBean DeviceCurtain;

	public ASUSSpeakerBeliefConceptBean getSwitchTo() {
		return SwitchTo;
	}

	public ASUSSpeakerBeliefConceptBean getDevice() {
		return Device;
	}

	public ASUSSpeakerBeliefConceptBean getLocation() {
		return Location;
	}

	public ASUSSpeakerBeliefConceptBean getTVNumber() {
		return TVNumber;
	}

	public ASUSSpeakerBeliefConceptBean getModeSetting() {
		return ModeSetting;
	}

	public ASUSSpeakerBeliefConceptBean getOperatingMode() {
		return OperatingMode;
	}

	public ASUSSpeakerBeliefConceptBean getSpecialSpaceLight() {
		return SpecialSpaceLight;
	}

	public ASUSSpeakerBeliefConceptBean getTVChannelList() {
		return TVChannelList;
	}

	public ASUSSpeakerBeliefConceptBean getChannelNumber() {
		return ChannelNumber;
	}

	public ASUSSpeakerBeliefConceptBean getChannelName() {
		return ChannelName;
	}

	public ASUSSpeakerBeliefConceptBean getNumber() {
		return Number;
	}

	public ASUSSpeakerBeliefConceptBean getFanSetting() {
		return FanSetting;
	}

	public ASUSSpeakerBeliefConceptBean getDeviceLamp() {
		return DeviceLamp;
	}

	public ASUSSpeakerBeliefConceptBean getDeviceAC() {
		return DeviceAC;
	}

	public ASUSSpeakerBeliefConceptBean getFanQS() {
		return FanQS;
	}

	public ASUSSpeakerBeliefConceptBean getDeviceHeater() {
		return DeviceHeater;
	}

	public ASUSSpeakerBeliefConceptBean getDeviceTV() {
		return DeviceTV;
	}

	public ASUSSpeakerBeliefConceptBean getDeviceCurtain() {
		return DeviceCurtain;
	}

}
