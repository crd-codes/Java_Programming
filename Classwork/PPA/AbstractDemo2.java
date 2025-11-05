

abstract class Base
{
    public int i,j;
        
    public int Addition(int A, int B)
    {
        return A + B;
    }
    abstract public int Substraction(int A, int B);
}

class Derived extends Base  //error
{

}



class AbstractionDemo2
{
    public static void main(String A[])
    {    
    Base bp = new Base();  //error      
    }
   
    

}