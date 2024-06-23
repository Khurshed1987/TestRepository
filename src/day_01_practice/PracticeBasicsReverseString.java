package day_01_practice;

public class PracticeBasicsReverseString {
    public static void main(String[] args) {
        //reverse a String
        String str = "Hello";
        for (int i = str.length()-1; i >= 0; i--){
            System.out.println(str.charAt(i));
        }
    }
}
