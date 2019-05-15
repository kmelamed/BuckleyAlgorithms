import java.util.Scanner;

public class Metamorphosis {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Metamorphosis Choose Your Own Adventure. \nYou will be presented with a series of choices. \nWhen presented with a choice, enter a, b, or c (lowercase) and then press the enter key to make your choice. \n\nType an 'a' then press enter to begin\n\n");
		String start = in.nextLine();
		if (start.equals("a")) Intro();
	}
	
	public static void Intro() {
		System.out.println("Your father has lost his job. You need to get a job. \nYou");
		System.out.println("a.) become a carpenter \nb.) become a ______\nc.) become a travelling salesman");
		char choice = in.nextLine().charAt(0);
		if (choice == 'a') Carpenter();
		if (choice == 'b') OtherJob();
		if (choice == 'c') TravellingSalesman();
		
	}
	
	public static void Carpenter() {
		System.out.println("\n\nYou are living through the Industrial Revolution. Machines and factories are taking over. You aren’t making enough money as a carpenter to support your family. \nYou:");
		System.out.println("a.) become a _____ \nb.) become a travelling salesman");
		char choice = in.nextLine().charAt(0);
		if (choice == 'a') OtherJob2();
		if (choice == 'b') TravellingSalesman();
	}

	public static void OtherJob() {
		
	}
	
	public static void TravellingSalesman() {
		System.out.println("\n\nYou are making substantially more money than before. Your family is no longer at risk of losing their house. \nHowever, your job isn’t perfect. You begin to feel alienated because of the distance between you and your \nhome that results from all your travelling.");
		System.out.println("\nIt's time for another day of work. You wake up at 4:00 am to the sound of your alarm. \nTo prepare for work, you pack your cloth samples in your bag and go to the kitchen for breakfast. \nYou see what your mom set out on the table. \nYou choose to eat:");
		System.out.println("a.) eggs and toast");
		System.out.println("b.) a bagel and fruit");
		System.out.println("c.) oatmeal and a banana");
		char choice = in.nextLine().charAt(0);
		if (choice == 'a' || choice == 'b' || choice == 'c') AfterBreakfast();
	}
	
	public static void OtherJob2() {
		
	}
	
	public static void AfterBreakfast() {
		System.out.println("\n\nYour dad gives you a questioning glance. He asks how your job is coming along and how much money you’ve saved up. \nYou tell him that it’s almost enough to pay back their debt. \nYou leave the house, arrive at the train station exactly 15 minutes early, and spend your day travelling \nfrom one company to another, trying to sell them on your product. \nIt’s second nature for you now, you’re just going through the motions. \nAfter a long day, you return home to see Grete taking a violin lesson. You:");
		System.out.println("a.) stay awake to listen");
		System.out.println("b.) go to bed");
		char choice = in.nextLine().charAt(0);
		if (choice == 'a') StayAwake();
		if (choice == 'b') GoToBed();
	}
	
	public static void StayAwake() {
		System.out.println("\n\nSince Grete has only recently started her violin lessons, she’s just mastering the basics. \nYou listen as she stumbles through a well-known nursery rhyme. Your eyes start to droop. \nYou:");
		System.out.println("a.) fall asleep on the couch");
		System.out.println("b.) go to your bedroom");
		char choice = in.nextLine().charAt(0);
		if (choice == 'a') SleepOnCouch();
		if (choice == 'b') GoToBed();
	}
	
	public static void GoToBed() {
		
	}
	
	public static void SleepOnCouch() {
		System.out.println("\n\nSomeone is shaking your shoulder. You wake up to see Grete standing above you. \n“Go to your room,” she says. \"You need to get your sleep for work tomorrow.\"");
		System.out.println("You sigh at the thought of going through another day trying to sell your cloth around town. \nBut you know that your family is relying on you, so you head for your bedroom.");
	}
	
}
