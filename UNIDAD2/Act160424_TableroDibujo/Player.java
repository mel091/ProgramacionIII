package Act160424_TableroDibujo;

public class Player 
{
	private int x, y, width, height;
	private String color;
	
	public Player(int x, int y, int width, int height, String color)
	{
		this.x = x ;
		this.y = y ;
		this.width = width ;
		this.height = height ;
		this.color = color ;
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean colision(Player p, int newX, int newY) {
	    if (newX + this.width > p.x && newX < p.x + p.width && newY + this.height > p.y && newY < p.y + p.height) 
	    {
	        return true; // Hay colisión
	    }
	    return false; // No hay colisión
	}

}
