
class A{
    public int attr1=1;
    protected int attr2=2;
    public int attr3=3;
    public void method1() {
       System.out.println ("This is method1 of class A and "+attr1);
    }
    protected void method2(){
      System.out.println("This is method2 of class A and "+attr2);
    }
    public void method3(){
        System.out.println("This is method3 of class A and "+attr3);
    }

}
class B extends A{
    public int attr4=4;
    protected int attr5=5;
    public int attr6=6;
    public void method4(){
       System.out.println("This is method4 of class B and "+attr4);
    }
    protected void method5(){
      System.out.println("This is method5 of class B and "+attr5);
    }
    public void method6(){
        System.out.println("This is method6 of class B and "+attr6);
    }   
}
class C extends A{
    public int attr7=7;
    protected int attr8=8;
    public int attr9=9;
    public void method7(){
       System.out.println("This is method4 of class C and "+attr7);
    }
    protected void method8(){
      System.out.println("This is method5 of class C and "+attr8);
    }
    public void method9(){
        System.out.println("This is method6 of class C and "+attr9);
    }   
}
public class hier{
    public static void main(String[]args){
        B obj1= new B();
        C obj2= new C();
        obj1.method1();
        obj1.method2();
        obj1.method3();
        obj1.method4();
        obj1.method5();
        obj1.method6();
        obj2.method7();
        obj2.method8();
        obj2.method9();
    }
}