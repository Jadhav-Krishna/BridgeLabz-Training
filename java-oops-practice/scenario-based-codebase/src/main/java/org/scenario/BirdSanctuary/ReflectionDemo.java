package org.scenario.BirdSanctuary;

class ReflectionDemo {

    static void showMetadata(Bird b) {
        Class<?> cls = b.getClass();
        if (cls.isAnnotationPresent(DeveloperInfo.class)) {
            DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
            System.out.println("Developer: " + info.developer());
            System.out.println("Version: " + info.version());
        }
    }
}
