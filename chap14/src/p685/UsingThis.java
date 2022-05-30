package p685;

import p682.MyFunctionalInterface;

public class UsingThis {
  public int outterField = 10;
  
  class Inner {
	  int innerField = 20;
	  								//만약 여기서 중괄호를 닫아버리면 밑에 this 눌러도 innerField 안나옴.
	  void method() {
		  //람다식
		  MyFunctionalInterface fi = () -> {
			  System.out.println("outterField: " + outterField);
			  System.out.println("outterField: " + UsingThis.this.outterField + "\n");
			  
			  System.out.println("innterField: " + innerField);
			  System.out.println("innterField: " + this.innerField + "\n");
		  };
		  fi.method();
	  }
  }
}
