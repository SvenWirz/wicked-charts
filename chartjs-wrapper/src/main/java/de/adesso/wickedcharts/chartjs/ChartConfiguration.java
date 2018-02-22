package de.adesso.wickedcharts.chartjs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import de.adesso.wickedcharts.chartjs.chartoptions.ChartType;
import de.adesso.wickedcharts.chartjs.chartoptions.Data;
import de.adesso.wickedcharts.chartjs.chartoptions.Options;
import lombok.experimental.Accessors;


@Accessors(chain = true)
@lombok.Data
public class ChartConfiguration {
	private ChartType type;
	private Data data;
	private Options options;
	
	@JsonIgnore
	private List<String> optionalJavascript;
	
	public void addOptionalJavascript(String javascript) {
		optionalJavascript.add(javascript);
	}
	
	public String getOptionalJavascript() {
		if(optionalJavascript == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for(String javascriptElement : optionalJavascript) {
			sb.append(javascriptElement);
		}
		return sb.toString();
	}
	
	
}
