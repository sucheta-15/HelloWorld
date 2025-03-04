package Guessergame;

import java.util.Scanner;

class Guesser{
	int guessernum;
	public int guessernumb() {
		Scanner sc=new Scanner(System.in);
		System.out.println("guesser kindly guess a number");
		guessernum=sc.nextInt();
		return guessernum;
	}
}
class player{
	int playernum;
	public int playernumb() {
		Scanner sc=new Scanner(System.in);
		playernum=sc.nextInt();
		return playernum;
	}
}
class umpire{
	int guesserNum;
	int Playernum1;
	int Playernum2;
	int Playernum3;
	
	public void Collectnumfromguesser() {
		Guesser gu = new Guesser();
		guesserNum=gu.guessernumb();
	}
	public void Collectnumfromplayer() {
System.out.println("player1 guess a number");
		player p1=new player();
		Playernum1=p1.playernumb();
		
		System.out.println("player2 guess a number");
		player p2=new player();
		Playernum2=p2.playernumb();
		
		System.out.println("player3 guess a number");
		player p3=new player();
		Playernum3=p3.playernumb();
		
		
	}
	
	public void Compare() {
		if(guesserNum==Playernum1) {
			if(guesserNum==Playernum2 && guesserNum==Playernum3 ) {
				System.out.println("all players won the game");
			}
			
			else if (guesserNum==Playernum2) {
				System.out.println("player 1 and player 2 won the game");
			}
			else if (guesserNum==Playernum3) {
				System.out.println("player 1 and player 3 won the game");
			}
			else {
				System.out.println("only player 1 won the game");
			}
		}
		else if(guesserNum==Playernum2) {
			if(guesserNum==Playernum3) {
				System.out.println("player 2 and player 3");
			}
			else {
				System.out.println("only player2");
			}
		}
		else if(guesserNum==Playernum3) {
			System.out.println("only player 3 won the game");
		}
		else {
			System.out.println("none player won the game");
		}
	}
	
}
public class myguessergame {
  public static void main(String[] args) {
	  System.out.println("......Game started....");
	  umpire um=new umpire();
	  um.Collectnumfromguesser();
      um.Collectnumfromplayer();
	  um.Compare();
	  System.out.println("....Game over....");
  }
}
