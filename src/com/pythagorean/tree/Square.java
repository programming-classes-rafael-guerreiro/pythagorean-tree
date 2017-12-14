package com.pythagorean.tree;

import java.math.BigDecimal;

public class Square {

	private final int depth;
	private final BigDecimal side;
	private final Point v1;
	private final Point v2;
	private final Point v3;
	private final Point v4;
	private Square left;
	private Square right;
	
	// private final Square previous;
	public Square(Point startingPoint, BigDecimal side, int depth) {
		this.depth = depth;
		this.side = side;
		v1 = getV1(angle);
		v2 = getV2(angle);
		v3 = getV3(angle);
		v4 = getV4(angle);
	}
	
	private Point getV1(BigDecimal angle2){
		if (depth == 1 )
		//cosAngle
		//sinAngle
//		v1 = new Point(,);
	}
	
	private Point getV2(BigDecimal angle2){}
	private Point getV3(BigDecimal angle2){}
	private Point getV4(BigDecimal angle2){}
	
}
