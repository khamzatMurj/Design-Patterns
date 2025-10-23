package P_proxy;

public class IServiceImpl implements IService {
    @Override
    public double compute(int para) {
        return para*32;
    }

}
