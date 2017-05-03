package dto;

import java.io.Serializable;

public class ServerTimeDto implements Serializable {

	private Long time;

	public ServerTimeDto() {
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

}
