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

	public void colision(Player obj1, Player obj2)
	{    					
		if(obj1.getX() + obj1.getWidth() >= obj2.getX() && obj1.getX() <= obj2.getX() + obj2.getWidth() &&
		obj1.getY() + obj1.getHeight() >= obj2.getY() && obj1.getY() <= obj2.getY() + obj2.getHeight())
		{
			System.out.println("puuum");
		}
			
	}
}
