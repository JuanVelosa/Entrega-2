package model;
import exceptions.NegativeWeightException;
public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String n, double w) {
		name = n;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) throws NegativeWeightException {
		if(additionalW<0) {
			throw new NegativeWeightException(name, additionalW);
		}else {
			weight = weight + additionalW;
		}
	}
	
	public void removeWeight(double additionalW) throws NegativeWeightException{
		if(additionalW<0) {
			throw new NegativeWeightException(name, additionalW);
		}else {
			weight = weight - additionalW;
		}
	}
}
