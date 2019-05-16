import java.util.Scanner;

public class Metamorphosis {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Metamorphosis Choose Your Own Adventure. \nYou will be presented with a series of choices. \nWhen presented with a choice, enter a, b, or c (lowercase) and then press the enter key to make your choice. \n\nType an 'a' then press enter to begin\n\n");
		String start = in.nextLine();
		if (start.equals("a")) Intro();
	}
	
	public static void Intro() {
		System.out.println("Your father has lost his job and your family is in debt. You need to get a job. \nYou");
		System.out.println("a.) become a carpenter \nb.) work at the market\nc.) become a travelling salesman");
		char choice = in.nextLine().charAt(0);
		if (choice == 'a') Carpenter();
		if (choice == 'b') Market();
		if (choice == 'c') TravellingSalesman();
		
	}
	
	public static void Carpenter() {
		System.out.println("\n\nYou are living through the Industrial Revolution. Machines and factories are taking over. You aren’t making enough money as a carpenter to support your family. \nYou:");
		System.out.println("a.) work at the market \nb.) become a travelling salesman");
		char choice = in.nextLine().charAt(0);
		if (choice == 'a') Market2();
		if (choice == 'b') TravellingSalesman();
	}

	public static void Market() {
		System.out.println("\n\nYou are living through the Industrial Revolution. Machines and factories are taking over. You aren’t making enough money at the market to support your family. \nYou:");
		System.out.println("a.) become a carpenter \nb.) become a travelling salesman");
		char choice = in.nextLine().charAt(0);
		if (choice == 'a') Carpenter2();
		if (choice == 'b') TravellingSalesman();
	}
	
	public static void TravellingSalesman() {
		System.out.println("\n\nYou are making a relatively substantial amount of money. Your family is no longer at risk of losing their house. \nHowever, your job isn’t perfect. You begin to feel alienated because of the distance between you and your \nhome that results from all your travelling.");
		System.out.println("\nIt's time for another day of work. You wake up at 4:00 am to the sound of your alarm. \nTo prepare for work, you pack your cloth samples in your bag and go to the kitchen for breakfast. \nYou see what your mom set out on the table. \nYou choose to eat:");
		System.out.println("a.) eggs and toast");
		System.out.println("b.) a bagel and fruit");
		System.out.println("c.) oatmeal and a banana");
		char choice = in.nextLine().charAt(0);
		if (choice == 'a' || choice == 'b' || choice == 'c') AfterBreakfast();
	}
	
	public static void Market2() {
		System.out.println("You still aren't making enough money. Your dad keeps stressing how important it is that you \nget a well paying job. He insists that you become a travelling salesman");
		TravellingSalesman();
	}
	
	public static void Carpenter2() {
		System.out.println("You still aren't making enough money. Your dad keeps stressing how important it is that you \nget a well paying job. He insists that you become a travelling salesman");
		TravellingSalesman();
	}
	
	public static void AfterBreakfast() {
		System.out.println("\n\nYour dad gives you a questioning glance. He asks how your job is coming along and how much money you’ve saved up. \nYou tell him that, with some more time, you'll be able to pay back their debt. \nYou leave the house, arrive at the train station exactly 15 minutes early, and spend your day travelling \nfrom one company to another, trying to sell them on your product. \nIt’s second nature for you now, you’re just going through the motions. \nAfter a long day, you return home to see Grete taking a violin lesson. You:");
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
		System.out.println("\n\nAs you’re getting ready for bed, you dread the thought of going to work. \nYou think about standing up to your boss, but you know that you’ve taken this job for your parents.");
		WakeUp();
	}
	
	public static void SleepOnCouch() {
		System.out.println("\n\nSomeone is shaking your shoulder. You wake up to see Grete standing above you. \n“Go to your room,” she says. \"You need to get your sleep for work tomorrow.\"");
		System.out.println("You sigh at the thought of going through another day trying to sell your cloth around town. \nBut you know that your family is relying on you, so you head for your bedroom.");
		WakeUp();
	}
	
	public static void WakeUp() {
		System.out.println("\n\nAfter a night of troubled dreams, you wake up as a monstrous cockroach. \nYou:");
		System.out.println("a.) call for help");
		System.out.println("b.) accept your life as a cockroach and go outside");
		System.out.println("c.) hope it's a dream and try to go back to sleep");
		char choice = in.nextLine().charAt(0);
		if (choice == 'a') CallForHelp();
		if (choice == 'b') AcceptCockroach();
		if (choice == 'c') TryToSleep();
	}
	
	public static void CallForHelp() {
		System.out.println("\"Gregor, is that you?\" your mother asks.");
		System.out.println("\"Yes! I’ve turned into a cockroach. I need help getting out bed.\n If you hurry and help me, maybe I can still catch the train and make it to work.\"");
		System.out.println("\"Did you understand a single word of that?\" your father asks.");
		System.out.println("You hear your mother and Grete begin to cry. They call for a doctor.");
		System.out.println("\"I’m going to be coming out now\" you say.");
		System.out.println("With some difficulty, you open the door and crawl out. You hear your mom scream. \nShe runs towards your father. Your father runs to you, gives your a truly liberating kick, \nand you are thrown, bleeding profusely, far into your room. Your door is battered shut with your dad’s cane.");
		System.out.println("Press \"a\" to continue.");
		char choice = in.nextLine().charAt(0);
		CockroachCont();
	}
	
	public static void AcceptCockroach() {
		System.out.println("After struggling a bit to get off of your bed, you make it to your window. \nYou climb out and find yourself on the grass. It takes a few minutes for you to figure out how to move properly in your new form.");
		System.out.println("You start to make your way towards the park that’s a few blocks away."); 
		System.out.println("As you’re doing so, you crawl near a group of doctors heading towards the hospital that you can see from your bedroom window.");
		System.out.println("They see you approaching, and you see them turn pale, shriek, and run away. \nThis continues to happen. One man’s instinct is to kick you. After he realized what he did, he screamed and ran away in horror. \nYou can’t stand these reactions, and you realize you don’t have  a place in the outside world as a monstrous cockroach.");
		System.out.println("So you turn around and head back to the comforts of your bedroom. \nYou realize that your family will probably react the same way that the people outside did. \nSomeone is knocking on your door.");
		System.out.println("\"I’ve turned into a cockroach. I’m going to come out in a minute, please don’t be alarmed\" you say.");
		System.out.println("\"Did you understand a single word of that?\" your father asks.");
		System.out.println("With some difficulty, you open the door and crawl out. You hear your mom scream. \nShe runs towards your father. Your father runs to you, gives your a truly liberating kick, \nand you are thrown, bleeding profusely, far into your room. Your door is battered shut with your dad’s cane.");
		System.out.println("Press \"a\" to continue.");
		char choice = in.nextLine().charAt(0);
		CockroachCont();
	}
	
	public static void TryToSleep() {
		System.out.println("You try to move around and find a comfortable position in your new awkward body. \nEverytime you try to move onto your side, you end up rolling back.");
		System.out.println("After trying for so long, you realize there is no use. You hear knocking on your door.");
		System.out.println("\"Gregor, is everything okay in there?” Grete asks.\"");
		System.out.println("You are now 2 hours late for work. You haven’t missed a day for the past five years, and so you feel like you can’t miss one today.");
		System.out.println("\"I’ll be out soon,\" you reply.");
		System.out.println("You hear the front door opening and recognize a familiar voice, the voice of the Chief Clerk of your company. \nYou hate how your absence was so quickly recognized. You begin to speak and go on about how \nyou just need to pack your samples and then you’ll be ready to go. After you’re done, you hear silence. \nThen you hear your mom and Grete begin to cry. They call for a doctor. \nYou’re finally able to open the door, and when you make it out, you see the Chief Clerk staring at you, mouth agape.");
		System.out.println("He stutters and fumbles towards the door and out of the house. You hear your mom scream. \nShe runs towards your father. Your father runs to you, gives your a truly liberating kick, \nand you are thrown, bleeding profusely, far into your room. Your door is battered shut with your dad’s cane.");
		System.out.println("Press \"a\" to continue.");
		char choice = in.nextLine().charAt(0);
		CockroachCont();
	}
	
	public static void CockroachCont() {
		System.out.println("After a day of sleeping and not eating the milk and bread that is left by your door, \nGrete comes into your bedroom to visit you. She notices the uneaten milk and bread and brings you \nold and rotten foods. When she leaves, you devour the food. Everytime Grete comes into your room to feed you, \nyou hide under the couch so she doesn’t have to look at you.");
		System.out.println("\n\n\nIt has been about two months since your metamorphosis. Grete still comes in to feed you and is now okay with \nseeing your new form. However, your parents have not yet come to see you. \n\nYou have been spending time crawling all over the ceiling and the walls. \nYou’ve learned how to control your new body, and now you don’t hurt yourself, even after a fall from a \nconsiderable height. \nGrete observes this new amusement that you’ve found by crawling up and down the room.");
		System.out.println("Press \"a\" to continue.");
		char choice0 = in.nextLine().charAt(0);
		System.out.println("\n\nShe decides she wants to maximize the amount of crawling you can do by removing some of the furniture from your room. \nThere is nobody else to help Grete but your mother. She comes into your room only after Grete assures her that \nshe won’t be able to see you from under the couch. They begin to move the wardrobe.");
		System.out.println("Your mother tells Grete in a whisper \"isn’t it the case, that by taking away his furniture, we would be showing \nhim we were abandoning all hope of an improvement in his condition, and leaving him utterly to his own devices?");
		System.out.println("I think it would be best if we try to leave the room in exactly the condition it was before, so that, \nif Gregor is returned to us, he will find everything unaltered, and will thereby be able \nto forget the intervening period almost as if it hadn’t happened.\"");
		System.out.println("\nIs it really your wish to have your cozy room, comfortable furnished with old heirlooms, \ntransformed into a sort of cave, merely so that you’ll be able to crawl around in it freely, \nwithout hindrance in any direction -- even at the expense of of rapidly and utterly forgetting your human past? \nYou decide that the furniture must stay.");
		System.out.println("Grete, however, disagrees. She insists that you need the room to crawl around and she \ncontinues to remove the wardrobe with your mom. \nYou:");
		System.out.println("a.) let them move the furniture");
		System.out.println("b.) try to stop them");
		char choice = in.nextLine().charAt(0);
		if (choice == 'a') LetThemMove();
		if (choice == 'b') TryToStopThem();
	}
	
	public static void LetThemMove() {
		System.out.println("Grete and your mother are struggling to move all of this heavy furniture from your room. \nWhile they’re taking a break in the kitchen, you decide to crawl out into the living room.");
		NotInRoom();
	}
	
	public static void TryToStopThem() {
		System.out.println("You come out from under the couch. Your mom sees you, screams, turns pale, and faints. \nGrete turns to you and says \"Ooh, Gregor!\" \nAfter seeing how your mother reacted to the sight of you, you decide to leave your bedroom to give Grete space to tend to her. \nGrete also continues to remove what she can manage from your bedroom.");
		NotInRoom();
	}
	
	public static void NotInRoom() {
		System.out.println("After the furniture has been moved, Grete realizes that you’re no longer in your bedroom. \nYour father arrives home, and Grete tells him that you’ve gotten loose. \nYour dad walks into the living room, scans the room, and his eyes fall upon you. He walks up to you and raises his foot. ");
		System.out.println("You crawl away. This chasing goes on for a bit until  you notice something whizzing past you. An apple. \nYour dad had thrown an apple at you. And another ones. He continues this until one of them pierces your back. \nYou retreat to your room.");
		System.out.println("\n\nIt’s been a month since your dad threw the apple at you, and nobody has dared to remove it. \nGrete cleans your room less efficiently and feeds you less often.");
		System.out.println("\nYou are now barely eating. Your family has decided to take in some tenants to make money. \nOne night while the tenants are eating in the living room, Grete begins to play the violin. \nYou are drawn by the music. \nYou:");
		System.out.println("a.) slowly inch toward the living room");
		char choice = in.nextLine().charAt(0);
		Death();
	}
	
	public static void Death() {
		System.out.println("Nobody notices you. You are so moved by the sounds flooding the room. One of the tenants notices you and shrieks. \nGrete stops playing. Your dad hurries to the tenants and tries to push them back into their room. \nThey begin to insist that they will not be paying for their stay. They leave and slam the door with a mighty crash.");
		System.out.println("\n\n\"Dear parents,\" Grete says, \"things cannot go on like this. We have to try to get rid of it. \nWe did as much as humanly possible to try and look after it and tolerate it.\"");
		System.out.println("\"She’s right, a thousand times right,\" your father mutters. \"If only he understood us\"");
		System.out.println("\nYou begin to turn around to go back to your bedroom. Nobody interferes with you. \nAs soon as you are fully in the room, the door is pushed shut behind you and locked and bolted.");
		System.out.println("You realize that you can no longer move. You feel the pains all of your body start to diminish. \nYou remain like this until the church clock strikes three a.m. \nThen, your head drops, and your final breath passes feebly from your nostrils.");
	}
}
