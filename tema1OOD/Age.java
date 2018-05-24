package tema1OOD;

public interface Age {
	
	int getYears();
	int getMonths();
	int getDays();
	
	int relativeCompareTo(Age x);
	int compareTo(Age x);
	
	Age getRelativeAge();
	Age getAbsoluteAge();

}
