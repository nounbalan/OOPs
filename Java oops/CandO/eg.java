class A
{
    public int x;
    private int y;
    protected int z;
    public void first(){
        System.out.println("first: " + x);
    }
    private void second() {
        System.out.println("second " + y);
    }
    public void sety(int a){
        y=a;
    }
    public int gety(){
        return y;
    }
    protected void third(){
        System.out.println("third: " + z);
    }
}

public class eg{
    public static void main(String []args){
        A a = new A();
        
        a.x=22;
        //a.y=22; 
        //a.second();
        a.first();
        a.sety(55);
        int c= a.gety();
        System.out.println("second: " +c);
        a.z = 77;
        a.third();
    }
}