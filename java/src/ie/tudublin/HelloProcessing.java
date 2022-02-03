package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(255, 0, 0);

		
		
	}


	public void draw()
	{	stroke(0,0,0);

		
		fill(255, 255, 0);
		circle(250, 250, 450);// cx cy , r

		
		fill(0, 255, 255);
		triangle(250, 0, 50, 450, 450, 450); // x1, y1, x2, y2, x3, y3

		fill(211,211,211);
		ellipse(250, 180, 150, 90); // cx, cy, w, h

	
		fill(0,0,0);
		circle(250, 180, 56);// cx cy , r


		//line(10, 10, 200, 200); // (x1, y1, x2, y2); origin is top left at (0, 0) instead of bottom left we are used to.
		//circle(200, 250, 56);// cx cy , r
		//ellipse(50, 200, 90, 200); // cx, cy, w, h

		//fill(0);
		//noFill();


		//rectMode(CENTER);
		//rect(300, 20, 100, 100); // tlx, tly, w, h

		//rectMode(CORNER);
		//rect(300, 20, 100, 100); // tlx, tly, w, h

		//point(20, 200);

		//triangle(10, 400, 50, 450, 300, 200); // x1, y1, x2, y2, x3, y3
	}
}
