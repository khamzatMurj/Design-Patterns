package P_proxy;

public class LoggingProxy implements IService{
    private IService service ;

    public LoggingProxy(IService service) {
        this.service = service;
    }

    @Override
    public double compute(int para) throws InterruptedException {
        long t1 = System.currentTimeMillis();
        Thread.sleep(1000);
        double res = service.compute(para);
        long t2 = System.currentTimeMillis();
        System.out.println("Duration => "+ (t2-t1));
        return res;

    }
}
