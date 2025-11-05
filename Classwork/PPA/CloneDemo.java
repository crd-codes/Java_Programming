class Demo implements Cloneable     //Cloneable is marker interface-cr
{
    public int i,j;
    
    public Demo(int a, int b)
    {
        this.i = a;
        this.j = b;
    }

    public Object clone() throws  CloneNotSupportedException     // Here the Object is return type-cr
    {
        return super.clone();
    }
}

class CloneDemo
{
    public static void main(String A[])
    {
        try
        {
            Demo dobj1 = new Demo(11,21);
            Demo dobj2 = (Demo)dobj1.clone();       // Here (Demo) is typecasting we wrote this after the error occured-cr 

            System.out.println(dobj2.i);
            System.out.println(dobj2.j);
        }
        catch(CloneNotSupportedException cobj)
        {

        }
    }
}