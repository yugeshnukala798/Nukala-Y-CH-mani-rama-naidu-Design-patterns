package CommandPattern;

public class LightsOnCmd implements Command{
	  //reference to the light
	  Light light;
	  public LightsOnCmd(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switchOn();
	    System.out.println("Light on");
	  }
	}
