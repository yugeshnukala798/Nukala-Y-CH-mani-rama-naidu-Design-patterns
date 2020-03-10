package TemplatePattern;

public class DriverTemplate {
	public DriverTemplate(){
		System.out.println();
		System.out.println("-----Template_Pattern-----");
    	OrderProcess netOrder = new NetOrder(); 
        netOrder.processOrder(true); 
        System.out.println(); 
        OrderProcess storeOrder = new StoreOrder(); 
        storeOrder.processOrder(true); 
	}
}
