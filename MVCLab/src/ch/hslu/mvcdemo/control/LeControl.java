package ch.hslu.mvcdemo.control;

import ch.hslu.mvcdemo.model.Person;
import ch.hslu.mvcdemo.view.PersonView;

public class LeControl {

	public static void main(String[] args) {
		Person p = new Person("de Name", "de Vorname");
		System.out.println(p);
		
		PersonView.createAndShowGUI();
	}

}
