public class JavaVersionInfo {
    public static void main(String[] args) {
        // JRE Version
        System.out.println("JRE: " +
                System.getProperty("java.version"));
        // JRE Vendor
        System.out.println("JRE vendor: " +
                System.getProperty("java.vendor"));
        // JVM Version
        System.out.println("JVM version: " +
                System.getProperty("java.vm.version"));
        // JVM Name
        System.out.println("JVM NAME: " +
                System.getProperty("java.vm.name"));
        // System.out.println(~-9);
    }
}
