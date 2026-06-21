import java.util.Scanner;
import java.util.InputMismatchException;
class Player{
	char choice;
	String name;
	int hp;
	float attack;
	
	Player(){
		name = "";
		hp = 0;
		attack = 0;
	}
	Player(String name,int hp, int attack){
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	Scanner sc = new Scanner(System.in);
	public void scfor(){
		sc.nextLine();
	}
	char inputchar(String text){
		char a;
		while(true){
			try{
				System.out.println("input "+text+" : ");
				a = sc.next().charAt(0);
				scfor();
				return a;
			}catch(InputMismatchException e){
				System.out.println(e.getMessage());
				sc.next();
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
			sc.next();
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
			sc.next();
		}
		}
	}
	
	void out(){
		System.out.println("name is = "+name);
		System.out.println("name is = "+hp);
		System.out.println("name is = "+attack);
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
		if(Enemy.hp <=0){
			System.out.println(Enemy.name+" is dead");
			System.out.println("draw!!!!!!!!!");
		}else{
			System.out.println(Enemy.name+" Hit Points = "+Enemy.hp);
		}
		
		
	}
	
}
