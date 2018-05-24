package tema1OOD;

public class DogAge implements Age {
	
	int years;
	int months;
	int days;
	
	public DogAge() {
		
		this.days = 0;
		this.months =0;
		this.years = 0;
	}
	
	public DogAge(int days, int months, int years) {
		
		this.days = days;
		this.months = months;
		this.years = years;
	}
	
	@Override
	public int getYears() {
		return this.years;
	}

	@Override
	public int getMonths() {
		return this.months;
	}

	@Override
	public int getDays() {
		return this.days;
	}

	@Override
	public int relativeCompareTo(Age x) {
		return this.getAbsoluteAge().compareTo(x.getAbsoluteAge());
	}

	@Override
	public int compareTo(Age x) {
		
		if(this.getYears() == x.getYears()) {
			if(this.getMonths() == x.getMonths()){
				return this.getDays() - x.getDays();
			}
			else {
				return this.getMonths() - x.getMonths();
			}
		}
		else {
			return this.getYears() - x.getYears();
		}
	}

	@Override
	public Age getRelativeAge() {
		return this;
	}

	@Override
	public Age getAbsoluteAge() {
		
		int totalNumberOfDays = this.years * 365 + this.months * 30 + this.days;
		totalNumberOfDays *= 7;
		
		int numberOfYears = totalNumberOfDays / 365;
		totalNumberOfDays %= 365;
		
		int numberOfMonths = totalNumberOfDays / 30;
		totalNumberOfDays %= 30;
		
		int numberOfDays = totalNumberOfDays;
		
		return new NormalAge(numberOfYears, numberOfMonths, numberOfDays);
	}

}
