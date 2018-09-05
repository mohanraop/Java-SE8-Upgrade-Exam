package ocp.study.part1;

// Single Abstract Method interfaces (SAM Interfaces)
//@FunctionalInterface
public interface FunctionalInterface {
	void doWork();
	
	default void doSomeOtherWork(){
	    System.out.println("Doing some other work in interface impl...");
	  }
}
