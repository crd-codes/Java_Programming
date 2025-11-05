import java.util.Scanner;

class Dynamic
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int length = 0;
        int Arr[];

        System.out.println("enter the number of elements");
        length = sobj.nextInt();

        //Arr = new int(length); error
        Arr = new int[length];
        
        if(Arr == null)
        {
            System.out.println("Unable to allocate the memory");
            
        }
        else
        {
            System.out.println("Memory alloccatedd");

        }

        //this not exactly dealloction of memory just conveing 
        Arr = null;
        System.gc();
    }
    
}
