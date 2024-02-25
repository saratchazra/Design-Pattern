package Subject;

import java.util.ArrayList;

import Observers.Observer;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers;
	private float temparature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		
		observers.add(o);	
	}

	@Override
	public void removeObserver(Observer o) {
		
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		
		for(Observer observer : observers) {
			observer.update(temparature, humidity, pressure);
		}
	}
	
	public void measurementChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temparature, float humidity, float pressure) {
		
		this.temparature = temparature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

}
