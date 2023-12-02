package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> elements = new CustomArrayList<>();
		
		elements.add("element 1");
		elements.add("element 2");
		elements.add("element 3");
		elements.add("element 4");
		elements.add("element 5");
		System.out.println(elements.getSize());
		
		elements.add("element 6");
		elements.add("element 7");
		elements.add("element 8");
		elements.add("element 9");
		elements.add("element 10");
		System.out.println(elements.getSize());
		
		elements.add("element 11");
		elements.add("element 12");
		elements.add("element 13");
		elements.add("element 14");
		elements.add("element 15");
		System.out.println(elements.getSize());
		
		elements.add("element 16");
		elements.add("element 17");
		elements.add("element 18");
		elements.add("element 19");
		elements.add("element 20");
		System.out.println(elements.getSize());
		
		elements.add("element 21");
		elements.add("element 22");
		elements.add("element 23");
		elements.add("element 24");
		elements.add("element 25");	
		System.out.println(elements.getSize());
		
		for(int i= 0; i < elements.getSize(); i++) {
			System.out.println(elements.get(i));
		}
	}

}
