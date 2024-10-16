public class Calling {
    private int ctr;
    public static void main(String[]agrs)
    {
        int i = 10;
        int j = 20;
        i = j;
        System.out.println(i);
        Calling obj1 = new Calling(10);
        Calling obj2 = new Calling(20);
        obj1 = obj2;

    }
    public Calling(int value)
    {
        this.ctr = value;
    }
    public int getCtr() {
        return ctr;
    }
}
