public class staticLearn {


    private int normalVariable;
    private int i;
    private int j;
    private int k;

    private static int staticVariable;
    private static int sV2;


    public static void main(String[]args)
    {
        System.out.println("start of main");
        staticLearn obj1 = new staticLearn(50);
        staticLearn obj2 = new staticLearn(60);
        staticLearn obj3 = new staticLearn(70);

        System.out.println("obj2 = " + obj2.getNormalVariable());
        System.out.println("obj3 = " + obj3.getNormalVariable());
        System.out.println("obj1 = " + obj1.getNormalVariable());

        System.out.println("obj1 = " + staticLearn.sV2);
        System.out.println("obj2 = " + staticLearn.staticVariable);

    }

    static
    {
        System.out.println("inside static block");
        staticVariable = 50;
        sV2 = 60;

    }

    public staticLearn(int num)
    {
        System.out.println("inside constructor");
        this.normalVariable = num;

    }
    public int getNormalVariable() {
        return normalVariable;
    }
    public int getStaticVariable()
    {
        return staticVariable;
    }
    public static void setStaticVariable(int staticVariable) {
        staticLearn.staticVariable = staticVariable;
    }

    public static int a(int k)
    {
        k = k * 2;
        return k;
    }
    public static int b(int i)
    {
        i = i/2;
        return i;
    }
    public int c(int j)
    {
        return j;
    }


}