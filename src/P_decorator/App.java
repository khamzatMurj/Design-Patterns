package P_decorator;

import P_decorator.composant.Boisson;
import P_decorator.composant.Espresso;
import P_decorator.composant.Sumatra;
import P_decorator.decorator.caramel;
import P_decorator.decorator.chantilly;
import P_decorator.decorator.chocolat;
import P_decorator.decorator.vanille;

public class App {
    public static void main(String[] args) {
//
//        Boisson esp=new Espresso();
//        System.out.println(esp.getDescription());
//        System.out.println(esp.cout());
//
//        System.out.println("------------------");
//        esp= new chocolat(esp);
//        System.out.println(esp.getDescription());
//        System.out.println(esp.cout());
//
//        System.out.println("------------------");
//        esp= new vanille(esp);
//        System.out.println(esp.getDescription());
//        System.out.println(esp.cout());
//
//        System.out.println("------------------");
//        esp= new caramel(esp);
//        System.out.println(esp.getDescription());
//        System.out.println(esp.cout());

        Boisson esp=new chantilly(new caramel(new chantilly(new chocolat(new Sumatra()))));
        System.out.println(esp.getDescription());
        System.out.println(esp.cout());

    }
}
