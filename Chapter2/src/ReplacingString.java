public class ReplacingString
{
	public static void main(String[] args)
	{
		String word = "Mississippi";
		word = word.replace("i", "ii");
		System.out.println(word);
		System.out.println(word.length());
		word = word.replace("ss", "s");
		System.out.println(word);
		System.out.println(word.length());
	}
}