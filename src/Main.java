import java.util.Scanner;

class Addition
{
    public static int Addition(int No1, int No2)
    {
        int Ans = 0;
        Ans = No1 + No2;
        return  Ans;
    }

    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);

        int i = 0; int j = 0; int Add = 0;
        System.out.println("Enter first element :");
        i = Sc.nextInt();

        System.out.println("Enter second element :");
        j = Sc.nextInt();

        Add = Addition(i,j);

        System.out.println("Addition is :"+Add);
        }
    }

