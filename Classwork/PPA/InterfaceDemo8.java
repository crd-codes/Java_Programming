interface A 
{
    int no = 11;
    void fun();

    default void gun()      //imp it will run in version of java 8 +
    {
        System.out.println("Inside gun");
    }
}

class Demo implements A
{
    public void fun()
    {
        System.out.println("Inside fun");    
    }
    
}

class InterfaceDemo8
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
          
    }
}