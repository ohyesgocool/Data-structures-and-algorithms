package JavaPrograms;

public class RemoveSpaces {

	public static String removeSpeces(String s) {

		String newMysz = s.replace(" ", "");
		return newMysz;
	}

	public static void main(String[] args) {

		System.out.println(removeSpeces("Elon Musk"));
		System.out.println(removeSpeces("Sundar Pichai"));
	}

}
