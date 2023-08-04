import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cat> catList = new ArrayList<>();

//        catList.add(new Cat("Васька", CatBreed.MAINE_COON));

        for (int i = 0; i < 2; i++) {
            catList.add(readCat());
        }
        System.out.println(catList);
    }

    private static  Cat readCat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите имя кота и породу");
        String name = sc.next();
        String stringBreed = sc.next();
        Cat cat = new Cat();
        // if (stringBreed == CatBreed.BRITISH_BLUE.toString()) return new Cat(name, CatBreed.BRITISH_BLUE) ;
        CatBreed cbArr[] = CatBreed.values(); // создание массива из элементов перечисления
        boolean isBreed = false;
        for (int i = 0; i < cbArr.length; i++) {
            if(stringBreed.equals(cbArr[i].toString()) ) {
//                cat = new Cat(name, cbArr[i]);
                cat.name = name;
                cat.breed = cbArr[i];
                isBreed = true;
            }
        }
        if (isBreed) return cat;
        else return new Cat(name, CatBreed.NO_BREED);

    }
}