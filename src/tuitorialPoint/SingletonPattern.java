package tuitorialPoint;

public class SingletonPattern {
	private static SingletonPattern  singleton  = null;
	private SingletonPattern(){}
	public static SingletonPattern getInstance(){
		if (singleton == null){
			singleton  = new SingletonPattern();
		}
		return singleton;
	}
	

}
