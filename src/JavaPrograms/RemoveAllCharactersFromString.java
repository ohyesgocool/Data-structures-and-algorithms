package JavaPrograms;

/*Function to remvoe all charaters from string 
Function to implement a specific char from string */

public class RemoveAllCharactersFromString {
	
	public static String allChar(String s)
	{

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		return s;
	}

	public static String speceficChar(String s1 , String s2 )
	{
		s1 = s1.replace(s2, "");
		return s1;
	}
	public static void main(String[] args) {
		
		System.out.println("Elon Musk - After removing all character is : "+allChar("Elon Musk"));
		System.out.println("Elon Musk - After removing specificcharacter is : "+speceficChar("Elon Musk" , "M"));
		System.out.println("Sundar Pichai - After removing all character is : "+allChar("Sundar Pichai"));
		System.out.println("Sundar Pichai - After removing specificcharacter is : "+speceficChar("Sundar Pichai" , "P"));

	}

}
