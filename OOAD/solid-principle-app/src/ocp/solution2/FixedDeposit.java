package ocp.solution2;

public class FixedDeposit {

	private int accno;
	private String name;
	private double principle;
	private int duration;
	private IFestivalRate festivalRate;

	public FixedDeposit(int accno, String name, double principle, int duration,
			IFestivalRate festivalRate) {
		this.accno = accno;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festivalRate = festivalRate;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getDuration() {
		return duration;
	}

	public double calculateSimpleInterest() {
		return ((principle * festivalRate.calculateRate() * duration) / 100);
	}
}
