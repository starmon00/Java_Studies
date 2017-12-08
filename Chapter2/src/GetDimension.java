import java.awt.Rectangle;
public class GetDimension
{
	public static void main(String[] args)
	{
		Rectangle boxarea = new Rectangle(0,0, 2, 21 );
		Rectangle boxperim = new Rectangle(0,0, 30, 12);
		System.out.println("Box Area: " + (boxarea.getWidth() * boxarea.getHeight()));
		System.out.println(boxarea.getWidth());
		System.out.println(boxarea.getHeight());
		System.out.println("Box Perimeter: " + (boxperim.getWidth() + boxperim.getHeight()));
		System.out.println(boxperim.getWidth());
		System.out.println(boxperim.getHeight());	
	}
}