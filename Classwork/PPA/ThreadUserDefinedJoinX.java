class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of : "+Thread.currentThread().getName());
    }
}
class ThreadUserDefinedJoinX
{
    public static void main(String A[]) throws InterruptedException
    {
        System.out.println("Inside main thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();    

        dobj1.join();       //Expection yete so main chya pudh throws kel
        dobj2.join();       //Expection yete so main chya pudh throws kel

        System.out.println("End of main thread ");      
    }
}
