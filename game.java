import java.util.concurrent.ThreadLocalRandom;
class game{
	public static void main(String[] args){
		Player p = new Player();
		//int a = (int)Math.random()+1*20;
		
		Player p1 = new Player("Enemy" ,100);
		
		p.name = p.input("name");
		int a=0;
		p.hp = p.inputint("hp");
		p.attack = p.inputint("attack");
		while(true){
			a = ThreadLocalRandom.current().nextInt(15, 36);
			p1.attacken(a);
			System.out.println("==========================\n");
			p.out();
			System.out.println();
			System.out.println("==========================");
			System.out.println("==========================\n");
			p1.out();
			System.out.println();
			System.out.println("==========================\n");
			System.out.println("==========================");
			System.out.println("you want to attack or heal a/h");
			p.choice = p.inputchar("choice");
			
			if(p.choice == 'a'){
				
				p.attack(p1,p);
				p1.attack(p,p1);
				System.out.println("this is p1 in main "+p1.hp);
				System.out.println("this is p in main "+p.hp);
				if(p1.hp <= 0 && p.hp ==0){
					p.draw();
					break;
				}
				if(p.hp <= 0){
					System.out.println(p1.name+" is win");
					break;
				}else if(p1.hp <=0){
					System.out.println(p.name+" is win");
					break;
				}

			}else if(p.choice == 'h'){
				p.heal(p);
			}
		}
		
	}
}
