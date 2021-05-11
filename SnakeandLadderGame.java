package SnakeGame;

public class SnakeandLadderGame {
	
	public static final int StartPosition=0;
	public static final int WinGame=100;
	
	
	public static void main(String[] args) {
		int newPosition=0;
		
		while(true)
		{
			int dice=getDiceNumber();
			if(dice==6)
			{
		        int WIN=100;
				while(newPosition !=WIN)
				{
					
					int dice2=getDiceNumber();
					int opt=options();
					switch(opt) {
					case 1:{
						if(newPosition>100)
						{
							newPosition=0;
						}
						else {
							newPosition = dice2+newPosition;
							
						}
						break;
					}
					case 2:{
						newPosition= newPosition-dice2;
						if(newPosition <0)
						{
							newPosition =0;
						
						}
						else
						{
							if(newPosition>100)
							{
								newPosition=0;
							}
						}
						break;
					}
					default:
					{
						if(newPosition>100)
						{
							newPosition=0;
						}
						
						break;
						
					}
							
					}
					System.out.println(newPosition);
					
				}
		}
	}
	
	}
	
static int getDiceNumber()
{
	int diceValue=(int)(Math.floor(Math.random()*10 % 6)+1);
	return diceValue;
	
}
static int options()
{
	int option=(int)(Math.floor(Math.random() * 10 %3));
	return option;
}
}
