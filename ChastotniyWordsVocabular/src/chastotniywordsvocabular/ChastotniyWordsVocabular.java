package chastotniywordsvocabular;
import java.util.HashMap;
import java.util.Scanner;
public class ChastotniyWordsVocabular {

    public static void main(String[] args) {       
        System.setProperty("console.encoding","utf-8");
        HashMap<String,Integer> listW = new HashMap<>();
        String[] text = new Scanner(System.in).nextLine().split(" ");        
        for (String text1 : text) {
            if(listW.containsKey(text1)){
                int n = listW.get(text1)+1;                
                listW.replace(text1, n);
            }
            else
                listW.put(text1, 1);                
        }                    
        System.out.println(listW);
    }
    
}