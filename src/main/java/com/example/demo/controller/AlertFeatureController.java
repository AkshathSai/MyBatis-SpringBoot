package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.AlertDataInterfaceMapper;
import com.example.demo.model.AlertCustomization;

@RequestMapping("/alerts")
@RestController
public class AlertFeatureController {
	
	private final AlertDataInterfaceMapper mapper;
	
	public AlertFeatureController(AlertDataInterfaceMapper mapper) {
		this.mapper = mapper;
	}

	@GetMapping("{alertId}")
	public List<AlertCustomization> getAlertCustomization(@PathVariable String alertId) {
		return mapper.getMasterAlertSpecificCustomization(alertId);
	}
}
