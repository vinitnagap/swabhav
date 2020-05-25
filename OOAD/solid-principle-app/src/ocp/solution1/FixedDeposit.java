package ocp.solution1;

public class FixedDeposit implements ISimpleInterest {

	private int accno;
	private String name;
	private double principle;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(int accno, String name, double principle, int duration,
			FestivalType festival) {
		this.accno = accno;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}

	private float calculateRate() {
		if (festival == FestivalType.DIWALI)
			return 0.08f;
		if (festival == FestivalType.RAMZAN)
			return 0.09f;
		if (festival == FestivalType.NORMAL)
			return 0.07f;
		return 0;

	}

	@Override
	public double calculateSimpleInterest() {
		return ((principle * calculateRate() * duration) / 100);
	}

}
