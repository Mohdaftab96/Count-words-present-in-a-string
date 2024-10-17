
// output
// String[] word = {"welcome", "to", "geeks", "aftab", "GeeksforGeeks"};
// String str = "GeeksforGeeks a computer science portal for geeks";
// Count Occurence is : 2


// words[] = {"Save", "Water", "Save", "Yourself"}
// str = "Save";


import java.util.HashSet;
public class Count_words_present_in_a_string {

    static int countWords(String str, String[] word) {

        int n = word.length;
        // System.out.println(n + " ");

        HashSet<String> hs = new HashSet<>();
       
        for(int i=0; i<n; i++){
            hs.add(word[i]);
        }
        // System.out.print(hs + " ");

    
        String arr[] = str.split(" ");
        int n1 = arr.length;

        int count = 0;
        for(int i=0; i<n1; i++){
            if(hs.contains(arr[i])){
                count = count + 1;
            }
        }
        
        return count;
    }


       

    /* Driver program*/
    public static void main(String args[]){

        String[] word = {"welcome", "to", "geeks", "aftab", "GeeksforGeeks"};
        String str = "GeeksforGeeks a computer science portal for geeks";

        // countWords(str, word);
        System.out.println("Count Occurence is : " + countWords(str, word));

    }
    
}


