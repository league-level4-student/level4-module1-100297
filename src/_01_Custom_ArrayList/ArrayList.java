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
		for (int i = 0; i < central.length; i++) {
			central1[i] = central[i];
		}
		central1[central1.length - 1] = val;
		central = central1;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] central1 = (T[]) new Object[central.length + 1];
	int ctr = 0;
	for (int i = 0; i < central1.length; i++) {
		if(i == loc) {
			central1[i] = val;
		} else {
			central1[i] = central[ctr++];
		}
	}
		central = central1;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		central[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] central1 = (T[]) new Object[central.length - 1];
		for (int i = 0; i < central1.length; i++) {
			if(i < loc) {
				central1[i] = central[i];
			} else {
				central1[i] = central[i+1];
			}
		}
	central = central1;
	}

	public boolean contains(T val) {
		boolean tr = false;
		for (int i = 0; i < central.length; i++) {
			if(central[i] == val) {
				tr = true;
			}
		}
		return tr;
	}

	public int size() {
		// TODO Auto-generated method stub
		return central.length;
	}
}