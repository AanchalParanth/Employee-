public class myClass {
    public void foo()
    {
        System.out.println("000000");
        try {
            System.out.println("aaaaaaa");

            try {
                System.out.println("bbbbbbb");
                foo2();
            } catch (Exception e) {
                System.out.println("cccccc");
                foo1();

            }
        }
        catch(Exception e)
        {
            System.out.println("dddddd");

        }
            finally
            {
                System.out.println("finally");
            }

    }
    public void foo1()
    {
        System.out.println("eeee");
        int nums[] = new int[6];
        nums[7]=9;

    }
    public void foo2(){
        System.out.println("ffffff");
        int sum[] = new int[7];
        sum[8]=3;
    }

    public static void main(String[]args)
    {
        myClass obj = new myClass();
        obj.foo();

    }
}
// 0, a , e, b, f

// 0, a, e, d

// 0, a, e, b, f, c