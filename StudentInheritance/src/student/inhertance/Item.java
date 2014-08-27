package student.inhertance;

import java.util.Date;

public abstract class Item{

	String title;
	Date dateBorrowed;
	Member currentBorrower;

	public Item(String theTitle)
	{
		title=theTitle;
		dateBorrowed=null;
		currentBorrower=null;
	}

	public boolean isBorrowed()
	{
		return (currentBorrower==null);
	}

	public boolean canBeBorrowedBy(Member theMember)
	{
		return true;
	}

	public boolean borrowItemBy(Member theMember)
	{
		if(currentBorrower!=null){
			//Item has already been borrowed!
			return false;
		}
		else{

			//If it can be borrowed, borrow it and update statuses
			if(this.canBeBorrowedBy(theMember)){
				currentBorrower=theMember;
				dateBorrowed=new Date();	//Today's date
				theMember.borrowedItem();
				return true;
			}
			//Otherwise, return with an error
			else
				return false;
		}
	}

	public void returnItem()
	{
		this.currentBorrower.returnedItem();
		this.currentBorrower=null;
		this.dateBorrowed=null;
	}

	@Override
	public String toString()
	{
		StringBuilder result=new StringBuilder();
		result.append("Title: "+title);
		if(currentBorrower!=null)
			result.append("\n Borrowed by : "+this.currentBorrower.getName());
		else
			result.append("\n Currently borrowed by none");
		if(dateBorrowed!=null)
			result.append("\n Borrowed on : "+this.dateBorrowed);

		return result.toString();
	}
}
