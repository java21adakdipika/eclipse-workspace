package account.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

import account.model.Account;
import account.model.CurrentAccount;
import account.model.SavingAccount;

public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Class Name: ");
		String className = sc.nextLine();
		
		Class<?> tempClass = Class.forName(className);
		System.out.println("****************************************");
		
		Field[] declaredFields = tempClass.getDeclaredFields();
		
		for(Field f:declaredFields) {
			System.out.println(f);
		}
		
		System.out.println("****************************************");
		
		Constructor<?>[] declaredConstructor = tempClass.getConstructors();
		
		for(Constructor c:declaredConstructor) {
			System.out.println(c);
		}
		
		System.out.println("****************************************");
		
		Method[] methods = tempClass.getMethods();
		
		for(Method m:methods) {
			System.out.println(m);
		}
		
		System.out.println("****************************************");
		
		Class<? super SavingAccount> superClass = SavingAccount.class.getSuperclass();
		System.out.println(superClass.getSimpleName());
	}
	

}
