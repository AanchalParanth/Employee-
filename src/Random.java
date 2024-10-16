public class Random {
    public static void main(String[] args) {


        int[] nums = new int[5];;
        try {
            nums[6]=9;
            System.out.println("some code");
        }
        catch (Exception e) {
                System.out.println("Error will be thrown" +  nums[0]);
                System.out.println(e.getMessage());

            }
        System.out.println("some more code");


        }
    }
