public class ExplorationU10T1Problem2
{
    public static void main(String [] args)
    {
        System.out.println(simpleRecursiveDivision(8));
    }

    public static int simpleRecursiveDivision(int num)
    {
        System.out.println("simpleRecursiveDivision called: num = " + num);
        if (num == 0)
        {
            System.out.println("Base case achieved, returning 0");
            return 0;
        }
        System.out.println("Making recursive call: " + num + " + simpleRecursiveDivision(" + num + " / 2)");
        int returnVal = num + simpleRecursiveDivision(num / 2);

        System.out.println("Returning " + returnVal);
        return returnVal;
    }
}
