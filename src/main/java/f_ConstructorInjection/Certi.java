package f_ConstructorInjection;

import f_ConstructorInjectionAmbiguityProblem.Addition;

/**
 * May 30, 2025 , 10:15:02 PM
 * 
 * Refer this for Constructor Ambiguity Problem
 * @see Addition
 * 
 */
public class Certi {
	String name;

	public Certi() {
		super();
	}
	
	public Certi(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
