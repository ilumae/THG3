package thg;

public class Sissejuhatus {

	public static void main(String[] args) {
		String nimi = args[0];
		int piirkond = Integer.parseInt(args[1]);
		Mangija mangija = new Mangija(nimi, piirkond);
		boolean kas_elus = true;
		Liikumine kaimine = new Liikumine();
		// Tekst tuleks ilmselt pigem kolmeks eraldi failiks teha.
		String esimene_pool = "Teretulemast mängima meie väikest projekti.\r\n"
				+ "Liikuda erinevates suundades saad nooltega (kusjuures ^ on põhi, > ida jne)\r\n"
				+ "\r\n" + "Now.. to why you, ";
		String keskmine_osa = ", are here today. The 73rd Hunger games are about to begin.\r\n"
				+ "And Your name was reaped from the ";
		String lopp = "'th district. Now how does that make you feel? \n"
				+ "Oh, enough about that. \n"
				+ "Why don't we describe the arena to you instead while you're standing on that platform, \n"
				+ "waiting for the countdown to reach zero to fight for your life, eh? \n\n"
				+ "The immediate area around the tributs is bare, except for the huge Cornucopia \n"
				+ "To the north of you, you can see a big mountain. \n"
				+ "A mountain, that suspiciously looks like a volcano. \n"
				+ "Dear lord, I hope not. \n\n"
				+ "To the east is a wonderful, thick (and dark and probably filled with many deadly mutants) forest.\n\n"
				+ "To south of you there is what seems to be a valley. Pretty eh? \n"
				+ "And to the west there's some sort of a lake and what seems to be more forest behind it. \n\n"
				+ "Only three more seconds to go. One last thing though. If you're from district 1-8, \n"
				+ "your battling skills are slightly better than others' \n"
				+ "and tributes from districts 9-12 have a slight edge in finding edible food. \n\n"
				+ "Hope you know what you're going to do next. Good luck! \n"
				+ "Or should I say, May the odds be ever in your favour. \n\n ";

		System.out.println(esimene_pool + nimi + keskmine_osa + piirkond + lopp);

		while (kas_elus){
			kaimine.liikumine();
			System.out.println();
			kas_elus = mangija.juhtumid();
			System.out.println("\n");
		}
		mangija.gameover();

	}

}
