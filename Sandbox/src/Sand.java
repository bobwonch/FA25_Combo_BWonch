import java.util.Arrays;

public class Sand {
	public static void main(String[] args) {
//		String[] arr = {"a", "b", "c", "a"};
//		String[] newArr = wordsWithout(arr , "b");
//		System.out.println(Arrays.toString(newArr));
		
		String sentence = "This method works as if by "
				+ "invoking the two-argument split method "
				+ "with the given expression and a limit "
				+ "argument of zero. Trailing empty strings "
				+ "are therefore not included in the resulting array.";
		
		String[] words = sentence.split(" ");
		String[] letters = words[10].split("");
		System.out.println(letters[4]);
    }
	public static String[] wordsWithout(String[] words, String target) {
		  String[] ret;
		  int count = 0;
		  for(String word : words )
		  {
		    if(word.equals(target))count++;
		  }
		  ret = new String[count + 1];
		  count = 0;
		  for(int i = 0; i < words.length; i++)
		  {
		    if(!words[i].equals(target))
		    {
		      ret[count] = words[i];
		      count++;
		    }
		  }
		  return ret;
		}

    
}