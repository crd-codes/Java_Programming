class Arithematic
{
   public int iNo1;		//character
   public int iNo2;		//character

   public Arithematic()		//behavior
    {
      this.iNo1 = 0;
      this.iNo2 = 0;
    }

   public Arithematic(int i, int j)		//behavior
    {
      this.iNo1 = i;
      this.iNo2 = j;
    }
   
   public int Addition()		//behavior
    {
      int iAns = 0;
      iAns = this.iNo1 + this.iNo2;
      return iAns;
    }
   
    public int Substraction()		//behavior
    {
      int iAns = 0;
      iAns = this.iNo1 - this.iNo2;
      return iAns;
    }
  
  

}
class OOPX
{
   public static void main(String A[])
    {
      Arithematic aobj1 = new Arithematic(11,10);
      int iRet = 0;
   
      iRet = aobj1.Addition();
      System.out.println("Adition is " +iRet);

      iRet = aobj1.Substraction();
      System.out.println("Substractio is " +iRet);

      aobj1 = null;

    }
}