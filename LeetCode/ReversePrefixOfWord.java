package LeetCode;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word = "xyxzxe";
        char ch = 'z';
        System.out.println(reversePrefix(word,ch));
    }
    public static String reversePrefix(String word, char ch) {
        char[] wordArray = word.toCharArray();
        int index =0;
        boolean flag =false;
        StringBuilder sb = new StringBuilder();
        StringBuilder remaining = new StringBuilder();
        StringBuilder finalWord = new StringBuilder();
        for(int i=0;i<wordArray.length;i++)
        {
            if(wordArray[i] == ch)
            {
                flag =true;
                index = i;
            }
            sb.append(wordArray[i]);
            if(flag)
            {
                break;
            }
        }
        for(int j=index+1;j<wordArray.length;j++)
        {
            remaining.append(wordArray[j]);
        }
        if(flag)
        {
            return finalWord.append(sb.reverse()).append(remaining).toString();
        }
        else {
            return word;
        }
    }
}
