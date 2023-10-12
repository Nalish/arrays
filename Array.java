import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
	Scanner input=new Scanner(System.in);
		String[] name=new String[4];
		int[] roll=new int[4];
		int[] marks =new int[3];
		int total=0;
		int[] sum=new int[4];
		for(i=0;i<=3;i++) {
			System.out.println("Enter Student's roll number:");
			roll[i]=input.nextInt();
			System.out.println("Enter the student's name:");
			name[i]=input.next();
			System.out.println("Enter the marks:");
			
		for(j=0;j<=2;j++) {
			marks[j]=input.nextInt();
			total+=marks[j];
			
			
			
		
			
	
			
		}
	
		sum[i]=total;
		System.out.println("the total of "+name[i]+" is "+sum[i]);
		total=0;
		}
		
System.out.println("**************************************************************");
System.out.println("\t\t\tSTUDENT MARKLIST");
System.out.println("**************************************************************");
System.out.println("ROLL\tNAME\t MARK1 MARK2 MARK3  TOTAL RESULT AVERAGE GRADE ");

for(i=0;i<=3;i++) {
	System.out.print(roll[i]+"\t"+name[i]);
	for(j=0;j<=2;j++) {
		System.out.print("\t"+marks[j]);
		
	}
	System.out.print("\t");
	System.out.print("\tP");
	
	System.out.println("");
}
	}

}
