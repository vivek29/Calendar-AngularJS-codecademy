package com.practice.calendar;

import java.util.*;
import com.practice.calendar.events;

public class Tempdb {

	private static ArrayList<events> obj = new ArrayList<events>();

	public Tempdb(){

		events a1=new events("Casual Friday",1421384400000L,1421470800000L,"");
		events a2=new events("Taco Time",1421431200000L,1421438400000L,"Brooklyn Taco Co. 120 Essex Street New York, NY 10002");
		events a3=new events("Pottery Painting",1421449200000L,1421452800000L,"The Art Cafe CH 326 Troy Avenue Brooklyn, NY 11213");
		events a4=new events("Running",1421456400000L,1421458200000L,"");
		events a5=new events("Grocery Shopping",1421460000000L,1421461800000L,"");

		if(obj.isEmpty())	{
			obj.add(a1);
			obj.add(a2);
			obj.add(a3);
			obj.add(a4);
			obj.add(a5);
		}
	}

	public ArrayList<events> getData(){
		return obj;

	}

}