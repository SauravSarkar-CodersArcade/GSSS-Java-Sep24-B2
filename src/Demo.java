public class Demo {
    static int maxRegions(int n){
        return (n * (n+1)/2) + 1;
    }
    public static void main(String[] neha) {
//        char[] data = {'N','E','H','A'};
//        String name = new String(data);
//        System.out.println(name); // NEHA
        System.out.println(maxRegions(0));
    }
}
