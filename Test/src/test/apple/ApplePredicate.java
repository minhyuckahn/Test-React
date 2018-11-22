package test.apple;

//@FunctionalInterface
public interface ApplePredicate<T> {
	boolean MyFunction(T t);
//	void MyFunction(T t, int w); // FunctionalInterface는 하나만 선언해야 함????
}
