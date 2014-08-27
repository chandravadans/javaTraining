
public class A7
{
	public static void main(String[] args)
	{
		StringBuilder stringBuilder = new StringBuilder(50);
		stringBuilder.append("Hello citi!");
		System.out.println(stringBuilder.delete(2, 4));
		System.out.println(stringBuilder.deleteCharAt(4));
		System.out.println(stringBuilder.insert(2, "text"));
		System.out.println(stringBuilder.replace(1, 5, "Hello!"));
		stringBuilder.setCharAt(0, 'Z');
		System.out.println(stringBuilder);
		//stringBuilder.reverse();
		System.out.println(stringBuilder.toString());
		
	}
}
