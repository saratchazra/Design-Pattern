package Displays;

import Observers.Observer;
import Subject.WeatherData;

public class StatisticalDisplay implements Observer, DisplayElement{

	private float avgTemp;
	private float maxTemp;
	private float minTemp;
	private int count;
	private WeatherData weatherData;
	
	public StatisticalDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		
		System.out.println("Avg/Max/Min temparature = "+this.avgTemp + "/"
							+this.maxTemp+"/"+this.minTemp);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		
		this.count = this.count + 1;
		
		if(this.avgTemp == 0) {
			this.avgTemp = temp;
		}else {
			this.avgTemp = (this.avgTemp*(this.count-1) + temp)/this.count;
		}
		
		this.maxTemp = (temp > this.maxTemp) ? temp : this.maxTemp;
		if(this.minTemp == 0) {
			this.minTemp = temp;
		}else {
			this.minTemp = (temp < this.minTemp) ? temp : this.minTemp;
		}
		display();
		
	}

}
