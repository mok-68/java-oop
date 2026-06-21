import java.util.Scanner;
import java.util.InputMismatchException;
class Player{
	char choice;
	String name;
	int hp;
	float attack;
	int a = 0;
	Player(){
		name = "";
		hp = 0;
		attack = 0;
	}
	Player(String name,int hp){
		this.name = name;
		this.hp = hp;
	}
	void attacken(int a){
		this.attack = a;
	}
	Scanner sc = new Scanner(System.in);
	public void scfor(){
		sc.nextLine();
	}
	char inputchar(String text){
		char a;
		while(true){
			try{
				System.out.print("input "+text+" : ");
				a = sc.next().toLowerCase().charAt(0);
				scfor();
				return a;
			}catch(InputMismatchException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
	String input(String text){
		while(true){
			String a;
			try{
				System.out.print("input "+text+" : ");
				a = sc.nextLine();
				
				return a;	
			}catch(InputMismatchException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
	int inputint(String text){
		int a;
		while(true){
			try{
				System.out.print("input "+text+" : ");
				a = sc.nextInt();
				scfor();
				return a;
			
			}catch(InputMismatchException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
	void out(){
		System.out.println("name is = "+name);
		System.out.println("hp is = "+hp);
		System.out.println("attack is = "+attack);
	}
	void heal (Player Enemy){
		Enemy.hp += 10;
		System.out.println("your hp is = "+Enemy.hp);
	}
	void draw(){
		System.out.println("draw!!!!!!!!!");
	}
	void attack(Player Enemy, Player Hero){
		Enemy.hp -= Hero.attack;
	}
	
}
