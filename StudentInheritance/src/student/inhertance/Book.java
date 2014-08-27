package student.inhertance;

public class Book extends Item{

	String author;
	String ISBN;
	Genre genre;
	enum Genre{
		CHILDREN,
		FICTION,
		NONFICTION,
	};


	public Book(String theTitle, String theGenre, String theAuthor)
	{
		super(theTitle);
		genre=Genre.valueOf(theGenre);
		author = theAuthor;

	}

	@Override
	public boolean canBeBorrowedBy(Member theMember)
	{
		int theAge=theMember.getAge();
		if(theAge<=16){
			//A child can only take childrens' books
			if(genre.equals(Book.Genre.CHILDREN))
				return true;
			else
				return false;
		}
		else{
			//An adult can't take childrens' books (wth!)
			if(genre.equals(Book.Genre.CHILDREN))
				return false;
			else return true;
		}

	}

	@Override
	public String toString()
	{
		StringBuilder result = new StringBuilder(super.toString());
		result.append("\n Author: "+this.author);
		result.append("\n ISBN: "+ISBN);
		result.append("\n Genre : "+this.genre.toString());
		return result.toString();
	}
}
