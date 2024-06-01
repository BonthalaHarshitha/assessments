package sample;

public class Sim2 {

	    private int id;
	    private String company;
	    private int balance;
	    private double ratePerSecond;
	    private String circle;

	    public Sim2(int id, String company, int balance, double ratePerSecond, String circle) {
	        this.id = id;
	        this.company = company;
	        this.balance = balance;
	        this.ratePerSecond = ratePerSecond;
	        this.circle = circle;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getCircle() {
	        return circle;
	    }

	    public double getRatePerSecond() {
	        return ratePerSecond;
	    }

	    public int getBalance() {
	        return balance;
	    }
	}
	

	
