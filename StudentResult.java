import java.util.Scanner;
public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Regd No.");
int n=sc.nextInt();
System.out.println("Enter marks of Subject 1,2 and 3:");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int total=m1+m2+m3;
System.out.println("Total Marks obtained="+total);
double avg=total/3;
System.out.println("Average Marks obtained="+avg);
if(avg>40)
	System.out.println("PASS");
else
	System.out.println("FAIL");
	}

}
