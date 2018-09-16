package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac a = Zodiac.AQUARIUS;
		ptf(a);
		
	}

	public static void ptf(Zodiac a) {
		switch (a) {
		case ARIES: {
			System.out.println("You will meet a ram in your future");
			break;
		}
		case AQUARIUS: {
			System.out.println("You will be drinking a lot of water in your future");
			break;
			}
		case GEMINI: {
			System.out.println("You will discover you have a long lost twin sister");
			break;
			}
		case CANCER: {
			System.out.println("You will discover you quite enjoy eating crab");
			break;
			
			}
		case LEO: {
			System.out.println("You will see a lion in your near future");
			break;
			
			}
		case VIRGO: {
			System.out.println("You will learn you have to leave some things to chance today");
			break;
			
			}
		case LIBRA: {
			System.out.println("You serve justice today");
			break;
			
			}
		case SCORPIO: {
			System.out.println("You will be stung by a scorpion today");
			break;
			
			}
		case SAGITTARIUS: {
			System.out.println("You will get a bullseye in archery today");
			break;
			
			}
		case CAPRICORN: {
			System.out.println("You will eat Chevon underwater today");
			break;
			
			}
		case PISCES: {
			System.out.println("You will dress up as a fish with someone");
			break;
			
			}
		case TAURUS: {
			System.out.println("You will eat beef today");
			break;
			
			}
		}
	}
}
