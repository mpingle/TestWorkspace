public class SwapTwoNumber {
    public static void main (String[] args) {

        int a=20; int b=30;
        //Logic 1
        int temp = a;
        a=b;
        b=temp;

        System.out.println("Swap number logic 1:" + a +" and "+ b );

        //logic 2 Addition and subtration.

        int c= 100; int d=200;

        c=c+d;
        d=c-d;
        c=c-d;

        System.out.println("Swap number logic 2:" + c +" and "+ d );

        //Logic 3 Multiplication and Division

        int e= 300; int f=400;
        e = e*f;
        f= e/f;
        e=e/f;

        System.out.println("Swap number logic 3:" + e +" and "+ f );

        //Logic 4 Bitwise

        int g= 700; int h=900;
        g= g^h;
        h= g^h;
        g=g^h;

        System.out.println("Swap number logic 4:" + g +" and "+ h );

    }
}
