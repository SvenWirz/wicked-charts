package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

/**
 * Defines options for Animations.
 *
 */
@Accessors(chain = true)
@lombok.Data
public class Animation implements Serializable {
	private static final long serialVersionUID = 1L;
	private Boolean animateScale;
	private Boolean animateRotate;
	
	// animation options
	private Integer duration;
	private CallbackFunction onProgress;
	private CallbackFunction onComplete;
	private EasingType easing;
	
}
