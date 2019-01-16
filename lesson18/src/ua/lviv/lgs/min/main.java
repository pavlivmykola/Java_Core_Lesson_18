package ua.lviv.lgs.min;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		
		// Тут ігра букв. На перший погляд list має складатися
		// з цілих чисел integer але задано Integers. 
		// Отже створюємо клас Integers з полем String і створєюмо
		// список такого типу Integers і спокійно в нього додаєм
		// об'єкт типу String
		
		
		List<Integers> list = new ArrayList<Integers>();
		list.add(new Integers("I put String into list"));
		System.out.println(list.get(0).toString());

	}

}
