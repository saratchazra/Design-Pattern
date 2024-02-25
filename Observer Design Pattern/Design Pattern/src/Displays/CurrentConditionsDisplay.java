package Displays;

import Observers.Observer;
import Subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temparature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		
		System.out.println("Current conditions : " + temparature + " F degrees, "
				+ humidity + "% humidity and " + pressure + " Pressure");
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		
		this.temparature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
