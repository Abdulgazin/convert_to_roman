package Example3;

import java.util.Scanner; // импорт сканнера

class TestThird {
    public static int main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String roman=sc.nextLine();
        if (roman.equals("I")) return 1;
        if (roman.equals("II")) return 2;
        if (roman.equals("III")) return 3;
        if (roman.equals("IV")) return 4;
        if (roman.equals("V")) return 5;
        if (roman.equals("VI")) return 6;
        if (roman.equals("VII")) return 7;
        if (roman.equals("VIII")) return 8;
        if (roman.equals("IX")) return 9;
        if (roman.equals("X")) return 10;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(main());
    }
    //String phrase1 = sc.nextLine();
        //if (sc.hasNextLine()) {
        //    String roman = sc.nextLine();
        //    String number = sc.nextLine();
        //    System.out.println("Спасибо! Вы ввели число " + number);
       // }
    //}    //System.out.println(phrase1);

        //public static int toArabic(){
        //Scanner sc=new Scanner(System.in);
        //    String roman=sc.nextLine();
        //    if (roman.equals("I")) return 1;
        //    if (roman.equals("II")) return 2;
        //    if (roman.equals("III")) return 3;
        //    if (roman.equals("IV")) return 4;
        //    if (roman.equals("V")) return 5;
        //    if (roman.equals("VI")) return 6;
        //    if (roman.equals("VII")) return 7;
        //    if (roman.equals("VIII")) return 8;
        //    if (roman.equals("IX")) return 9;
        //    if (roman.equals("X")) return 10;
        //    return 0;
        }

