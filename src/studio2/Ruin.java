package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int bets=0;
		int wins=0;	

		System.out.println("Enter the starting amount:");
		double startAmount =in.nextDouble();
		System.out.println("what is the win chance");
		double winChance = in.nextDouble();
		System.out.println("Enter the amount of money for you to win in order to leave:");
		int winLimit = in.nextInt();
		int totalSimulations = in.nextInt();
		System.out.println("Enter the total number of simulaitons:");
		boolean stop = false;
		int simulations = 0;
		int winNum=0;
		int RuinNum=0;
		while(stop==false);
		{
		
			while(simulations<totalSimulations);
			double current = startAmount; 
			while (stop==false);

			
		double RanNum = Math.random();
		{
		if (RanNum < winChance)
		}
		current ++;
		else current --;
		}
		{
			if (current == winLimit);
			stop = true;
			System.out.println(current);
		}
	
		{
			
			if(current  =winLimit);
				Stop = true;
				System.out.println("You won!"+ current);
				else if (current <=0);
				System.out.println(current+"ruin")
			}
	
				
			stop=false;
			simulations++;
		}

	}


System.out.println("Wins"+winNum);
System.out.println(
