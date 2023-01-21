package com.loiane.cursojava.aula33.labs;

// This class serves to train about the constructors and methods encapsulation.

public class Lamp {

	private String model;
	private int power;
	private String color;
	private String lightType;
	private int warrantyMonth;
	private String[] type;
	private boolean isAbajourType;
	private boolean isTurnOn = false;

	public Lamp() {
		super();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLightType() {
		return lightType;
	}

	public void setLightType(String lightType) {
		this.lightType = lightType;
	}

	public int getWarrantyMonth() {
		return warrantyMonth;
	}

	public void setWarrantyMonth(int warrantyMonth) {
		this.warrantyMonth = warrantyMonth;
	}

	public String[] getType() {
		return type;
	}

	public void setType(String[] type) {
		this.type = type;
	}

	public boolean isAbajourType() {
		return isAbajourType;
	}

	public void setAbajourType(boolean isAbajourType) {
		this.isAbajourType = isAbajourType;
	}

	public boolean isTurnOn() {
		return isTurnOn;
	}

	public void setTurnOn(boolean isTurnOn) {
		this.isTurnOn = isTurnOn;
	}

	public void turnOn() {
		setTurnOn(true);
	}

	public void turnOff() {
		setTurnOn(false);
	}

	public void displayStatus() {
		if (isTurnOn()) {
			System.out.println("Lamp is turn On.");
		} else {
			System.out.println("Lamp is turn Off.");
		}
	}

	public void shiftStatus() {
		if (isTurnOn) {
			this.turnOff();
		} else {
			this.turnOn();
		}
	}

}
