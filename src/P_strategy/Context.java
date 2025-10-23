package P_strategy;

import java.util.Scanner;

public class Context {
    private Strategy in;

    public Context() {
        this.in = new StrategyImpl2();
    }

    public void setops(Strategy sst){
        this.in = sst;

    }
    public void ops(){
        in.Ops1();
    }
    Scanner scanner= new Scanner(System.in);
    String sca= scanner.nextLine();


}
