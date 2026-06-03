class TypeCastingExample {
    public static void main(String[] args) {
        double d = 25.75;
        int i = (int) d;
        System.out.println("Double Value: " + d);
        System.out.println("After Casting to Int: " + i); 
        int num = 50;
        double result = (double) num;
        System.out.println("Int Value: " + num);
        System.out.println("After Casting to Double: " + result);
    }
}