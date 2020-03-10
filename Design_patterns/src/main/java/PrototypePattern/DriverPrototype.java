package PrototypePattern;

public class DriverPrototype {
	public DriverPrototype() {
		System.out.println();
		System.out.println("-----Prototype_Pattern-----");
		ColorStore.getColor("blue").addColor(); 
	    ColorStore.getColor("black").addColor(); 
	    ColorStore.getColor("black").addColor(); 
	    ColorStore.getColor("blue").addColor(); 
	}
}

