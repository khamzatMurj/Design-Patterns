package P_proxy;

public class security_Proxy implements IService {
//    private IServiceImpl service=new IServiceImpl();
    private IService service ;

    public security_Proxy(IService service) {
        this.service = service;
    }

    //je veux tester si l'user a le droit

    @Override
    public double compute(int para) throws InterruptedException {
        if (security_context.role.equals("root")){
            double res = service.compute(para);
            return res;

        }else {
            throw new RuntimeException("Not Authorized");
        }

//        if(!security_context.role.equals("root")){
//            throw new RuntimeException("Not Authorized");
//        }
//        double res = service.compute();
//        return res;
    }
}
