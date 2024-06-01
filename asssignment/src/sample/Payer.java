package sample;

public class Payer {
		    private int id;
		    private String name;
		    private int iccRank;
		    private int matchesPayed;
		    private int runsScored;

		    public Payer(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
		        this.id = id;
		        this.name = name;
		        this.iccRank = iccRank;
		        this.matchesPayed = matchesPayed;
		        this.runsScored = runsScored;
		    }

		    public int getId() {
		        return id;
		    }

		    public void setId(int id) {
		        this.id = id;
		    }

		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    public int getIccRank() {
		        return iccRank;
		    }

		    public void setIccRank(int iccRank) {
		        this.iccRank = iccRank;
		    }

		    public int getMatchesPayed() {
		        return matchesPayed;
		    }

		    public void setMatchesPayed(int matchesPayed) {
		        this.matchesPayed = matchesPayed;
		    }

		    public int getRunsScored() {
		        return runsScored;
		    }

		    public void setRunsScored(int runsScored) {
		        this.runsScored = runsScored;
		    }
		}

		


