package inheritance;

public class Batsman extends Player {
	private int runsScored,centuries,halfCenturies,ballsFaced,sixes,fours;
	public Batsman() {
		
	}
	public Batsman(String name,int runsScored,int centuries,int halfCenturies,int ballsFaced,int sixes,int fours) {
		super(name);
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.sixes = sixes;
		this.fours = fours;
		
	}
	public void setrunsScored(int runScored) {
		this.runsScored = runScored;
	}
	public void setcenturies(int centuries) {
		this.centuries = centuries;
	}
	public void sethalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}
	public void setballsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}
	public void setsixes(int sixes) {
		this.sixes = sixes;
	}
	public void setfours(int fours) {
		this.fours = fours;
	}
	public int getrunsScored() {
		return runsScored;
	}
	public int getcenturies() {
		return centuries;
	}
	public int gethalfCenturies() {
		return halfCenturies;
	}
	public int getballsFaced() {
		return ballsFaced;
	}
	public int getsixes() {
		return sixes;
	}
	public int getfours() {
		return fours;
	}
	
	

}
