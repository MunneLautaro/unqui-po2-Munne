package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	    
	        private Point position;  // Posición (x, y) del rectángulo
	        private int width;       // Ancho del rectángulo
	        private int height;      // Alto del rectángulo

	        // Constructor para crear un rectángulo en una posición y con un tamaño específico
	        public Rectangulo(Point position, int width, int height) {
	            if (width < 0 || height < 0) {
	                throw new IllegalArgumentException("El ancho y el alto deben ser positivos");
	            }
	            this.position = position;
	            this.width = width;
	            this.height = height;
	        }
	        public Rectangulo() {
		        this(new Point(), 1, 2);
		    }
	        
	        public int getArea() {
	            return this.width * this.height;
	        }
	   
	        public int getPerimeter() {
	            return this.width*2 + this.height*2;
	        }
	        
	        public String getOrientation() {
	            if (width > height) {
	                return "Horizontal";
	            } else if (height > width) {
	                return "Vertical";
	            } else {
	                return "Cuadrado";
	            }
	        }
}