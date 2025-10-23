package P_strategy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("default strategy");
        Context cc=new Context();
        cc.setops(new StrategyImpl1());
        cc.ops();
        while(true){
            try {


                System.out.println("Donner moi la strategy");
                Scanner scann = new Scanner(System.in);
                String theStrategy = scann.nextLine();
                Strategy sss = (Strategy) Class.forName(theStrategy).newInstance();
                cc.setops(sss);
                cc.ops();
            }catch(Exception e){
                System.out.println("Innvalid");

            }
        }


    }
}