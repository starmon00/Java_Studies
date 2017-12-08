import java.awt.Rectangle;;

public class PerimeterTester
{
	public static void main(String[] args)
	{
		Rectangle box = new Rectangle(0,0,100,100);
		System.out.println(box.getWidth());
		System.out.println(box.getHeight());
		System.out.println("Total Perimeter: " + (box.getWidth() + box.getHeight()));
	}
}