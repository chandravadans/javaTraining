package student.inhertance;

public class DVD extends Item
{

	int playingTime;
	enum Classification
	{
		UNIVERSAL,
		YOUTH,
		ADULT
	};
	
	Classification classification;
	
	public DVD(String theTitle, String classification, int time)
	{
		super(theTitle);
		this.classification = Classification.valueOf(classification);
		this.playingTime = time;
	}
	
	@Override
	public boolean canBeBorrowedBy(Member theMember)
	{
		if(this.classification.equals(Classification.UNIVERSAL))
			return true;
		else if(theMember.getAge()<12 && (this.classification.equals(Classification.YOUTH) || this.classification.equals(Classification.ADULT)))
			return false;
		else if(theMember.getAge()<18 && this.classification.equals(Classification.ADULT))
			return false;
		else
			return true;
	}
	
	@Override
	public String toString()
	{
		StringBuilder result = new StringBuilder(super.toString());
		result.append("\n Classification: "+this.classification.toString());
		result.append("\n Playing Time: "+ playingTime);
		return result.toString();
	}
	
	}
	
	

