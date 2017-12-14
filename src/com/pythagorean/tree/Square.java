package com.pythagorean.tree;

import java.math.BigDecimal;

public class Square {

	private final int depth;
	private final BigDecimal side;
	private final Point v1;
	private final Point v2;
	private final Point v3;
	private final Point v4;
	// private Square left;
	// private Square right;

	// private final Square previous;
	public Square(Point startingPoint, BigDecimal side, int depth, BigDecimal angle) {
		this.depth = depth;
		this.side = side;

		final BigDecimal depthAngle = angle.multiply(new BigDecimal(depth));
		
		final BigDecimal x = side.multiply(cos(depthAngle));
		final BigDecimal y = side.multiply(sin(depthAngle));

		// X' = L2*sinAlfa
		// Y' = L2*cosAlfa
		// X= L2*(cosAlfa)
		// Y = L2*sinAlfa
		//
		//
		// V1(5,5)
		// V2 = (v1x-x',v1y+y')
		// V3 = (v1x-x'+x,v1y+y+y')
		// V4= (v1x+x,v1y+Y)

		this.v1 = startingPoint;
		this.v2 = new Point(v1.getX().subtract(y), v1.getY().add(x));
		this.v3 = new Point(v1.getX().subtract(y).add(x), v1.getY().add(x).add(y));
		this.v4 = new Point(v1.getX().add(x), v1.getY().add(y));
	}

	private static BigDecimal cos(BigDecimal angle) {
		BigDecimal hypotenuse = new BigDecimal(1);
		
		
		
		return null;
	}

	private static BigDecimal sin(BigDecimal angle) {
		return null;
	}

	// private Point getV1(BigDecimal angle2){
	// if (depth == 1 )
	// //cosAngle
	// //sinAngle
	//// v1 = new Point(,);
	// }
	//
	// private Point getV2(BigDecimal angle2){}
	// private Point getV3(BigDecimal angle2){}
	// private Point getV4(BigDecimal angle2){}

	public Square getLeft() {
		return null;
	}

	public Square getRight() {
		return null;
	}

}
