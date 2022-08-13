package quesserGame;

import java.util.Scanner;

class Guesser{
	int guessNum;
	int guessing(){
		System.out.println("Guesser Kindly Guess the num between 0-10");
	Scanner s1=new Scanner(System.in);
	guessNum=s1.nextInt();
	return guessNum;
}}

class Player{ 
	int pGuess;
	int playerGuess() {
		Scanner s1=new Scanner(System.in);
		pGuess=s1.nextInt();
		return pGuess;
	}
	}
class Umpire{
	int g1;
	int p1;
	int p2;
	int p3;
	public void collectNumFromGuesser() {
	Guesser g=new Guesser();
	g1=g.guessing();
	}

public void collectNumFromPlayers() {
	Player p=new Player();
	System.out.println("Player 1 Kindly Choose a num btw 0-10");
	p1=p.playerGuess();
	System.out.println("Player 2 Kindly Choose a num btw 0-10");
	p2=p.playerGuess();
	System.out.println("Player 3 Kindly Choose a num btw 0-10");
    p3=p.playerGuess();
}

public void analysis() {
	if(0<=g1 && g1<=10 && p1>=0 && p1<=10 && p2>=0 && p2<=10 && p3>=0 && p3<=10) {
	
		
		if(g1==p1) {if(p1==p2 && p1==p3) {System.out.println("Every one guess the right num");
		}
	else if(p1==p2 || p1==p3) {
		if(p1==p2 && p1!=p3) {
		System.out.println("There is a tie between  Player 1 & Player 2");
	}
		else if(p1==p3 && p1!=p2){
			System.out.println("There is a tie between Player 1 & Player 3 ");
		}}
	else {System.out.println("Player 1 won the game ");
		}
		}
	
	
		else if(g1==p2) {if(p2==p3) {
		System.out.println("There is tie between Player 2 & Player 3");
	}
	else {
		System.out.println("Player 2 Won the game");
	}
	}
	
		else if(g1==p3) {
		System.out.println("Player 3 won the game ");
	}
		else {
			System.out.println("No one Choose the right num, Better Luck Next time");
		}
		Umpire u2=new Umpire();
		u2.restart();
	}
	else { System.out.println("Someone provided an wrong input restarting the game.....");
	Umpire u=new Umpire();
	u.collectNumFromGuesser();
	u.collectNumFromPlayers();
	u.analysis();
		
	}
}

public void restart() {
	int A;
	Scanner s2=new Scanner(System.in);
	System.out.println("If you want to play again press 1 , To exit the Game press 0");
	A=s2.nextInt();
	if(A==1) {
		System.out.println("Restarting.....");
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.analysis();
			
	}
	else {System.out.println("thank you.....");
}
}}












public class QuesserGame {
	public static void main(String args[]) {
	
Umpire u1=new Umpire();
u1.collectNumFromGuesser();
u1.collectNumFromPlayers();
u1.analysis();


}

}
