package P_composite;

public class test {
    public static void main(String[] args) {
        Folder root=new Folder("DP");
        File f1=new File("f1");
        File f2=new File("f2");
        File f3=new File("f3");
        File f4=new File("f4");
        Folder root2=new Folder("Comportement");




        root.addComponent(root2);
        Folder observer=(Folder)root2.addComponent(new Folder("observer"));
        observer.addComponent(new File("i¡m herre"));
        root.addComponent(f1);
        root2.addComponent(f2);
        root.addComponent(f3);
        root2.addComponent(f4);
        root.show();


    }
}
