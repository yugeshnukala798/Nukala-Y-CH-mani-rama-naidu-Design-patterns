package SingletonPattern;

public class Singleton {
	private static Singleton inst=null;
	public String s;
	private Singleton(){
		s="Constructor of singleton class";
	}
	public static Singleton Singleton() {
		if(inst==null)
			inst=new Singleton();
		return inst;
	}
}