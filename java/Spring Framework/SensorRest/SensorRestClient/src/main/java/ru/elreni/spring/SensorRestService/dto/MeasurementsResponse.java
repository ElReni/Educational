package ru.elreni.spring.SensorRestService.dto;

import java.util.List;

public class MeasurementsResponse {
	
	List<MeasurementDTO> measurements;
	
	public MeasurementsResponse() {
		super();
	}

	public MeasurementsResponse(List<MeasurementDTO> measurements) {
		super();
		this.measurements = measurements;
	}

	public List<MeasurementDTO> getMeasurements() {
		return measurements;
	}

	public void setMeasurements(List<MeasurementDTO> measurements) {
		this.measurements = measurements;
	}

	@Override
	public String toString() {
		return "MeasurementsResponse [measurements=" + measurements + "]";
	}
	
	
}
