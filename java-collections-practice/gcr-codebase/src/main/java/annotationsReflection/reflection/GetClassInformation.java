package annotationsReflection.reflection;

public class GetClassInformation {

	public static void main(String[] args) {
		try {
			String className = "java.util.ArrayList";

			Class<?> cls = Class.forName(className);

			System.out.println("Methods:");
			var methods = cls.getDeclaredMethods();
			for (var method : methods) {
				System.out.println(method);
			}

			System.out.println("\nFields:");
			var fields = cls.getDeclaredFields();
			for (var field : fields) {
				System.out.println(field);
			}

			System.out.println("\nConstructors:");
			var constructors = cls.getDeclaredConstructors();
			for (var constructor : constructors) {
				System.out.println(constructor);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found: " + e.getMessage());
		}

	}

}
