public class Turma {
    private int id;
    private Disciplina disc;
    private Horario schedule;
    private Professor prof;

    private boolean vago = false;
    public Turma(int id, Disciplina disc, Professor prof, Horario schedule) {
        this.id = id;
        this.disc = disc;
        this.prof = prof;
        this.schedule = schedule;
    }
    public String toString() {
        return this.id+"";
    }
    public int getId() {
        return this.id;
    }
    public Disciplina getDisc() {
        return this.disc;
    }
    public Horario getHorario() {
        return this.schedule;
    }
}
