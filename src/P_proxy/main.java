package P_proxy;

public class main {
    public static void main(String[] args) throws InterruptedException {
        security_context.security_context("user1","1234", "root");
        Context context = new Context();
        context.setService(new security_Proxy(new CacheProxy(new LoggingProxy(new IServiceImpl()))));
        context.com_pute(3);
        context.com_pute(3);

    }
}
