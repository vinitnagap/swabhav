package com.techlab.circle;

public class Circle {
	private float radius;
	private final float PI = 3.14f ;
	
	public float getRadius(){
		return radius;
	}
	public void setRadius(float fradius){
		 radius = fradius ;
	}
	
	public float calculateArea(){
		float area = PI * radius * radius ;
		return area;
	}
	
	public float calculatePerimeter(){
		float perimeter = 2 * PI * radius;
		return perimeter;
		
	}

}
