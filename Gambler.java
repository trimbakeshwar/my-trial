package set4;

import java.util.Scanner;

public class Gambler { 

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("stack is");
//ybgbgbgynun
//jujujuj    	
        int stake  = sc.nextInt() ; 
        System.out.println("goal is");// gambler's stating bankroll
        int goal   = sc.nextInt() ;
        System.out.println("rotation");// gambler's desired bankroll
        int trials = sc.nextInt() ;    // number of trial
        //s to perform

        int bets = 0;        // total number of bets made
        int wins = 0;    
        
        for(int i=0;i<trials;i++)
        {
        	int cash=stake;
        	
        	while(cash>0 && cash<goal)
        	{
        		bets++;
        		if(Math.random()<0.5)
        			cash++;
        		else
        			cash--;
        	}
        	if(cash==goal)
        		wins++;
        }
        System.out.println(wins+"wins of "+trials);
        System.out.println("parcentage of game own"+100.0*wins/trials);
        System.out.println("avg"+1.0*bets/trials);
    }
}
