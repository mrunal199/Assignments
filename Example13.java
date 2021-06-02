public class Example13
{
 public static void main(String [] args)
 {
   double width=5.5;
   double height=8.5;
   double perimeter= 2*(height+width);
   double area= width*height;
   
   System.out.println("Perimeter is 2*(%.1f + %1.f)=%.2f \n", height, width, perimeter);
   System.out.println("Area is %.1f*%.1f= %.2f \n", width, height, area);
 }
} 