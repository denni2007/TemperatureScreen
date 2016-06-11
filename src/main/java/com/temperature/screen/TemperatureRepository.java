package com.temperature.screen;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TemperatureRepository extends CrudRepository<TemperatureData, Long> {
	TemperatureData findFirstByOrderByIdDesc();
}

