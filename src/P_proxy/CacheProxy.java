package P_proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements IService{
    private Map<Integer, Double> cache = new HashMap<>();
    private IService service;

    public CacheProxy(IService service) {
        this.service = service;
    }

    @Override
    public double compute(int para) throws InterruptedException {
        Double cacheResult = cache.get(para);
        if(cacheResult != null){
            System.out.println("---------Cache Result---------");
            return cacheResult;

        }else {
            double res = service.compute(para);
            cache.put(para, res);
            System.out.println("---------NEW compute---------");
            return res;
        }

    }

}
