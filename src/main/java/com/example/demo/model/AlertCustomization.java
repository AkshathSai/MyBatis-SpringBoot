package com.example.demo.model;

import java.io.Serializable;

public class AlertCustomization implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String alertId;
	
	private String featureName;
	
	private boolean featureFlag;

	public String getAlertId() {
		return alertId;
	}

	public void setAlertId(String alertId) {
		this.alertId = alertId;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public boolean isFeatureFlag() {
		return featureFlag;
	}

	public void setFeatureFlag(boolean featureFlag) {
		this.featureFlag = featureFlag;
	}
	
}
