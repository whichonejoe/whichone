package com.sidc.blackcore.thirdparty.api.asus.speaker.bean;

public enum ASUSSpeakerModeEnum {
	HOME("回家模式"), WELCOME("歡迎模式"), SLEEP("睡覺模式"), READING("閱讀模式"), WATCHTV("看電視模式"), SAVE("節能模式"), BRIGHT("全亮模式"), DARK(
			"全黑模式");

	private final String value;

	private ASUSSpeakerModeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
