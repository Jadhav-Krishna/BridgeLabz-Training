package annotationsReflection.annotations;
import java.lang.annotation.*;
import java.util.*;
import java.lang.reflect.Method;


public class CacheResultA {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface CacheResult {
    }

    public class CacheManager {
        private static final Map<String, Object> cache = new HashMap<>();

        public static boolean contains(String key){
            return cache.containsKey(key);
        }

        public static Object get(String key){
            return cache.get(key);
        }

        public static void put(String key, Object value){
            cache.put(key, value);
        }
    }

    public static class MathService {

        @CacheResult
        public int heavyCalculation(int num){
            System.out.println("Heavy calculation running...");
            try { Thread.sleep(3000); } catch(Exception e){}
            return num * num;
        }
    }

    public class CacheExecutor {

        public static Object execute(Object obj, String methodName, Object... args) throws Exception {

            Method[] methods = obj.getClass().getDeclaredMethods();

            for(Method m : methods){
                if(m.getName().equals(methodName)){

                    if(m.isAnnotationPresent(CacheResult.class)){

                        String key = methodName + "_" + args[0];

                        if(CacheManager.contains(key)){
                            System.out.println("✅ Returning cached result");
                            return CacheManager.get(key);
                        }

                        Object result = m.invoke(obj, args);
                        CacheManager.put(key, result);
                        return result;
                    }
                    else{
                        return m.invoke(obj, args);
                    }
                }
            }
            return null;
        }
    }

    public class Main {
        public static void main(String[] args) throws Exception {

            MathService service = new MathService();

            System.out.println(CacheExecutor.execute(service, "heavyCalculation", 5));
            System.out.println(CacheExecutor.execute(service, "heavyCalculation", 5));
            System.out.println(CacheExecutor.execute(service, "heavyCalculation", 10));
            System.out.println(CacheExecutor.execute(service, "heavyCalculation", 5));
        }
    }



}
