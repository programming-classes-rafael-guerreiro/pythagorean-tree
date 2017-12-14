package com.pythagorean.tree;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {
		final BigDecimal first = new BigDecimal(5);
		final BigDecimal second = new BigDecimal(4);
		final BigDecimal third = new BigDecimal(3);
		
		final BigDecimal angle = new BigDecimal(0);
		
		
		new Square(new Point(0, 0), new BigDecimal(5), 0, angle);
		
		
	}
}
