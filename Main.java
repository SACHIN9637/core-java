import java.util.Scanner;

class complex{
    Scanner Sc = new Scanner(System.in);
    int real;
    int img;

    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Real Part: ");
        real = sc.nextInt();
        System.out.println("Enter Img Part: ");
        img = sc.nextInt();
    }

    void show(){
        System.out.println(real + " + " + img +"i");
    }

    complex add(complex  c2){
        complex res = new complex();
        res.real = real + c2.real;
        res.img = img + c2.img;
        return res;
    }
    complex sub(complex  c2){
        complex res = new complex();
        res.real = real - c2.real;
        res.img = img - c2.img;
        return res;
    }

    complex prod(complex  c2){
        complex res = new complex();
        res.real = (real*c2.real) - (img * c2.img);
        res.img  = (real*c2.img) + (img * c2.real);
        return res;
    }

}

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        complex c1 = new complex();
        complex c2 = new complex();
        complex res = new complex();
        c1.get();
        c1.show();
        c2.get();
        c2.show();
        System.out.println("Addition of This Complex No.s: ");
        res = c1.add(c2);
        res.show();
        System.out.println("Subtraction of This Complex No.s: ");
        res = c1.sub(c2);
        res.show();
        System.out.println("Multiplication of This Complex No.s: ");
        res = c1.prod(c2);
        res.show();
    }
}