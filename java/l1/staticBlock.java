// package oops.l1;

public class staticBlock {
    static int a=3;
    static int b;

    static{
        System.out.println("This is the static block");
        b = a * 3;
    }

    public static void main(String[] args) {
        new staticBlock();
        System.out.print(staticBlock.a + " " + staticBlock.b);
    }
}
