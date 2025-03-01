package lazyInitializedSingleton;

public class Main {
	public static void main(String[] args) {
		LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
		System.out.println(instance1 == instance2); // true
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}
