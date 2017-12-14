package com.pythagorean.tree;

import java.math.BigDecimal;

public class Point {
	private final BigDecimal x;
	private final BigDecimal y;

	public Point(int x, int y) {
		this(new BigDecimal(x), new BigDecimal(y));
	}
	
	public Point(BigDecimal x, BigDecimal y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + ((y == null) ? 0 : y.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append('(').append(x).append(", ").append(y).append(')');
		return builder.toString();
	}

	public BigDecimal getX() {
		return x;
	}

	public BigDecimal getY() {
		return y;
	}
}