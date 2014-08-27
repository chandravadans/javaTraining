package com.citi;

import java.util.Date;

class RoomDetails
{
	private int		roomNumber;
	private Date	time;
	private Topic topic;

	public RoomDetails(int roomNumber, Date time, Topic topic)
	{
		this.roomNumber = roomNumber;
		this.time = time;
		this.topic = topic;
	}

	void displayDetails()
	{
		System.out.println("Room is: " + roomNumber + " Time is: " + time);
	}

	@Override
	public String toString()
	{
		return "room: " + roomNumber + " and the time: " + time
				+ " please be on time";
	}
}