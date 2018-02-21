package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.JsonValueEnum;

public enum EventType implements JsonValueEnum{
	
	MOUSEOVER("mouseover"),
	MOUSEOUT("mouseout"),
	CLICK("click"),
	TOUCHSTART("touchstart"),
	TOUCHMOVE("touchmove"),
	TOUCHEND("touchend");
	
	private String jsonValue;

	private EventType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@Override
	public String getJsonValue() {
		return jsonValue;
	}
}
