
public class VarPlay {

	public static void main(String[] args) {
		int a;
		int b; //declaring int's
		a = 1;
		System.out.println(a);
		//a = a + 23;
		a += 23;
		System.out.println(a);
		b = a + 2; //initalizing ints;
		//32 bits
		int c = a + b;
		float f = 1.1f;
		
		f++;
		double d = 2.2;
		System.out.println(f * 10);
		System.out.println(f + f + f + f + f + f + f + f + f + f);
		
		char ch = 'a';
		
		String word = "Too";// String literal
		String word2 = "Too";
		
		//System.out.println(Integer.parseInt(word) + 2 + " That's pretty neat!");
		
		System.out.println(word + " " + word2);
		
		boolean bool = true;
		
		bool = !bool;
		
		System.out.println("" + bool + " " + !bool);
		
		if(word.equals(word2)) System.out.println("We're good!");
		
		System.out.println(word + " has " + word.length() + " letters");
		
		System.out.println(d + a);
		
		if (c % 2 == 0)System.out.println("c is an even number");
	
	}
}
