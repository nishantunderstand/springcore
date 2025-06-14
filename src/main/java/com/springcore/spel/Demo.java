package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * SpEL
 * Spring Expression Language
 * {@link }
 */

@Component
public class Demo {
	
	@Value("#{1+1}")
	private int x;
	
	@Value("#{2+3+4+5+7}")
	private int y;

	@Value("#{ T(java.lang.Math).sqrt(144)}")
	private double z;

	@Value("#{T(java.lang.Math).PI}")
	private double e;

	@Value("#{new java.lang.String('Aman')}")
	private String name;

	@Value("#{8-2>3}")
	private boolean isActive;

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
}
