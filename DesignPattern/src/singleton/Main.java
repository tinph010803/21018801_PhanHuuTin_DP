package singleton;

public class Main {
	public static void main(String[] args) {
		EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
