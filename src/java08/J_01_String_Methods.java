package java08;

public class J_01_String_Methods {

	public static void main(String[] args) {
		String course1 = "java programming";
		String course2 = "JAVA PROGRAMMING";
		String version = "\t21";
		String email = "dongsdet@gmail.com";
		String space = "	";

		System.out.println(course1.charAt(5));

		System.out.println(course1.concat(version));
		System.out.println(course1 + " " + version.trim());

		System.out.println(course1.startsWith("j"));
		System.out.println(course1.endsWith("ing"));
		System.out.println(course1.contains("pro"));

		System.out.println(course1.equals("java programming"));
		System.out.println(course1.equals(course2));
		System.out.println(course1.toUpperCase().equals(course2));
		System.out.println(course1.equals(course2.toLowerCase()));
		System.out.println(course1.equalsIgnoreCase(course2));

		System.out.println(course1.length());

		System.out.println(course1.replace("programming", "testing"));

		System.out.println(course1.substring(5));
		System.out.println(course1.substring(5, 8));

		char[] cArr = course1.toCharArray();
		for (char c : cArr) {
			System.out.print(c + " ");
		}
		System.out.println();

		String[] mailArr = email.split("@");
		for (String m : mailArr) {
			System.out.println(m);
		}

		System.out.println(space.isBlank());
		System.out.println(space.isEmpty());

	}

}
