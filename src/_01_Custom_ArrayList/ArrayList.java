package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] central;

	public ArrayList() {
		central = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {

		return central[loc];
	}

	public void add(T val) {
		T[] central1 = (T[]) new Object[central.length + 1];
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {

	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {

	}

	public void remove(int loc) throws IndexOutOfBoundsException {

	}

	public boolean contains(T val) {

		return false;
	}
}