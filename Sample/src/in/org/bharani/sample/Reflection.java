package in.org.bharani.sample;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
	public static void main(String asrgs[])
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		ReflectionData ref = new ReflectionData();
		Field f[] = ref.getClass().getDeclaredFields();
		{
			f[0].setAccessible(true);
			f[0].set(ref, "name changed");
			String a = (String) f[0].get(ref);
			System.out.println(a);

			f[1].setAccessible(true);
			f[1].set(ref, 66);
			int b = (int) f[1].get(ref);
			System.out.println(b);

			Method m[] = ref.getClass().getDeclaredMethods();
			m[0].setAccessible(true);
			System.out.println(m[0].invoke(ref));

			m[1].setAccessible(true);
			System.out.println(m[1].invoke(ref));
		}
	}
}
