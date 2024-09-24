package ar.edu.unq.po2.tp3;

public class Cuadrado {
	private Point position;  // Posición (x, y) del rectángulo
    private int width;       // Ancho del rectángulo
    private int height;      // Alto del rectángulo

    // Constructor para crear un rectángulo en una posición y con un tamaño específico
    public Cuadrado(Point position, int largoDeLados) {
        this.position = position;
        this.width = largoDeLados;
        this.height = largoDeLados;
    }
    public Cuadrado() {
        this(new Point(), 3);
    }
    
    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return this.width*2 + this.height*2;
    }
}
