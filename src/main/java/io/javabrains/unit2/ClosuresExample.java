package io.javabrains.unit2;

public class ClosuresExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		doProcess(a, i -> System.out.println(i + b));

	}
	
	
	public static void doProcess(int a, Process p) {
		p.process(a);
	}

}

interface Process {
	void process(int i);
}
