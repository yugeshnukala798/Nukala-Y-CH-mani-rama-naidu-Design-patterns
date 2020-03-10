package AdapterPattern;

public class DriverAdapter {
	public DriverAdapter() {
		System.out.println("-----AdapterPattern-----");
		Sparrow sparrow = new Sparrow(); 
	    ToyDuck toyDuck = new PlasticToyDuck(); 
	    ToyDuck birdAdapter = new BirdAdapter(sparrow); 
	    System.out.println("ToyDuck..."); 
	    toyDuck.squeak(); 
	    System.out.println("BirdAdapter..."); 
	    birdAdapter.squeak(); 
	    System.out.println("Sparrow..."); 
	    sparrow.fly(); 
	    sparrow.makeSound(); 
	}
}
