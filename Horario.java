public class Horario {
    private String horario;
    private char turno;
    private String dia;
    private String hora;
    public Horario(char turno, String dia, String hora) {
        this.horario = dia + turno + hora;
        this.turno = turno;
        this.dia = dia;
        this.hora = hora;
    }
    public char getTurno() { return this.turno; }
    public String getDia() { return this.dia; }
    public String getHora() { return this.hora; }
    public String getSchedule() {
        return this.horario;
    }
}
