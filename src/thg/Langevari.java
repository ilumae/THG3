package thg;
import java.util.Random;
	public class Langevari {
		
		public static void langevari() {
			Random randomno=new Random();
			String [] valik = {"energiajook", "pakk tuletikke", "nuga"};
			
			String asi =valik[randomno.nextInt(valik.length)];
			System.out.println("M�rkad taevast langevat v�ikest langevarju, mis maandub sinust veidi eema. Korjad selle �les ja avad pakendi. Sees on: -" + asi);
			 
		}
	}
