
public class HelloWorld {

	public static void main(String[] args) {
		int year,date,month;
		int noOfDays = 2000 ;
		
	int 	noYears = noOfDays/365;
	System.out.println(noYears);
	int 	noDays = noOfDays%365;
	System.out.println(noOfDays);
	int  leap = 0;	
	int flag =0, curFlag =0;
	int newDays =0, currentYear = 1900+noYears, curMonth =0, curDate =0;
	
	for(int y =1900;y<currentYear; ){
			
		
		
				if((y%4==0 && y%100!=0)|| y %400 ==0){
					
					leap++;
					y=+4;
					
						if(y==1899+noYears)
							flag =1;	
										
				} 
				else
				y++;
	}
	
	if(leap >= noDays)
	{
		currentYear=-1;
		if(flag==1){
			
			newDays = 366-(leap-noDays);
		}
		else
			newDays = 365-(leap-noDays);
		
	}
	
	else newDays = noDays - leap;
	
	
	if((currentYear%4==0 && currentYear%100!=0)|| currentYear %400 ==0){
		
		
		curFlag = 1;
						
	} 
	//get month function 
	if(curFlag==0){
	
	if(newDays <=31)
	{
		curMonth=1;
		curDate = newDays;
	}
	
	else if(newDays >31 && newDays <=59)
	
	{
		curMonth = 2;
		curDate =newDays-31;
	}
	else if(newDays >59 && newDays <=90)
		
	{
		curMonth = 3;
		curDate =newDays-59;
	}
	else if(newDays >90 && newDays <=120)
		
	{
		curMonth = 4;
		curDate =newDays-90;
	}	
else if(newDays >120 && newDays <=151)
		
	{
		curMonth = 5;
		curDate =newDays-120;
	}	
else if(newDays >151 && newDays <=181)
	
{
	curMonth = 6;
	curDate =newDays-151;
}	
else if(newDays >181 && newDays <=212)
	
{
	curMonth = 7;
	curDate =newDays-181;
}	
else if(newDays >212 && newDays <=243)
	
{
	curMonth = 8;
	curDate =newDays-212;
}	
else if(newDays >243 && newDays <=273)
	
{
	curMonth = 9;
	curDate =newDays-243;
}	
else if(newDays >273 && newDays <=304)
	
{
	curMonth = 10;
	curDate =newDays-273;
}	
else if(newDays >304 && newDays <=334)
	
{
	curMonth = 11;
	curDate =newDays-304;
}	
else if(newDays >334 && newDays <=365)
	
{
	curMonth = 12;
	curDate =newDays-334;
}	}
	
	else
	{
		
		if(newDays <=31)
		{
			curMonth=1;
			curDate = newDays;
		}
		
		else if(newDays >31 && newDays <=60)
		
		{
			curMonth = 2;
			curDate =newDays-31;
		}
		else if(newDays >60 && newDays <=91)
			
		{
			curMonth = 3;
			curDate =newDays-60;
		}
		else if(newDays >91 && newDays <=121)
			
		{
			curMonth = 4;
			curDate =newDays-91;
		}	
	else if(newDays >121 && newDays <=152)
			
		{
			curMonth = 5;
			curDate =newDays-121;
		}	
	else if(newDays >152 && newDays <=182)
		
	{
		curMonth = 6;
		curDate =newDays-152;
	}	
	else if(newDays >182 && newDays <=213)
		
	{
		curMonth = 7;
		curDate =newDays-182;
	}	
	else if(newDays >213 && newDays <=244)
		
	{
		curMonth = 8;
		curDate =newDays-213;
	}	
	else if(newDays >244 && newDays <=274)
		
	{
		curMonth = 9;
		curDate =newDays-244;
	}	
	else if(newDays >274 && newDays <=305)
		
	{
		curMonth = 10;
		curDate =newDays-274;
	}	
	else if(newDays >305 && newDays <=335)
		
	{
		curMonth = 11;
		curDate =newDays-305;
	}	
	else if(newDays >335 && newDays <=366)
		
	{
		curMonth = 12;
		curDate =newDays-335;
	}	}
		// TODO Auto-generated method stub
		System.out.println("Date ="+curDate+"Month = "+curMonth+"Year = "+currentYear);
	}
	
	
	

}
