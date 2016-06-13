package com.temperature.screen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.OptionalDouble;

@RestController
public class TemperatureController {

	@Autowired
	private TemperatureRepository temperatureRepository;
	
	@RequestMapping(value="/temperature")
	@ResponseBody
	public String getTemperature() {
		List<TemperatureData> temperatureLastHour = temperatureRepository.findTop600ByOrderByIdDesc();

		OptionalDouble averageTemperature = temperatureLastHour
				.stream()
				.mapToDouble(TemperatureData::getTemperature)
				.average();

		return averageTemperature.isPresent() ?
				String.format("%.2f", averageTemperature.getAsDouble()) : "---";
	}
	
	@Scheduled(fixedRate=10000)
	public void addRandomTemperatureToDB() throws Exception {
		temperatureRepository.save(
				new TemperatureData(30 - (int)(Math.random() * 70)));
	}
}
