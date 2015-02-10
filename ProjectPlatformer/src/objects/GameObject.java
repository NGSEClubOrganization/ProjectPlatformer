package objects;

import java.awt.Rectangle;

public abstract class GameObject {
	
	private double x;
	private double y;
	
	private double vx;
	private double vy;
	
	private double width;
	private double height;
	
	
	public abstract void updateState();
	
	public GameObject(double x, double y, double width, double height){
		setPosition(x,y);
		this.width = width;
		this.height = height;
	}
	
	public double getLeftX(){
		return x;
	}
	public double getRightX() {
		return x + width;
	}
	
	public double getTopY(){
		return y;
	}
	public double getBottomY() {
		return y + height;
	}
	
	public void setPosition(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getVX(){
		return vx;
	}
	
	public double getVY(){
		return vy;
	}
	
	public void setVelocity(double vx, double vy){
		this.vx = vx;
		this.vy = vy;
	}
	
	public Rectangle.Double getHitbox(){
		return new Rectangle.Double(x-width/2,y-height/2, width, height);
	}
	
	public void move(){
		x += vx;
		y += vy;
	}
	
	
	
	
}
