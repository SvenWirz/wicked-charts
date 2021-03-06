package de.adesso.wickedcharts.chartjs.chartoptions.valueType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class ConstValue extends ValueType {
	private final String value;
	
	public ConstValue(final String value) {
		this.value = value;
	}
	

	public static List<ConstValue> of(final List<String> constList) {
		return constList.stream().map(string -> new ConstValue(string)).collect(Collectors.toList());
	}
	
	public static List<ConstValue> of(final String...consts) {
		return Arrays.stream(consts).map(string -> new ConstValue(string)).collect(Collectors.toList());
	}
}
