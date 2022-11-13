public class Disciplina {

    private int id;
    private String code;

    private String name;

    private int estudo;
    private int CR;
    private int CH;
    private int[] requisites;

    public Disciplina(int id, String cod, String name, int estudo, int CR, int CH, int... requisites) {
        this.id = id;
        this.code = cod;
        this.name = name;
        this.estudo = estudo;
        this.CR = CR;
        this.CH = CH;
        this.requisites = requisites;
    }

    public String toString() {
        return code + "|" + name;
    }

    public int[] getRequisites() {
        return this.requisites;
    }
    public String getCod() {
        return this.code;
    }
    public String getName() {
        return this.name;
    }
    public int getCR() {
        return this.CR;
    }
    public int getCH() {
        return this.CH;
    }
}
