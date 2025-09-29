public class MainClasse {
    public static void main(String[] args) {
        Classe objet = new Classe(3);
        System.out.println(Classe.work.apply(objet::m1).apply("scala"));
        System.out.println(Classe.work.apply(Classe::m2).apply("scala"));
        System.out.println(Classe.work.apply(Classe.m3).apply("scala"));
    }
}
