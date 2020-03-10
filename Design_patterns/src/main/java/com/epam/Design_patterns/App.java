package com.epam.Design_patterns;
import AdapterPattern.*;
import BridgePattern.*;
import CommandPattern.*;
import PrototypePattern.*;
import TemplatePattern.*;
import SingletonPattern.*;

public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
        DriverAdapter ap = new DriverAdapter();
        DriverBridge bp = new DriverBridge();
        DriverCommand cp = new DriverCommand();
        DriverPrototype ip = new DriverPrototype();
        DriverSingleton fp = new DriverSingleton();
        DriverTemplate afp = new DriverTemplate();
        
    }
}
