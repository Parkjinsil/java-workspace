package com.kh.practice.Controller;

import com.kh.practice.model.Rectangle;

public class RectangleController {

	Rectangle r = new Rectangle();

	public RectangleController() {};
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return r.draw()+width * height;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return r.draw()+2 * (width + height);
	}
}
