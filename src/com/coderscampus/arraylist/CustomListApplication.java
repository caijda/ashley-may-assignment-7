package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> elements = new CustomArrayList<>();
		

		for (int i = 0; i < 25; i++){
			elements.add("element " + (i+1));

			if ((i+1) % 5 == 0){
				System.out.println(elements.getSize());
			}
		}
		
		for(int i= 0; i < elements.getSize(); i++) {
			System.out.println(elements.get(i));
		}
	}

}
