package com.luxoft.springcore.travel;

import com.luxoft.springcore.objects.City;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Connection {

	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
	private City source;
	@ManyToOne
	private City destination;
	private int distance;

	public Connection() {
	}

	public Connection(City source, City destination, int distance) {
		this.source = source;
		this.destination = destination;
		this.distance = distance;
	}

	public City getSource() {
		return source;
	}

	public void setSource(City source) {
		this.source = source;
	}

	public City getDestination() {
		return destination;
	}

	public void setDestination(City destination) {
		this.destination = destination;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
}
