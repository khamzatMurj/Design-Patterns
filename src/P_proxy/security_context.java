package P_proxy;

public class security_context {
    public static String user;
    public static String password;
    public static String role="";

    public static void security_context(String u, String pass, String r) {
        user = u;
        password = pass;
        role = r;
    }
}
