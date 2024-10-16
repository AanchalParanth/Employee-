public class understandingFinal {

       private final static int var1;
       static
       {
           var1 = 20;
       }

    public understandingFinal()
    {
        System.out.println("inside constructor");

    }
    public static void main(String[]agrs)
    {
        understandingFinal obj = new understandingFinal();
        understandingFinal obj1 = new understandingFinal();

        System.out.println("should print 11 " + obj.getVar1());
        System.out.println("should print 12 " + obj1.getVar1());
    }

    public int getVar1() {
        return var1;
    }
}