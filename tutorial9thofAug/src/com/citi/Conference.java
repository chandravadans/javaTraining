package com.citi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conference {
	
	private String title;
	private Date date;
	private Venue venue;
	private List<Topic> topics = new ArrayList<Topic>();
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		String result = "";
		
		return result;
	}
	
	public Conference(String title, Date date) 
	{
		this.title = title;
		this.date = date;
		// TODO Auto-generated constructor stub
	}

	public List<Topic> getTopics()
	{
		return topics;
	}

	public void setTopics(List<Topic> topics)
	{
		this.topics = topics;
	}

	public void setVenue(Venue venue)
	{
		this.venue = venue;
	}
}