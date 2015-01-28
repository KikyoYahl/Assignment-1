package vendmechine;

import java.util.Scanner; 

	public class VendingMachine{
	
		static Scanner input = new Scanner(System.in);
		static int balance = 0, product, coins, bills, total=0, 
			change=0, options;
                
		// For Testing 
		public static void payment(){
			//Start of payment module////////////////////
			System.out.println("\nPlease select the payment method.");
			
			do{
				//Enter money options
				System.out.println("1. Enter Coins");
				System.out.println("2. Enter Bills");
                                System.out.println("0. Money Entry Completed");
				
				options = input.nextInt();
				
					if(options==0){
					break;
				         }
					//The Vending Machine Accepts Coins
					else if(options==1){
						System.out.println("Please enter coins");
						
							do{
                                                                System.out.println("Insert coins : 1, 5, 10, 25, or press 0 to complete money entry." );
								coins = input.nextInt();
								//accept only 1, 5, 10, 25
                                                                
									switch(coins){
									
                                                                        case 0:
										break;
									case 1: //penny
										total +=1;
										break;
									case 5: //nickel
										total +=5;
										break;
									case 10: //dime
										total +=10;
										break;
									case 25: //quater
										total +=25;
										break;
									default: 
										System.out.println("Invalid Coins");
										break;
									}
							} while(coins!=0);
					}else if (options==2){
						//1 dollar bills, and 5 dollar bills
						System.out.print(bills);
							do{
                                                                System.out.println(" Please insert bills : 1, 5 or press 0 to complete money entry.");
								bills = input.nextInt();
								//Enter bills
								switch(bills){
								case 0:
									break; // loop ends when press 0
								case 1: // 1 dollar
									total+=100;
									break;
								case 5:// 5 dollar
									total +=500;
									break;
								default:
									System.out.println("Invalid bills, please enter new bills");
								}
							} while(bills!=0);
					} else{
						System.out.println("Invalid Options");//only 1, 5 bills
					}
			} while (options!=0);
                        System.out.println("You have inserted : " + total);
		}
		
		
		public static void purchase(){
			//Start purchase module 
			do {
                        System.out.println("Please select your product.");
                        System.out.println("1. Red Bull = 311");
                        System.out.println("2. Starbucks Coffee = 450");
                        System.out.println("3. Budweiser Beer = 1199");
                        System.out.println("4. yogurt = 901");
                        System.out.println("5. Ice cream = 1030");
                        System.out.println("0. Complete order");
			//Select the product
                        //display 5 producs
			product = input.nextInt();
			switch(product){
			case 0:
				balance +=0;
				break;
			case 1:
				balance +=311;
				break;
			case 2:
				balance +=450; 
				break;
			case 3:
				balance +=1199;
				break;
			case 4:
				balance +=901;
				break;
			case 5:
				balance +=1030;
				break;
			default:
				System.out.println("Invalid Products");
			}
                        }while(product != 0);
                        //allow to pick 1 or more products until press 0
		}
		public static String calCoins (){
			int change = total - balance;
                        
                        if (change < 0){
                            System.out.println("money is not enough");
                        }
                        else {
                            int quarters = 25;
                            int quarters1 = change / 25; //Quantity of quarters
                            int dimes = 10;
                            int dimes1 = (change - (quarters * quarters1)) / 10;//Quantity of dimes
                            int nickels = 5;
                            int nickels1 = (change - (quarters * quarters1) -(dimes * dimes1 )) / 5;//Quantity of nickels
                            int pennies = 1;
                            int pennies1 = (change - (quarters * quarters1) - (dimes * dimes1) - (nickels * nickels1)) / 1;//Quantity of pennies
                            
                            
                            
                                    System.out.println("your change is " + (total - balance) + " : ");
                                    System.out.println(quarters1 + " Quarters");
                                    System.out.println(dimes1 + " Dimes");
                                    System.out.println(nickels1 + " Nickels");
                                    System.out.println(pennies1 + " Pennies");
                                    //return money in coins
                        }
		return null;
                        }
		}
		
	


