package P_composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composant {

    //gerer un liste

    private List<Composant> childs=new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public Composant addComponent(Composant composant){
        composant.level=this.level;
        composant.level++;
        childs.add(composant);
        return composant;
    }
    @Override
    public void show() {
        System.out.println(tab()+"Folder :"+name);
        for (Composant cc:childs){
            cc.show();
        }
    }
}
