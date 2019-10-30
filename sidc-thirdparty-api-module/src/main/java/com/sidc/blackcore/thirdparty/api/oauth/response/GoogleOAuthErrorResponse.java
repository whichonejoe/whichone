/**
 * 
 */
package com.sidc.blackcore.thirdparty.api.oauth.response;

public class GoogleOAuthErrorResponse implements java.io.Serializable {
	private static final long serialVersionUID = 4910579994033794637L;
	private String error;

	public String getError() {
		return error;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoogleOAuthErrorResponse [error=");
		builder.append(error);
		builder.append("]");
		return builder.toString();
	}

	public GoogleOAuthErrorResponse(String error) {
		super();
		this.error = error;
	}

}
