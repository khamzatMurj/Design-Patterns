package P_proxy;

public class Proxy implements IService {
//    private IServiceImpl service = new IServiceImpl();
    private IService service ;

    public Proxy(IService service) {
        this.service = service;
    }
    @Override
    public double compute(int para) throws InterruptedException {
        System.out.println("Proxy before");
        double res = service.compute(para);
        System.out.println("Proxy after");
        return res;
    }
}
