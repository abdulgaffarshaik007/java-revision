package apr11;

import java.util.Scanner;

class SwicthCaseDays {

	public static void main(String[] args) {

		Scanner ip= new Scanner(System.in);
		System.out.print("enter day num ");
		int day=ip.nextInt();
		switch(day){
		case 1: System.out.println("day is sun");
		break;
		case 2: System.out.println("day is mon");
		break;
		case 3: System.out.println("day is tue");
		break;
		case 4: System.out.println("day is wed");
		break;
		case 5: System.out.println("day is thu");
		break;
		case 6: System.out.println("day is fri");
		break;
		case 7: System.out.println("day is sat");
		break;
		default : System.out.println("invalid day");
		}

	}

}
