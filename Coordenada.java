

public class Coordenada {
	private double x;
	private double y;
	
	public Coordenada() {
		this.x = 0;
		this.y = 0;
	}
	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Coordenada(Coordenada c) {
		this.x = c.x;
		this.y = c.y;
	}
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double distancia(Coordenada c) {
		double dis = Math.sqrt( Math.pow( c.x-this.x, 2 ) + Math.pow( c.y-this.y, 2));
		return dis;
	}
	public static double distancia(Coordenada c1, Coordenada c2) {
		double dis = Math.sqrt( Math.pow( c2.x-c1.x, 2 ) + Math.pow( c2.y-c1.y, 2));
		return dis;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + y + ")";
	}
	
}