package practical_part_in_book;
/* Finding Square Root of an Integer Number*/
import java.io.*; // Used for readline () Method
// import java.lang.*; // Used for Sqrt () Mehthod
class Package{
    public static void main(String args[]) throws IOException
    {
        int x;
        double y;
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an integer number:");
        s = br.readLine();
        x = Integer.parseInt(s);
        y = Math.sqrt(x);
        System.out.println("Square Root of "+x+" is "+y);
    }
}