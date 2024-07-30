package GeneralQuestions;

public class RemoveSpaceBetween {
    public static void main(String[] args) {
        String str = "Paurav is a good boy";
        removeSpaceBetween(str);
    }

    private static void removeSpaceBetween(String str) {
        str.replace(" ","");
        System.out.println(str);
        System.out.println(str.replace(" ",""));
    }
}
