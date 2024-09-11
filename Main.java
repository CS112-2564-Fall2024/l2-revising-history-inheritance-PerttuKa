/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author Perttu Kaislasaari
 * @version 1.0
 */

public class Main {
	public static void main(String[] args) {
		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);
		tulsaRiot.teach();
		
		
		String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
			tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedEvent tulsaMassacre = new RevisedEvent(tulsaDescription, tulsaDay, tulsaRevised, tulsaCitation);
		tulsaMassacre.teach();

		String genevaDescription = "The Geneva Convention is a series of international treaties designed to ensure humanitarian treatment in war. The first Convention was adopted after the conclusion of the war, and it established protections for wounded soldiers and medical personnel. Subsequent Conventions, notably those of 1906, 1929, and 1949, expanded protections to include prisoners of war and civilians in conflict zones, setting standards for ethical conduct during armed conflicts.";
		Date genevaDay = new Date(8, 22, 1864);
		HistoricalEvent genevaEthics = new HistoricalEvent(genevaDescription, genevaDay);
		genevaEthics.teach();

		String genevaRevised = "The Geneva Conventions are a series of treaties that establish the standards for humanitarian treatment in wartime. The original 1864 Convention, initiated by the International Committee of the Red Cross (ICRC), focused on the care of wounded soldiers on the battlefield. Over time, the Conventions have been updated and expanded to cover a wider range of humanitarian concerns, including the treatment of prisoners of war and the protection of civilians. The 1949 Conventions, in particular, are considered a cornerstone of modern international humanitarian law, emphasizing the principle of protecting non-combatants and ensuring humane treatment of all persons affected by armed conflict.",
			genevaCitation = "https://www.icrc.org/en/law-and-policy/geneva-conventions-and-their-commentaries";
		RevisedEvent genevaConvention = new RevisedEvent(genevaDescription, genevaDay, genevaRevised, genevaCitation);
		genevaConvention.teach();
		
		System.out.println("\n====================================================");
		System.out.println("!Sorting!");
		System.out.println("!Sorting!");
		System.out.println("!Sorting!");
		System.out.println("!Sorting!");
		System.out.println("!Sorting!");
        System.out.println("====================================================");

		HistoricalEvent[] array = { tulsaMassacre, tulsaRiot };

       // Bubble Sort
       // https://en.wikipedia.org/wiki/Bubble_sort
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i].compareTo(array[i+1]) > 0) {
					HistoricalEvent temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			array[i].teach();
		}


		//Bubble Sort
		// int[] array = { 4, 5, 6, 3, 2, 8, 9 };
		// for (int j = 0; j < array.length; j++) {
		// 	for (int i = 0; i < array.length - 1; i++) {
		// 		if (array[i] > array[i + 1]) {
		// 			int temp = array[i];
		// 			array[i] = array[i + 1];
		// 			array[i + 1] = temp;
		// 		}
		// 	}
		// }
		// for (int i = 0; i < array.length - 1; i++) {
		// 	System.out.print(array[i] + " ");
		// }
	}
}