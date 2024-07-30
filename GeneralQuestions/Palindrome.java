package GeneralQuestions;

public class Palindrome {
    public static void main(String[] args) {
        String str= "Fingu";
        isPalindrome(str);
    }

    private static void isPalindrome(String str) {
        char[] arr =str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
        }
        if(str.equalsIgnoreCase(String.valueOf(sb)))
        {
            System.out.println(str+" is Palindrome");
        }
        else
        {
            System.out.println(str+" is not Palindrome");
        }
        System.out.println(sb);
    }
}
