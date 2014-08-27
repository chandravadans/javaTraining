package student.interfaces;

public interface Reservable
{
	boolean isReserved();
	boolean canBeReservedFor(Member theMember);
	boolean reserveItemFor(Member theMember);
	
	
}
