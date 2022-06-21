import java.util.Scanner;

public class Calculator {
	private float x,y,z;
	
	public void init() {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextFloat();
		y = sc.nextFloat();
	}
	
	public void add() {
		z= x+ y;
	}
	
	public void sub() {
		if(x>y)
			z = x - y ;
		else
			z= y - x ;
	}
	
	public void multiply() {
		z = x*y ;
	}
	
	}
	public void display() {
		System.out.println("Answer: "+z);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int ans;
		int choice;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("1.Addtion  2.Substraction  3.Multiplication  4.Division");
			choice = s.nextInt();
			
			switch(choice) {
			case 1 : 
				c.init();
				c.add();
				c.display();
				break;
			case 2 :
				c.init();
				c.sub();
				c.display();
				break;
			case 3 :
				c.init();
				c.multiply();
				c.display();
				break;
			case 4 :
				c.init();
				c.division();
				c.display();
				break;
				
				default :
					System.out.println("Invalid number...");
			}
			System.out.println("do you want to continue(1/0)?");
			ans = s.nextInt();
		}while(ans!=0);
	}

}
