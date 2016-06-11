package com.temperature.screen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TemperatureData {
	@Id
	@GeneratedValue
	private Long id;
	
	private Long timestamp;
	private Integer temperature;
	
	public TemperatureData(){}
	
	public TemperatureData(Integer temperature){
		this.timestamp = System.currentTimeMillis();
		this.temperature = temperature;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	@Override
	public String toString() {
		return String.valueOf(temperature);
	}
}
