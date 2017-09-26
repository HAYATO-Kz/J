package XD;

public class Assign {
static Scanner scan = new Scanner (System.in);
		static double i =0,menu,o=0,p=0; 
		static int pizzquan, ppizz, quantity,total,chicquan,pchic,cokequan,pcoke,pro,point,pp,ck,cc,caou,cain;
		static void cash (){
			  do {System.out.print("CASH IN : "); cain = scan.nextInt();  caou = cain-total;if (caou<0){System.out.println("Your money is not enough");}} while(caou<0);
			  if(caou>=0){ System.out.println("Change : "+caou);note( caou); System.out.println("");}
		}
	    static void point(){ point = total/300;
	    	if(point>0){System.out.println("You have "+point+" point,What do you want?.");
	    	do{ point = total/300; System.out.print("pizza:"); pp = scan.nextInt();  if(pp>0){for(int zero =0;pp>zero;zero++){point -= 6;}}
	    		System.out.print("Chicken: ");  ck = scan.nextInt();  if(ck>0){for(int zero =0;ck>zero;zero++){point -= 4;}}
	    		System.out.print("Coke: ");  cc = scan.nextInt();   if(cc>0){for(int zero =0;cc>zero;zero++){point -= 2;}}
	    		if(point<0){System.out.println("Yon don't have enough for that.");}
	         } 
	    	while(point<0); System.out.println(""); bill(menu,i,o,p);
	    	if(pp>0&&ck>0&&cc>0){System.out.printf("FREE--[ %d Pizza, %d Chicken, %d Coke. ]\n",pp,ck,cc);}
	    	if(pp>0&&ck>0&&cc==0){System.out.printf("FREE--[ %d Pizza, %d Chicken. ]\n",pp,ck);}
	    	if(pp>0&&cc>0&&ck==0){System.out.printf("FREE--[ %d Pizza, %d Chicken. ]\n",pp,cc);}
	    	if(ck>0&&cc>0&&pp==0){System.out.printf("FREE--[ %d Chicken, %d Coke. ]\n",ck,cc);}
	    	if(pp>0&&ck==0&&cc==0){System.out.printf("FREE--[ %d Pizza. ]\n",pp);} if(pp==0&&ck>0&&cc==0){System.out.printf("FREE--[ %d Chicken. ]\n",ck);} if(pp>0&&ck==0&&cc>0){System.out.printf("FREE--[ %d Coke. ]\n",cc);}
	    	System.out.println("");cash();}
	    }
	    static void promotion(){  

	    	do{System.out.println("1.) View Promotion");
	        System.out.println("2.) Order now");
	        System.out.println("#-----#");
	        System.out.print("=> ");
	         pro = scan.nextInt();
	        System.out.println("#-----#");
	        System.out.println("");if(pro==1){
	    	System.out.println("*--------------------------*");
	    	System.out.println("| 2 point = free 1 coke    |");
	    	System.out.println("| 4 point = free 1 chicken |");
	    	System.out.println("| 6 point = free 1 pizza   |");
	    	System.out.println("*--------------------------*-------------------*");
	    	System.out.println("| You'll get 1 point with a 300-baht purchase. |");
	    	System.out.println("*----------------------------------------------*");
	    	System.out.println("");}
	    	}while(pro!=2);
	        }
	    static void menu(){
	    	System.out.printf("+--- MENU -----------------+\n");
	    	System.out.printf("|\t\t\t   |\n");
	    	System.out.printf("| 1.) Pizza\t 250 Baht. |\n");
	    	System.out.printf("| 2.) Chickens\t 120 Baht. |\n");
	    	System.out.printf("| 3.) Coke\t  45 Baht. |\n");
	    	System.out.printf("| 4.) Total\t           |\n");
	    	System.out.printf("| 5.) Exit\t           |\n");
	    	System.out.printf("|\t\t\t   |\n");
	    	System.out.printf("+--------------------------+\n");
	    	System.out.printf("\n");
	    	System.out.printf("What would you like to have?\n");
	    	System.out.printf("\n");
	    }
	    static Double chic(double menu){
		if(menu==2){if(quantity!=0){i++; chicquan = quantity; pchic = chicquan*120;}else{i=0; pchic =0;}}  return  i ;
	}
	    static void choice(){
	    	do{ System.out.print("Enter your Choice: ");
		menu = scan.nextInt();
		if(menu==4){bill(menu,i,o,p);} if(menu==5){break;}if(menu!=4){
		System.out.print("Enter Quantity: ");
		quantity = scan.nextInt();
		System.out.println("");
		pizz(menu); chic(menu); coke(menu); }
	}
	while(menu!=5);}
	    static Double pizz(double menu){
		if(menu==1){if(quantity!=0){o++; pizzquan = quantity; ppizz = pizzquan*250;}else{o=0;ppizz=0;}} return o ;
	 }
	    static Double coke(double menu){
		if(menu==3){if (quantity!=0){p++; cokequan = quantity; pcoke = cokequan*45;}else{p=0;pcoke=0;}} return p ;
	 }
	    static void bill(double menu,double i,double o , double p){
		 if(o==0&&p==0&&i==0){ System.out.println("You didn't select any menu  ");
		 }
		 else{
		   { total = (ppizz+pcoke+pchic);System.out.println("+------ Menu ------+-- Qty --+-- Price --+");
		 if(o>0){System.out.printf("| Pizza            |  %5d  |    %5d  |\n",pizzquan,ppizz);}
		 if(i>0){System.out.printf("| Chikens          |  %5d  |    %5d  |\n",chicquan,pchic);}
		 if(p>0){System.out.printf("| Coke             |  %5d  |    %5d  |\n",cokequan,pcoke);}
			 System.out.println("+------------------+---------+-----------+");
			 System.out.printf("| Total                      |   %5d   |\n",total);
			 System.out.println("+------------------+---------+-----------+");
			 System.out.println(""); 
		   }}
	 }
	     static void note(int cain) {
			
			int money = (int)cain;
			System.out.println("1000-baht banknotes = " + money/1000);
			int b1000 = money/1000;
			money = money%1000;
			System.out.println("500-baht banknotes = "+ money/500);
			int b500 = money/500;
			money = money%500;
			System.out.println("100-baht banknotes = "+ money/100);
			int b100 = money/100;
			money = money%100;
			System.out.println("50-baht banknotes = "+money/50);
			int b50 = money/50;
			money = money%50;
			System.out.println("20-baht banknotes = "+money/20);
			int b20 = money/20;
			money = money%20;
			System.out.println("10-baht coins = "+money/10);
			int b10 = money/10;
			money = money%10;
			System.out.println("5-baht coins = "+money/5);
			int b5 = money/5;
			money = money%5;
			System.out.println("1-baht coins = "+money/1);
			int b1 = money/1;
			
			int moneys = (int)cain;
			double satang = cain-moneys;
			System.out.println("50-satang coins = "+ (int)((satang)/0.5));
			int b05 = (int)((satang)/0.5);
			satang = satang%0.5;
		System.out.println("25-satang coins = "+(int)(satang/0.25));
			int b025 = (int)((satang)/0.25); 
		 int total = b1000+b500+b100+b50+b20+b10+b5+b1+b05+b025;
		 System.out.println("Total number of banknotes and coins = "+total);
					
			

		}
	    public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("---- Welcome to SKE Restaurant ----"); 
		System.out.println("");
		promotion();  menu();  choice();  point();   
	 System.out.println("====  THANK YOU  ====");
	
	
	 }
}
//ske restaurant by hayato
