import java.awt.Rectangle;

public class AreaTester 
{
	public static void main(String[] args)
	{
		Rectangle box = new Rectangle(0,0, 10, 10);
		System.out.println(box.getWidth());
		System.out.println(box.getHeight());
		System.out.println("Total Area: " + (box.getWidth() * box.getHeight()));
	}
}