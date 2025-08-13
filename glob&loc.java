class glo{
    static int a;
    static short b;
    static long c;
    static byte d;
    static double e;
    static float f;
    static char g;
    static boolean h;
    static String i;
    public static void main(String[]args){
        System.out.println();
    }
}
class loc{
    public static void main(String[]args){
        System.out.println(glo.a);
        System.out.println(glo.b);
        System.out.println(glo.c);
        System.out.println(glo.d);
        System.out.println(glo.e);
        System.out.println(glo.f);
        System.out.println(glo.g);
        System.out.println(glo.h);
        System.out.println(glo.i);
    }
}
/* here i am accessing global variable in another class local variable
  if we writing global variable in global area we need to use static keyword*/
