/**
 * 
 */
package com.sidc.blackcore.thirdparty.api.sidcclient.rcu.bean;

public class SidcRCUSwitchBean implements java.io.Serializable {
	private static final long serialVersionUID = -5385218349988703814L;
	private String value;

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SidcRCUSwitchBean [value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}

	public SidcRCUSwitchBean(String value) {
		super();
		this.value = value;
	}
}
