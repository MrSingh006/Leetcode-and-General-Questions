package GeneralQuestions;

public class RemoveSpaceEnd {
    public static void main(String[] args) {
        String str = "  Paurav is a good boy  ";
        removeSpaceEnd(str);
    }

    private static void removeSpaceEnd(String str) {
        System.out.println(str);
        System.out.println(str.trim());
    }
}
