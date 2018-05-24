package tema1OOD;

public class NormalAge implements Age {
	
	int days;
	int months;
	int years;
	
	public NormalAge() {
		
		this.days = 0;
		this.months =0;
		this.years = 0;
	}
	
	public NormalAge(int days, int months, int years) {
		
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
		return this;
	}
	
	
}
