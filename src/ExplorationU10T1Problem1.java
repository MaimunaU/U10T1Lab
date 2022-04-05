public class ExplorationU10T1Problem1
{
    public static void main(String [] args)
    {
        simpleRecursion(5);
    }

    public static void simpleRecursion(int n)
    {
        System.out.println("Called, n = " + n);
        if (n > 2)
        {
            simpleRecursion(n - 1);
        }
        System.out.println("Ended, n = " + n);
    }
}

