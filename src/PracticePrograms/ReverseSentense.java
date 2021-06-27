//Reverse a sentence

package PracticePrograms;

public class ReverseSentense {

	public static void main(String[] args) {
		
    String str1 = ("I am learning java");
    String str2 = ("");
    String[] words = str1.split(" ") ;
    
	 for(int i = words.length-1; i >=0; i--)
	 {
		 
		 str2 = str2 + words[i] + " ";
	 }
	 
	 System.out.println(str2);
        
    
	}
}
