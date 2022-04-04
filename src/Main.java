public class Main {
    public static void main(String[] args)
    {
        System.out.println(Main.anything(5));
        System.out.println(Main.anything(10));
    }

    public static int anything(int num)
    {
        int sum = num;
        int num2 = num;
        while(num2 > 1)
        {
            sum *= (num2 - 1);
            num2--;
        }
        return sum;
    }
}
