package com.practice.calendar;

public class events {

	private String name;
	private long from;
	private long to;
	private String where;
	
	public events(){					// no argument constructor
		}

public events(String n,long f,long t, String w) {
	this.name=n;
	this.from=f;
	this.to=t;
	this.where = w;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getFrom() {
	return from;
}

public void setFrom(long from) {
	this.from = from;
}

public long getTo() {
	return to;
}

public void setTo(long to) {
	this.to = to;
}

public String getWhere() {
	return where;
}

public void setWhere(String where) {
	this.where = where;
}

	
}
