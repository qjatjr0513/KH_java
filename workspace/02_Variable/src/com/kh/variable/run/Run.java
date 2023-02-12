package com.kh.variable.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Cast;
import com.kh.variable.D_Printf;

public class Run {
	public static void main(String[] args) {
		A_Variable a = new A_Variable();
		B_KeyboardInput b = new B_KeyboardInput();
		//a.printVariable();
		//a.declareVariable();
		//a.initVariable();
		//a.constant();
		//b.inputTest1();
		//b.inputTest2();
		C_Cast c = new C_Cast();
		//c.autoCasting();
		//c.forceCasting();
		D_Printf d = new D_Printf();
		d.printfTest();
	}
}
