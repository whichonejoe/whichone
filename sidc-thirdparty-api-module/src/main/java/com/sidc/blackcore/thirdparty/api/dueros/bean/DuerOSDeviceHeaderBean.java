package com.sidc.blackcore.thirdparty.api.dueros.bean;

/**
 * 格式依照第三方所提供
 */
public class DuerOSDeviceHeaderBean implements java.io.Serializable {
	private static final long serialVersionUID = 8740247048616267362L;
	private String messageId;
	private int payLoadVersion;
	private String namespace;
	private String name;

	public String getMessageId() {
		return messageId;
	}

	public int getPayLoadVersion() {
		return payLoadVersion;
	}

	public String getNamespace() {
		return namespace;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DuerOSDeviceHeaderBean [messageId=");
		builder.append(messageId);
		builder.append(", payLoadVersion=");
		builder.append(payLoadVersion);
		builder.append(", namespace=");
		builder.append(namespace);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	public DuerOSDeviceHeaderBean(String messageId, int payLoadVersion, String namespace, String name) {
		super();
		this.messageId = messageId;
		this.payLoadVersion = payLoadVersion;
		this.namespace = namespace;
		this.name = name;
	}

}
