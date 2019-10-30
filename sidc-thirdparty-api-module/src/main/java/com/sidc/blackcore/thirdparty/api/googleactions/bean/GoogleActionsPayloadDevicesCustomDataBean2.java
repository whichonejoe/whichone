package com.sidc.blackcore.thirdparty.api.googleactions.bean;

public class GoogleActionsPayloadDevicesCustomDataBean2 implements java.io.Serializable {
	private static final long serialVersionUID = -4523091321839035132L;
	private boolean barValue;
	private int fooValue;
	private String bazValue;

	public boolean isBarValue() {
		return barValue;
	}

	public int getFooValue() {
		return fooValue;
	}

	public String getBazValue() {
		return bazValue;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleActionsPayloadDevicesCustomDataBean [barValue=");
		builder.append(barValue);
		builder.append(", fooValue=");
		builder.append(fooValue);
		builder.append(", bazValue=");
		builder.append(bazValue);
		builder.append("]");
		return builder.toString();
	}

	public GoogleActionsPayloadDevicesCustomDataBean2(boolean barValue, int fooValue, String bazValue) {
		super();
		this.barValue = barValue;
		this.fooValue = fooValue;
		this.bazValue = bazValue;
	}

}
