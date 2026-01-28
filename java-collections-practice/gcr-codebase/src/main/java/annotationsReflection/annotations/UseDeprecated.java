package annotationsReflection.annotations;

class LegacyAPI {
	@Deprecated
	public void oldFeature() {
		System.out.println(" This is the OLD feature (deprecated)");
		System.out.println(" Please use newFeature() instead!");
	}
	

	public void newFeature() {
		System.out.println(" This is the NEW feature (recommended)");
		System.out.println(" This method provides better functionality!");
	}
}

public class UseDeprecated {

	public static void main(String[] args) {
		System.out.println("=== Exercise 2: @Deprecated Annotation Demo ===\n");
		
		LegacyAPI api = new LegacyAPI();
		
		System.out.println("Calling the deprecated method:");
		api.oldFeature();
		
		System.out.println("\nCalling the new method:");
		api.newFeature();
		
		System.out.println("\n Note: The oldFeature() method will show a strikethrough");
		System.out.println("   in the IDE and generate a compiler warning.");
		System.out.println("   Check your IDE or compile with 'javac -Xlint:deprecation'");
		System.out.println("   to see the deprecation warnings.");
	}

}
