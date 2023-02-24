package upes.devops;

public class calc {
    public int sum(int a, int b)
    {
        return a + b;    
    }
    
    public int mul(int a, int b)
    {
        return a * b;    
    }
    public int diff(int a, int b)
    {
        return a - b;    
    }
    

    public static void main(String args[])
    {
        calc ob = new calc();
        System.out.println(ob.sum(5,6));
        System.out.println(ob.mul(5,6));
    }
}
