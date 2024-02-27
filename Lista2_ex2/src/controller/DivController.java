package controller;

public class DivController {

	public DivController() {
		super();
	}
	public int DivFunc(int a, int b) {
		if (a < b) {
			return a;
		}else {
			a = a-b;
			return DivFunc(a, b);
		}
	}

}
