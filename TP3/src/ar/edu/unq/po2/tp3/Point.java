package ar.edu.unq.po2.tp3;


public class Point {
	private int x;
	private int y;
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
	 public void move(int newX, int newY) {
	        this.x = newX;
	        this.y = newY;
	    }
	
	    public Point add(Point other) {
	        return new Point(this.x + other.x, this.y + other.y);
	    }
	       
}	
	 


	
/*
 * public static Point posicionActual() {
		   Point posicion;
			 
		   int x = 0;
		   int y = 0;
		   
		   posicion = new Point(x, y);

	       return posicion;
		}

  */
 