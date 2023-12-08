package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {
		for (int i = 0; i <= items.length; i++) {
			if (i == items.length){
				items = Arrays.copyOf(items, i*2);
			}
			if (items[i] == null) {
				items[i] = item;
				return true;
			}
		}
		return false;
	}

	@Override
	public int getSize() {
		int i = 0;
		for (Object item : items) {
			if (item == null)
				break;
			i++;
		}
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException{
		return (T)items[index];
	}
	/////////////////////////////////////////////////////////////

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		Object[] temp = new Object[items.length];
		int i;
		
		temp[index] = item;
		for (i = 0; i < index; i++){
			if(items[i] != null){
				temp[i] = items[i];
			}
		}
		for (i = index; i < items.length; i++){
			// if (i == items.length && items[i] != null){
			// 	temp = Arrays.copyOf(temp, i*2);
			// }
			if (items[i] != null){
				temp[i+1] = items[i];
			}
		}
		items = temp;

		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'remove'");
	}

}
