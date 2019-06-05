package com.haothink.designpattern.observer.concretedesc;

public class ConcreteWeatherSubject extends WeatherSubject {
	
	private String weatherContent;

	public String getSubjectState() {
		return weatherContent;
	}
	/**
	 * 
	 * */
	public void setSubjectState(String weatherContent) {
		this.weatherContent = weatherContent;
		notifyObs();
	}
	
	
}
