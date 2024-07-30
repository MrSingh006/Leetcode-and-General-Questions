package DesignPattern.Builder;

public class Shop {
    public static void main(String[] args) {
        // regular way
        Phone p =new Phone("Android",8,3000,6.4);
        System.out.println(p);

        //builder pattern
        Phone P =new PhoneBuilder().setOs("Android").setScreenSize(6.5).getPhone();
        System.out.println(P);
    }
}
