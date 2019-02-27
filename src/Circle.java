import java.awt.Color; // to give the circle colors

public class Circle {
	private float x;
	private float y;
	private float radius;
	private Color color;
	
	public Circle() 
	{
		x = 0;
		y = 0;
		radius = 1;
		color = Color.DARK_GRAY;
	}
	
	public Circle(float x, float y, float radius, Color color)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	
	public void draw()
	{
		StdDraw.setPenColor(color);
		StdDraw.filledCircle(x, y, radius);
		
	}
	
	public void move(float newX, float newY)
	{
		x = newX;
		y = newY;
	}
}
