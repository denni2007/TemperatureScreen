package com.temperature.screen;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TemperatureRepository extends CrudRepository<TemperatureData, Long> {
	List<TemperatureData> findTop600ByOrderByIdDesc();
}

