import java.util.*;
class Roots 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coefficient of the qudratic equation a,b,c:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=(b*b-4*a*c);
		double x,y;
		if(d>0) {
			x=(-b+Math.sqrt(d))/(2*a);
			y=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The required roots of given equation are root1="+x+"and the root2="+y);
		}
		else if (d==0) {
			x=-b/(2*a);
			System.out.println("The one root which is repeated twice:"+x);
		}
		else {
			System.out.println("The complex roots are root1="+(-b/(2*a))+"+i"+(Math.sqrt(-d))+"and the root2="+(-b/(2*a))+"-i"+(Math.sqrt(-d)));
		}
		
	}
}
