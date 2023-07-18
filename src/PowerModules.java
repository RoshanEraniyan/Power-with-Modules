import java.util.*;

class Solution
{
    public void calculate(int a,int b,int c)
    {
        int solution=1;
        for(int i=0;i<b;i++)
        {
            solution=(solution*a)%c;
        }
        System.out.println(solution%c);
    }
}

class PowerModules
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        Solution solution =new Solution();
        solution.calculate(a,b,c);
    }
}
