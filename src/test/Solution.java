package test;


public class Solution {

	private int instanceVar;

	public Solution(int instanceVar) {
		this.instanceVar = instanceVar;
	}

	public void instanceMethod() {
		System.out.println("Valoarea variabilei de instanta este...: " + instanceVar);
	}

	public static void staticMethod(Solution obj) {
		obj.instanceMethod();
		System.out.println("Valoarea variabilei de instanta este..: " + obj.instanceVar);
	}
}
	class Main {

		public static void main(String[] args) {

			Solution obj = new Solution(10);
			Solution.staticMethod(obj);

	}
}
