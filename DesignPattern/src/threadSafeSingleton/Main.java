package threadSafeSingleton;

public class Main {
	public static void main(String[] args) {
		ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
		System.out.println("instance1 hashcode: " + instance1.hashCode());
		System.out.println("instance2 hashcode: " + instance2.hashCode());
		
		ThreadSafeSingleton instance3 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		ThreadSafeSingleton instance4 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println("instance3 hashcode: " + instance3.hashCode());
		System.out.println("instance4 hashcode: " + instance4.hashCode());
	}

}
