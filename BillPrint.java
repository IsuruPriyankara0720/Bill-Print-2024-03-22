import java.util.*;
class BillPrint{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("==========================================================================================");
		System.out.println("__          __   _                                _          _ __  __            _");   
		System.out.println("\\ \\        / /  | |                              | |        (_)  \\/  |          | | ");
		System.out.println(" \\ \\  /\\  / /___| |  ____ ____  _ __ ___   ____  | |_ ___    _| \\  / | __ _ _ __| |_ ");
		System.out.println("  \\ \\/  \\/ / _  \\ |/ ___/  _  \\| '_ ' _  \\/ __ \\ | __/ _ \\  | | |\\/| |/ _' | '__| __|  ");
		System.out.println("   \\  /\\  /  ___/ | (__|  (_)  | | | | | |  ___/ | || (_) | | | |  | | (_| | |  | |_");
		System.out.println("    \\/  \\/ \\____|_|\\____\\_____/|_| |_| |_|\\____|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|");
		System.out.println();
		System.out.println("==========================================================================================");
		System.out.println();		
		System.out.print("Enter Customer Phone Number - ");
		String Phone_number = input.next();
		System.out.println();
		System.out.print("Enter Customer Name         - ");
		String Name = input.next();
		System.out.println();
		System.out.println("==========================================================================================");
		
		double Basmathi = 250.00;
		double Dhal = 180.00;
		double Sugar = 150.00;
		double Higland = 1200.00;
		double Yoghurt = 50.00;
		double Flour = 120.00;
		double Soap = 160.00;
		System.out.println();
		
		System.out.print("Basmathi Qty(Kg) - ");
		int Qty1 = input.nextInt();
		System.out.println();

		System.out.print("Dhal Qty(Kg)     - ");
		int Qty2 = input.nextInt();
		System.out.println();
		
		System.out.print("Sugar Qty(Kg)    - ");
		int Qty3 = input.nextInt();
		System.out.println();

		System.out.print("Higland Qty(Kg)  - ");
		int Qty4 = input.nextInt();
		System.out.println();

		System.out.print("Yoghurt Qty(Kg)  - ");
		int Qty5 = input.nextInt();
		System.out.println();
		
		System.out.print("Flour Qty(Kg)    - ");
		int Qty6 = input.nextInt();
		System.out.println();
		
		System.out.print("Soap Qty(Kg)     - ");
		int Qty7 = input.nextInt();
		System.out.println();
		double p1 = Qty1 * Basmathi;
		double p2 = Qty2 * Dhal;
		double p3 = Qty3* Sugar;
		double p4 = Qty4 * Higland;
		double p5 = Qty5 * Yoghurt;
		double p6 = Qty6 * Flour;
		double p7 = Qty7 * Soap;
		double Total_Price = p1+p2+p3+p4+p5+p6+p7;
		double d = 0.1;
		double Discount = d*Total_Price;
		double Price = Total_Price - Discount;
		


		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|             _   __  __          _____  _______                 |");
		System.out.println("|            (_) |  \\/  |   /\\   |  __  \\__   __|                |");
		System.out.println("|             _  | \\  / |  /  \\  | |__)  | | |                   |");
		System.out.println("|            | | | |\\/| | / /\\ \\ |  _   /  | |                   |");
		System.out.println("|            | | | |  | |/ ____ \\| |  \\ \\  | |                   |");
		System.out.println("|            |_| |_|  |_/_/    \\_\\_|   \\_\\ |_|                   |");
		System.out.println("|                 225,Galle Road,Panadura.                       |");
		System.out.println("|                                                                |");
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|                    # Tel  : "+ Phone_number+ "                         |");
		System.out.println("|                    # Name : "+ Name        + "                              |");
		System.out.println("+-----------------+-------------+---------------+----------------+");
		System.out.println("|                 |     Qty     |   unit price  |      Price     |");
		System.out.println("+-----------------+-------------+---------------+----------------+");
		System.out.println("| # Basmathi      |"+"     " + Qty1+"      "+ "|" +"     " +  Basmathi+"     " +"|"+"     " +  p1  + "    " +  "|");
		System.out.println("| # Dhal          |"+"     " + Qty2+"       "+"|" + "     " + Dhal+ "     " +   "|"   +"     " +  p2  +"     " +   "|");
		System.out.println("| # Sugar         |"+"     " + Qty3+ "       "+  "|" +"     " +  Sugar+"     " +   "|"   +"     " +  p3  +"     " +   "|");
		System.out.println("| # Highland      |"+"     " + Qty4+ "       "+  "|" +"     " +  Higland+"    " + "|"   +"     " +  p4  +"    " +   "|");
		System.out.println("| # Yoghurt       |"+"     " + Qty5+ "       "+ "|" +"     " +  Yoghurt+"      " + "|"   +"     " +  p5  + "     " +  "|");
		System.out.println("| # flour         |"+"     " + Qty6+ "       "+  "|" +"     " +  Flour+ "     " +  "|"   +"     " +  p6  +"     " +   "|");
		System.out.println("| # Soap          |"+"     " + Qty7+ "       "+  "|" +"     " +  Soap  +"     " +  "|"   + "     " + p7  + "     " +  "|");

		System.out.println();
		System.out.println("+-----------------+-------------+---------------+----------------+");
		System.out.println("|                               | Total         |" +"     "+Total_Price+"    " +"|");
		System.out.println("|                               +---------------+----------------+");

		
		System.out.println("|                               | discount(10%) |"  +"     " + Discount+"     " +"|");

		System.out.println("|                               +---------------+----------------+");
		System.out.println("|                               | Price         |"+"     "+ Price  +"    " +"|");

		
		System.out.println("+-----------------+-------------+---------------+----------------+");


		System.out.println();

		System.out.print("Enter the customer Given amount - ");
		double Cash = input.nextDouble();

		System.out.println("+-----------------+-------------+");
		
		System.out.println("|"+"  Net Amount     "+"|"+"   "+ Price+"    "  +"|");

		System.out.println("+-----------------+-------------+");
		System.out.println("|"+"  Cash         "+"  |   "+Cash+"   |");
		
		

		System.out.println("+-----------------+-------------+");

		double Change = Cash-Price;
		
		System.out.println("|"+"  change         "+"|"+"   "+ Change+"    "  +"|");
		System.out.println("+-----------------+-------------+");

		System.out.println();

		System.out.println();
		int x = (int)Change;
		System.out.println();

		int NoOf5000 = x/5000;
		int RemOf5000 = x%5000;

		int NoOf2000 = RemOf5000/2000;
		int RemOf2000 = RemOf5000%2000;

		int NoOf1000 = RemOf2000/1000;
		int RemOf1000 = RemOf2000%1000;

		int NoOf500 = RemOf1000/500;
		int RemOf500 = RemOf1000%500;
		
		int NoOf100 = RemOf500/100;
		int RemOf100 = RemOf500%100;

		int NoOf50 = RemOf100/50;
		int RemOf50 = RemOf100%50;

		int NoOf20 = RemOf50/20;
		int RemOf20 = RemOf50%20;

		int NoOf10 = RemOf20/10;
		int RemOf10 = RemOf20%10;

		int NoOf5 = RemOf10/5;
		int RemOf5 = RemOf10%5;

		int NoOf2 = RemOf5/2;
		int RemOf2 = RemOf5%2;

		int NoOf1 = RemOf2/1;
		int RemOf1 = RemOf2%1;

		int NoOfNotes = NoOf5000+NoOf2000+NoOf1000+NoOf500+NoOf100+NoOf50+NoOf20;
		int NoOfCoins = NoOf10+RemOf5+RemOf2+RemOf1;


		System.out.println("  +----------------+------------+");
		System.out.println("  |     Value      |    No      |");
		System.out.println("  +----------------+------------+");
		System.out.println("  |    Rs.5000     |   "+NoOf5000+"        |"); 
		System.out.println("  +----------------+------------+");
		System.out.println("  |    Rs.2000     |   "+NoOf2000+"        |");
		System.out.println("  +----------------+------------+");
		System.out.println("  |    Rs.1000     |   "+NoOf1000+"        |"); 
		System.out.println("  +----------------+------------+");
		System.out.println("  |    Rs.500      |   "+NoOf500+"        |");
		System.out.println("  +----------------+------------+");
		System.out.println("  |    Rs.100      |   "+NoOf100+"        |"); 
		System.out.println("  +----------------+------------+");
		System.out.println("  |    Rs.50       |   "+NoOf50+"        |");
		System.out.println("  +----------------+------------+");
		System.out.println("  |    Rs.10       |   "+NoOf10+"        |"); 
		System.out.println("  +----------------+------------+");
		System.out.println("  |    Rs.5        |   "+NoOf5+"        |");
		System.out.println("  +----------------+------------+");
		System.out.println("  |    Rs.2        |   "+NoOf2+"        |"); 
		System.out.println("  +----------------+------------+");
		System.out.println("  |    Rs.1        |   "+NoOf1+"        |");
		System.out.println("  +----------------+------------+");
		System.out.println("  |  No of Notes   |   "+NoOfNotes+"        |"); 
		System.out.println("  +----------------+------------+");
		System.out.println("  |  No of Coins   |   "+NoOfCoins+"        |");
		System.out.println("  +----------------+------------+");

		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("          THANK YOU FOR SHOPPING WITH US          ");
		System.out.println("--------------------------------------------------");		




	}
}