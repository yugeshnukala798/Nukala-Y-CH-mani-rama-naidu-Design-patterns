package BridgePattern;

public class DriverBridge {
	public DriverBridge() {
		System.out.println();
		System.out.println("-----BridgePattern-----");
		Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape blueCircle = new Circle(100,100, 10, new BlueCircle());

        redCircle.draw();
        blueCircle.draw();
	}
}
