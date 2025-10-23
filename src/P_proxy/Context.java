package P_proxy;

public class Context {
    private IService service;

    public void com_pute(int para) throws InterruptedException {
        double result = service.compute(para);
        System.out.println(result);
    }

    public void setService(IService service){
        this.service= service;
    }


}
