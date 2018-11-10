package com.hala.mineClearanceGame;

import java.util.Scanner;

public class Entrance {
	
	static Scanner input=new Scanner(System.in);

	public static Floor[][] initialize() {
		
		Floor[][] gameFeild = new Floor[5][5];
		for (int a = 0; a < gameFeild.length; a++) {
			for (int b = 0; b < gameFeild[a].length; b++) {
				gameFeild[a][b]=new Floor();
			}	
		}
//		类数组开辟空间后需要对每一个数组空间进行实例化，如上
			
		gameFeild[3][3].setFlag(1);
		gameFeild[1][1].setFlag(1);
		gameFeild[2][0].setFlag(1);
		gameFeild[2][4].setFlag(1);
		gameFeild[4][3].setFlag(1);

		for (int i = 0; i < gameFeild.length; i++) {
			for (int j = 0; j < gameFeild[i].length; j++) {
				switch (i) {
				case 0:
					switch (j) {
					case 0:
						for (int k = i; k <= i + 1; k++) {
							for (int l = j; l <= j + 1; l++) {
								if (gameFeild[k][l].getFlag() == 1) {
									gameFeild[i][j].addNum();
								}
							}
						}
						if (gameFeild[i][j].getFlag() == 1) {
							gameFeild[i][j].subNum();
						}
						break;

					case 4:
						for (int k = i; k <= i + 1; k++) {
							for (int l = j - 1; l <= j; l++) {
								if (gameFeild[k][l].getFlag() == 1) {
									gameFeild[i][j].addNum();
								}
							}
						}
						if (gameFeild[i][j].getFlag() == 1) {
							gameFeild[i][j].subNum();
						}
						break;
					default:
						for(int k=i;k<=i+1;k++){
							for(int l=j-1;l<=j+1;l++){
								if(gameFeild[k][l].getFlag()==1){
									gameFeild[i][j].addNum();
								}
							}
						}
						if(gameFeild[i][j].getFlag()==1){
							gameFeild[i][j].subNum();
						}
					}
					break;
				case 4:
					switch (j) {
					case 0:
						for (int k = i - 1; k <= i; k++) {
							for (int l = j; l <= j + 1; l++) {
								if (gameFeild[k][l].getFlag() == 1) {
									gameFeild[i][j].addNum();
								}
							}
						}
						if (gameFeild[i][j].getFlag() == 1) {
							gameFeild[i][j].subNum();
						}
						break;
					case 4:
						for (int k = i - 1; k <= i; k++) {
							for (int l = j - 1; l <= j; l++) {
								if (gameFeild[k][l].getFlag() == 1) {
									gameFeild[i][j].addNum();
								}
							}
						}
						if (gameFeild[i][j].getFlag() == 1) {
							gameFeild[i][j].subNum();
						}
						break;
					default:
						for(int k=i-1;k<=i;k++){
							for(int l=j-1;l<=j+1;l++){
								if(gameFeild[k][l].getFlag()==1){
									gameFeild[i][j].addNum();
								}
							}
						}
						if(gameFeild[i][j].getFlag()==1){
							gameFeild[i][j].subNum();
						}
					}
					break;
				default:
					switch (j) {
					case 0:
						for (int k = i - 1; k <= i + 1; k++) {
							for (int l = j; l <= j + 1; l++) {
								if (gameFeild[k][l].getFlag() == 1) {
									gameFeild[i][j].addNum();
								}
							}
						}
						if (gameFeild[i][j].getFlag() == 1) {
							gameFeild[i][j].subNum();
						}
						break;
					case 4:
						for (int k = i - 1; k <= i + 1; k++) {
							for (int l = j - 1; l <= j; l++) {
								if (gameFeild[k][l].getFlag() == 1) {
									gameFeild[i][j].addNum();
								}
							}
						}
						if (gameFeild[i][j].getFlag() == 1) {
							gameFeild[i][j].subNum();
						}
						break;
					default:
						for(int k=i-1;k<=i+1;k++){
							for(int l=j-1;l<=j+1;l++){
								if(gameFeild[k][l].getFlag()==1){
									gameFeild[i][j].addNum();
								}
							}
						}
						if(gameFeild[i][j].getFlag()==1){
							gameFeild[i][j].subNum();
						}
					}
				}
			}
		}

		return gameFeild; 
	}
	
	public static Floor[][] gameSetting(int numbers){
		Floor[][] gameFeild = new Floor[5][5];
		
		for (int a = 0; a < gameFeild.length; a++) {
			for (int b = 0; b < gameFeild[a].length; b++) {
				gameFeild[a][b]=new Floor();
			}	
		}
		
		for(int i=0;i<numbers;i++){
			System.out.println("请输入第"+(i+1)+"个雷的x坐标:");
			int x=input.nextInt();
			System.out.println("请输入第"+(i+1)+"个雷的y坐标:");
			int y=input.nextInt();
			gameFeild[x-1][y-1].setFlag(1);
		}
		
		for (int i = 0; i < gameFeild.length; i++) {
			for (int j = 0; j < gameFeild[i].length; j++) {
				switch (i) {
				case 0:
					switch (j) {
					case 0:
						for (int k = i; k <= i + 1; k++) {
							for (int l = j; l <= j + 1; l++) {
								if (gameFeild[k][l].getFlag() == 1) {
									gameFeild[i][j].addNum();
								}
							}
						}
						if (gameFeild[i][j].getFlag() == 1) {
							gameFeild[i][j].subNum();
						}
						break;

					case 4:
						for (int k = i; k <= i + 1; k++) {
							for (int l = j - 1; l <= j; l++) {
								if (gameFeild[k][l].getFlag() == 1) {
									gameFeild[i][j].addNum();
								}
							}
						}
						if (gameFeild[i][j].getFlag() == 1) {
							gameFeild[i][j].subNum();
						}
						break;
					default:
						for(int k=i;k<=i+1;k++){
							for(int l=j-1;l<=j+1;l++){
								if(gameFeild[k][l].getFlag()==1){
									gameFeild[i][j].addNum();
								}
							}
						}
						if(gameFeild[i][j].getFlag()==1){
							gameFeild[i][j].subNum();
						}
					}
					break;
				case 4:
					switch (j) {
					case 0:
						for (int k = i - 1; k <= i; k++) {
							for (int l = j; l <= j + 1; l++) {
								if (gameFeild[k][l].getFlag() == 1) {
									gameFeild[i][j].addNum();
								}
							}
						}
						if (gameFeild[i][j].getFlag() == 1) {
							gameFeild[i][j].subNum();
						}
						break;
					case 4:
						for (int k = i - 1; k <= i; k++) {
							for (int l = j - 1; l <= j; l++) {
								if (gameFeild[k][l].getFlag() == 1) {
									gameFeild[i][j].addNum();
								}
							}
						}
						if (gameFeild[i][j].getFlag() == 1) {
							gameFeild[i][j].subNum();
						}
						break;
					default:
						for(int k=i-1;k<=i;k++){
							for(int l=j-1;l<=j+1;l++){
								if(gameFeild[k][l].getFlag()==1){
									gameFeild[i][j].addNum();
								}
							}
						}
						if(gameFeild[i][j].getFlag()==1){
							gameFeild[i][j].subNum();
						}
					}
					break;
				default:
					switch (j) {
					case 0:
						for (int k = i - 1; k <= i + 1; k++) {
							for (int l = j; l <= j + 1; l++) {
								if (gameFeild[k][l].getFlag() == 1) {
									gameFeild[i][j].addNum();
								}
							}
						}
						if (gameFeild[i][j].getFlag() == 1) {
							gameFeild[i][j].subNum();
						}
						break;
					case 4:
						for (int k = i - 1; k <= i + 1; k++) {
							for (int l = j - 1; l <= j; l++) {
								if (gameFeild[k][l].getFlag() == 1) {
									gameFeild[i][j].addNum();
								}
							}
						}
						if (gameFeild[i][j].getFlag() == 1) {
							gameFeild[i][j].subNum();
						}
						break;
					default:
						for(int k=i-1;k<=i+1;k++){
							for(int l=j-1;l<=j+1;l++){
								if(gameFeild[k][l].getFlag()==1){
									gameFeild[i][j].addNum();
								}
							}
						}
						if(gameFeild[i][j].getFlag()==1){
							gameFeild[i][j].subNum();
						}
					}
				}
			}
		}
		
		return gameFeild;
		
	}
	
	public static int play(Floor[][] gameField ,int x,int y,int number){
		int x1=x-1;
		int y1=y-1;
		if(gameField[x1][y1].getFlag()==2){
			gameField[x1][y1].setClick(true);
			number--;
			for(int i=0;i<gameField.length;i++){
				for(int j=0;j<gameField[i].length;j++){
					if(gameField[i][j].isClick()){
						System.out.print(gameField[i][j].getNum());
					}else{
						System.out.print(gameField[i][j].getFloor());
					}
				}
				
				System.out.println();
			}
		}else if(gameField[x1][y1].getFlag()==1){
			System.out.println("Oh No!You are Die~~");
			number=-1;
			for(int i=0;i<gameField.length;i++){
				for(int j=0;j<gameField[i].length;j++){
					if(gameField[i][j].getFlag()==1){
						System.out.print(gameField[i][j].getMine());
					}else{
						System.out.print(gameField[i][j].getFloor());
					}
				}
				
				System.out.println();
			}
		}
		
		return number;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎来到扫雷游戏^ _ ^");
		boolean button = true;
		Floor[][] gameField=initialize();
		int numbers=20;
		while (button) {
			System.out.println("1.开始游戏");
			System.out.println("2.游戏设置");
			System.out.println("3.退出游戏");
			int Select = input.nextInt();

			if (Select == 3) {
				System.out.println("欢迎下次再来～～");
				break;
			} else if (Select == 2) {
				System.out.println("请输入雷的个数(<=25)：");
				int number=input.nextInt();
				gameField=gameSetting(number);
				numbers=25-number;
				System.out.println("设置完成！");
			} else if (Select == 1) {
				int count=numbers;
				while(count>0){
					System.out.println("请输入你要踩的x坐标（1～5）：");
					int x=input.nextInt();
					System.out.println("请输入你要踩的y坐标（1～5）：");
					int y=input.nextInt();
					count=play(gameField,x,y,count);
					if(count==0){
						System.out.println("恭喜你过关了^ _ ^");
					}
				}
			} else {
				System.out.println("请按提示输入！");
				continue;
			}

		}

	}

}
