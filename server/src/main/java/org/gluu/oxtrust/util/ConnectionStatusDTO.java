package org.gluu.oxtrust.util;

public class ConnectionStatusDTO {

	private static final ConnectionStatusDTO UP = new ConnectionStatusDTO(true);
	private static final ConnectionStatusDTO DOWN = new ConnectionStatusDTO(false);

	private boolean isUp;

	public ConnectionStatusDTO() {
	}

	private ConnectionStatusDTO(boolean isUp) {
		this.isUp = isUp;
	}

	public boolean isUp() {
		return isUp;
	}

	public void setUp(boolean up) {
		isUp = up;
	}

	public static ConnectionStatusDTO from(boolean status) {
		return status ? UP : DOWN;
	}
}
