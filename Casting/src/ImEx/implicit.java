package ImEx;

public class implicit //int to double/float/long
                      //float to double
{
  public static void main(String[] args) 
  {
		int a = 4; // 4 byte memory
		
		double b = a; //8 bye memory
		
		float c = a; //4 byte
		
		long d = a; //8 byte
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
  }

}
