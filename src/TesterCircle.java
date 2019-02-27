import java.awt.Color;

public class TesterCircle {

	public static void main(String[] args)
	{
		Circle circleOne = new Circle();
		Circle circleTwo = new Circle(1, 1, 0.5f, Color.cyan);
		
		float x = 0;
		float y = 0;
		float delta = 0.03f;//for animation
		
		StdDraw.setXscale(-4, 4);
		StdDraw.setYscale(-4, 4);
		
		while(true)
		{
			if (x <= 5 && y <= 5)
				{
				StdDraw.clear(); //clears the image
				
				circleOne.draw();
				circleTwo.draw();
				
				x += delta;
				y += delta; //this will add delta to x and then store it to x
				
				circleOne.move(x,y);
				circleTwo.move(x, y);
			
				if(x >= 3 || y >= 3) {
					delta *= -1;
				}
				
				if(x <= -3 || y <= -3) {
					delta *= -1;
				}
				StdDraw.show(20); //fps
			}
			/*
			else if (x >= 3 && y >= 3)//resets the circle
				{
					StdDraw.clear(); //clears the image
					
					x = -5;
					y = -5;
					
					circleOne.draw();
					circleTwo.draw();
					
					StdDraw.show(20);
				}
		/*if (x = 5 && y = 5)//wrong
		{
	StdDraw.clear(); //clears the image
	
	circleOne.draw();
	circleTwo.draw();
	
	x -= delta;
	y -= delta; //this will add delta to x and then store it to x
	
	circleOne.move(x,y);
	circleTwo.move(x, y);
	
	StdDraw.show(20); //fps
		}*/
	}
}
}
