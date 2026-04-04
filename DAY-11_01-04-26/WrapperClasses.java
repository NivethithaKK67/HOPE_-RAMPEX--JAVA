public class WrapperClasses {
    public static void main(String[] args) {
        // int a = 10;
        // System.out.println(a);
        // Integer objA = 10;//Integer.valueOf(a);
        // System.out.println(objA);
        // System.out.println(a==objA);
        // System.out.println(objA.hashCode());
        Character c = 'a';
        System.out.println(c);
        System.out.println(c.hashCode());
        char b = c.charValue();
        System.out.println(b);
        System.out.println(b==c);

    }
}
