package annotationsReflection.reflection;

public class AccessModifyStaticFields {
    static class Configuration {
        private static String API_KEY = "DEFAULT_KEY";
    }
    public static void main(String[] args) {
        try {
            Class<?> configClass = Configuration.class;
            java.lang.reflect.Field apiKeyField = configClass.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true);
            apiKeyField.set(null, "NEW_SECURE_KEY");
            String modifiedApiKey = (String) apiKeyField.get(null);
            System.out.println("Modified API_KEY: " + modifiedApiKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
