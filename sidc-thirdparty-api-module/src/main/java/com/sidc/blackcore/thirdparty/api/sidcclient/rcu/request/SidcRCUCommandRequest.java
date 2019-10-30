package com.sidc.blackcore.thirdparty.api.sidcclient.rcu.request;

import java.io.Serializable;

public class SidcRCUCommandRequest implements Serializable {
	private static final long serialVersionUID = 3498385186370484807L;
	private String token;
	private String roomno;
	private String modename;
	private String keycode;
	private Object data;

	public String getToken() {
		return token;
	}

	public String getRoomno() {
		return roomno;
	}

	public String getModename() {
		return modename;
	}

	public String getKeycode() {
		return keycode;
	}

	public Object getData() {
		return data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SidcRCUCommandRequest [token=");
		builder.append(token);
		builder.append(", roomno=");
		builder.append(roomno);
		builder.append(", modename=");
		builder.append(modename);
		builder.append(", keycode=");
		builder.append(keycode);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}

	public SidcRCUCommandRequest(String token, String roomno, String modename, String keycode, Object data) {
		super();
		this.token = token;
		this.roomno = roomno;
		this.modename = modename;
		this.keycode = keycode;
		this.data = data;
	}

}
