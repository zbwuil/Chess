
import java.util.Scanner;

public class Game {
	
	public  Game(){

		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("input type fo game��chess:��������      start��Χ��     end: ����");
			String s = in.next();
			if(s.equals("end")){
				break;
			}
			System.out.println("input name for player_1");
			String playername = in.next();
			Player player1 = new Player();
			player1.setPlayername(playername);
			System.out.println("input name for player_2");
			playername = in.next();
			
			Player player2 = new Player();
			player2.setPlayername(playername);
			ActionImpl action = new ActionImpl();
			
			//���ñ���
			int x = 0,y = 0;
			int x1= 0,y1= 0;
			int choose = 0;
			int p = 0;
			
			//���������߼�
			
			if(s.equals("chess")){
				Board chess = new Board();
				chess.createBoard(8);
				
				while(true){
					System.out.println("��player1 ѡ����� 1������  2���غϽ���  3��end ");
					
					//player1 �׶�
					choose = in.nextInt();
					if(choose==1){
						System.out.println("�����������������磺 1 1 2 2 Ϊ����1��1��λ�õ������Ƶ���2��2��λ��");
						x = in.nextInt();
						y = in.nextInt();
						x1= in.nextInt();
						y1= in.nextInt();
						action.chessPlaying(x, y, x1, y1, player1, chess);
						
					}
					if(choose==2){
						System.out.println("�غ�����");
					}
					if(choose==3){
						System.out.println("��Ϸ����,player2ʤ��");
						break;
					}
					chess.print();
					
					//Player2 �׶�
					System.out.println("��player2  ѡ����� 1������  2���غϽ���  3��end ");
					choose = in.nextInt();
					if(choose==1){
						System.out.println("�����������������磺 1 1 2 2 Ϊ����1��1��λ�õ������Ƶ���2��2��λ��");
						x = in.nextInt();
						y = in.nextInt();
						x1= in.nextInt();
						y1= in.nextInt();
						action.chessPlaying(x, y, x1, y1, player2, chess);
						
					}
					if(choose==2){
						System.out.println("�غ�����");
					}
					if(choose==3){
						System.out.println("��Ϸ����,player1ʤ��");
						break;
					}
					chess.print();
				}
				
				
				System.out.println("�Ƿ�鿴plaer1�����¼�� 1����  2����");
				p = in.nextInt();
				if(p==1){
					player1.printRecord();
				}
				System.out.println("�Ƿ�鿴plaer2�����¼�� 1����  2����");
				p = in.nextInt();
				if(p==1){
					player2.printRecord();
				}
				
				
			}else if(s.equals("start")){
					Board go = new Board();
					go.createBoard(18);
					while(true){
						//player1 �׶�
						System.out.println("��player1 ѡ����� 1������  2���غϽ���  3��end ");
						choose = in.nextInt();
						if(choose == 1){
							System.out.println("�����������������磺 1 1");
							x = in.nextInt();
							y = in.nextInt();
							//go
							action.goPlaying(x, y, go, player1, 'A');
							System.out.println("����������������0Ϊ������");
							int killNumber = in.nextInt();
							while(killNumber>0){
								System.out.println("�����������������磺 1 1");
								x = in.nextInt();
								y = in.nextInt();
								action.takeAway(x, y, go);
								killNumber--;
							}
							System.out.println("���ӽ׶ν���");
						}
						if(choose == 2){							
							System.out.println("�غ�����");
						}
						if(choose == 3){
							System.out.println("��Ϸ����,player2ʤ��");
							break;
						}
						go.print();
						//player2 �׶�
						System.out.println("��player2  ѡ����� 1������  2���غϽ���  3��end ");
						choose = in.nextInt();
						if(choose == 1){
							System.out.println("�����������������磺 1 1");
							x = in.nextInt();
							y = in.nextInt();
							//go
							action.goPlaying(x, y, go, player2, 'B');
							System.out.println("����������������0Ϊ������");
							int killNumber = in.nextInt();
							while(killNumber>0){
								System.out.println("�����������������磺 1 1");
								x = in.nextInt();
								y = in.nextInt();
								action.takeAway(x, y, go);
								killNumber--;
							}
							System.out.println("���ӽ׶ν���");
						}
						if(choose == 2){							
							System.out.println("�غ�����");
						}
						if(choose == 3){
							System.out.println("��Ϸ����,player1ʤ��");
							break;
						}
						go.print();
					
				}
				
				System.out.println("�Ƿ�鿴plaer1�����¼�� 1����  2����");
				if(p==1){
					player1.printRecord();
				}
				System.out.println("�Ƿ�鿴plaer2�����¼�� 1����  2����");
				p = in.nextInt();
				if(p==1){
					player2.printRecord();
				}
					
				
			}else{
				System.out.println("��Ч������!");
			}
			
		}
		
		
	
	}
}
