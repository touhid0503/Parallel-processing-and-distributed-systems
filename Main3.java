
class A{
    String name="Touhid";
}

class B extends A{

}

class C extends B{

}

public class Main3 {
   public static void main(String[] args) {
       C obj=new C();
       System.out.println(obj.name);
   }
}