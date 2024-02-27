package main;

import controller.DivController;

public class Principal {

	public static void main(String[] args) {
		DivController dc = new DivController();
		int a = 15;
		int b = 4;
		int res = dc.DivFunc(a, b);
		System.out.println(res);
	}

}
