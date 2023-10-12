public class dowhileloops
{

    int a = 5;
    int b = 2; 
    int c = 1; 
    int d = -8;

    public static void main(String[] args) { 
        int i = 0;
        do{
            System.out.println("i is  " + i + " but less than 15");
            i += 1;
        }while(i < 15);
        int k = 10;
        do{
            System.out.println ("k is greater than 5");
            k -= 1;
        }while(k < 5);
        int a = 5;
        int b = 2;
        do{
            System.out.println ("abc");
            a++;
            b++;
        }while (a < 10 && b <= 20);

    }   
}