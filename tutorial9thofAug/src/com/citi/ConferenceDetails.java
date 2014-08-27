package com.citi;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConferenceDetails
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		RoomDetails lectureDSP = new RoomDetails(1, new Date(2014, 3, 8, 12, 22));
//		RoomDetails lecturejava = new RoomDetails(2, new Date(2014, 3, 8, 20, 52));
//		RoomDetails lectureC = new RoomDetails(3, new Date(2014, 3, 8, 10, 9));
//		RoomDetails lectureCPP = new RoomDetails(4, new Date(2014, 3, 8, 17, 22));
		List<String> detailsList = new ArrayList<String>();
		List<Topic> conferenceDetails = new ArrayList<Topic>();
		

		Map<Topic, RoomDetails> info = new HashMap<Topic, RoomDetails>();
//		info.put("DSP", lectureDSP);
//		info.put("java", lecturejava);
//		info.put("C", lectureC);
//		info.put("CPP", lectureCPP);

		Scanner io = new Scanner(System.in);
		String input = io.nextLine();
		
		RoomDetails detail = info.get(input);

		detail.displayDetails();
	}
}


class Topic {
	String topicName;
	Date duration;
	String presenter;
	
	
	public Topic( String topicName, Date duration, String presenter)
	{
		// TODO Auto-generated constructor stub
		
		this.topicName = topicName;
		this.duration = duration;
		this.presenter = presenter;
	}
}

