package java_program;

import java.io.DataInputStream;

public class pro2 {

	public static void main(String[] args) throws Exception
	{
		int sum1,sum2,log,choice;
		DataInputStream ds=new DataInputStream(System.in);
		System.out.println("Enter the sum1 value:");
		sum1=Integer.parseInt(ds.readLine());
		System.out.println("Enter the sum2 value:");
		sum2=Integer.parseInt(ds.readLine());
		System.out.println("Enter the choice:");
		choice=Integer.parseInt(ds.readLine());
		switch(choice)
		{
		case 1:
			log=sum1+sum2;
			System.out.println("Addition = "+log);
			break;
		case 2:
			log=sum1-sum2;
			System.out.println("Subtraction = "+log);
			break;
		case 3:
			log=sum1*sum2;
			System.out.println("Multiplication = "+log);
			break;
		case 4:
			log=sum1%sum2;
			System.out.println("Modulus = "+log);
			break;
		case 5:
			log=sum1/sum2;
			System.out.println("Division = "+log);
			break;
		default:
			System.out.println("Invalid choice");
		}
		
	}

}
