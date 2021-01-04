public class Line
{
 	private Point begin;
 	private Point end;

	public Line(int x1, int y1, int x2, int y2)
 	{
 		begin = new Point(x1, y1);
 		end = new Point(x2, y2);
 	}

 	public Line(Point begin, Point end)
 	{
 		this.begin = begin;
 		this.end = end;
 	}

 	public Point getBegin()
 	{
 		return begin;
 	}

 	public void setBegin(Point begin)
 	{
 		this.begin = begin;
 	}

 	public Point getEnd()
 	{
 		return end;
 	}

 	public void setEnd(Point end)
 	{
 		this.end = end;
 	}
}

/*
line 6 dan 12 merupakan method constructor
line 18 merupakan method Accessor 
line 23 merupakan method Mutator
line 28 merupakan method Accessor  
line 33 merupakan method Mutator  
*/

*/