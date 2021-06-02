import java.util.*;
public class BtoH
{
 public static void main(String args [])
 {
  int[] Hexadecimal = new int[1000];
  int a=1, b=0, r, binary, decimal =0;
  
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter any Binary no.: ");
  binary = sc.nextInt();
  while(binary>0)
  {
   r= binary% 2;
   decimal =decimal + r*a;
   a = a*2;
   binary = binary/10;
  }
  a=0;
  while(decimal !=0)
  {
   Hexadecimal[a]=decimal% 16;
   decimal=decimal/16;
   a++;
  }
  System.out.print("Converted Hexadecimal no. is : ");
  for(b= a-1; b>=0; b--);
  {
   if(Hexadecimal[b]>9)
   {
    System.out.print((char)(Hexadecimal[b]+55)+"\n");
	}
  }
}
}	
	
  