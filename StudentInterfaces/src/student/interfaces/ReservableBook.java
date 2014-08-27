package student.interfaces;

public class ReservableBook extends Book implements Reservable
{
	Member theReserver;
	Item item1;

	public ReservableBook(String title, String author, String isbn, Genre genre)
	{
		super(title,author,isbn,genre);
		theReserver=null;

	}

	@Override
	public boolean isReserved()
	{
		return (theReserver!=null);
	}

	@Override
	public boolean canBeReservedFor(Member theMember)
	{
		if(this.canBeBorrowedBy(theMember))
			return true;
		else
			return false;
	}

	@Override
	public boolean reserveItemFor(Member theMember)
	{
		if(this.isBorrowed() && !this.isReserved() && this.canBeReservedFor(theMember)){
			theReserver=theMember;
			return true;
		}
		else
			return false;
	}

	@Override
	public void returnItem()
	{
		super.returnItem();
		if(this.isReserved()){
			this.theReserver.borrowedItem();
			this.borrowItemBy(theReserver);
			this.theReserver=null;
		}
		
	}


}
