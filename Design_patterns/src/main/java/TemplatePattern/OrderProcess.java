package TemplatePattern;

public abstract class OrderProcess {
	public boolean isGift; 
	  
    public abstract void doSelect(); 
  
    public abstract void doPayment(); 
  
    public final void giftWrap() 
    { 
        try
        { 
            System.out.println("Gift wrap successfull"); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Gift wrap unsuccessful"); 
        } 
    } 
  
    public abstract void doDelivery(); 
  
    public final void processOrder(boolean isGift) 
    { 
        doSelect(); 
        doPayment(); 
        if (isGift) { 
            giftWrap(); 
        } 
        doDelivery(); 
    } 
}