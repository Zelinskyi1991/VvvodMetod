/**
 * Created by werwolf on 07.05.15.
 */

class Box {
    double width;
    double height;
    double depth;



// вывести объем паралелепитета
    void volume () {
        System.out.println ("Объем равено");
        System.out.println(width*height*depth);
    }
}

class VvvodMetod {
public static void main (String [] args) {
    Box mybox1 = new Box();
    Box mybox2 = new Box();

// присваиваем значения переменным экземлятора mybox1

    mybox1.width = 10;
    mybox1.height = 20;
    mybox1.depth = 15;

// присваиваем значения переменным экземлятора mybox2

    mybox2.width = 3;
    mybox2.height = 6;
    mybox2.depth = 9;

// вывести объем первого перелелепитета

    mybox1.volume();

// вывести объем первого перелелепитета

    mybox2.volume();


}
}
