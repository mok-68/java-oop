class game{
	public static void main(String[] args){
		Player p = new Player();
		Player p1 = new Player("Enemy" ,100,20);
		p.name = p.input("name");
		
		p.hp = p.inputint("hp");
		p.attack = p.inputint("attack");
		while(true){	
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
			if(p1.hp == 0 && p.hp ==0){
					p.draw();
					break;
			}
			if(p.choice == 'a'){
				p.attack(p1,p);
				p1.attack(p,p1);
				
			}else if(p.choice == 'h'){
				p.heal(p);
			}
			if(p.hp <= 0){
				break;
			}
			if(p1.hp <= 0){
				break;
			}
		}
		
	}
}
