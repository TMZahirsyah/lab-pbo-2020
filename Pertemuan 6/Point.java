public class Point {
 	private int x;
 	private int y;

 	public Point()
 	{
 		x = 0;
 		y = 0;
 	}

 	public Point(int x, int y)
 	{
 		this.x = x;
 		this.y = y;
 	}

 	public int getX()
 	{
 		return this.x;
 	}

 	public void setX(int x)
 	{
 		this.x = x;
 	}

 	public int getY()
 	{
 		return this.y;
 	}

 	public void sety(int y)
 	{
 		this.y = y;
 	}

 	public String toString()
 	{
 		return "Titik dengan x=" +x+ " y=" +y ;
 	}
}

/*
line 5 dan 11 merupakan method constructor
line 17 merupakan method Accessor 
line 22 merupakan method Mutator
line 27 merupakan method Accessor  
line 32 merupakan method Mutator  
line 37 meruapakn method toString yang berfungsi untuk menampilkan titik x dan y*
*/