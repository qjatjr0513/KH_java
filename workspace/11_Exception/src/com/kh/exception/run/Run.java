package com.kh.exception.run;

import java.io.IOException;

import com.kh.controller.A_UncheckedException;
import com.kh.controller.B_CheckedException;
import com.kh.controller.C_CustomException;

public class Run {

	public static void main(String[] args) throws IOException{
		/*
		 * 에러(오류) 종류
		 * 	- 시스템에러 : 컴퓨터의 오작동으로 인해 발생하는 에러 => 소스코드로 해결안됨 
		 * 	- 컴파일에러 : 소스코드상의 문법적인 문제로 발생하는 에러 => 소스코드 수정으로 해결
		 * 	- 런타임에러 : 소스코드상으로는 문제 없지만, 프로그램 실행중 발생하는 에러. => 사용자의 잘못이거나,  개발자가 예측하지 못한상황.
		 * 	- 논리에러 : 소스코드상의 문법적인 문제도 없고, 실행했을때도 굳이 문제가 되진 않지만 프로그램의 "의도상" 맞지 않는 경우. 
		 * 
		 * 	시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러와 같은 비교적 덜 심각한 것들을 가지고 "예외처리" 작업을 진행한다.
		 * 
		 * 	소스코드상 "예외"가 "발생"했을 경우에 대비해서 "처리" 하는 방법을 정의해두는 것을 "예외처리"라고함.
		 * 
		 * 	예외처리해야하는 이유 : 예외가 발생했을때 프로그램이 강제로 종료되는 것을 막기위함.
		 * 
		 * 	예외 처리 방법.
		 * 1. try ~ catch문을 이용.
		 * 2. throws를 이용(떠넘기기)
		 * 3. throw 를 이용.(에러강제발생.)
		 */
		A_UncheckedException au = new A_UncheckedException();
		au.method1();
		au.method2();
		au.method3();
		B_CheckedException bc = new B_CheckedException();
		bc.method1();
		throw new C_CustomException("커스텀 에러!!");
		
		
		
	}

}
