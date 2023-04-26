public class DataHora extends Data{

    private int hora;
    private int minuto;

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }

    

    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }


    public DataHora(int ano, int mes, int dia, int hora, int minuto){
        super(ano, mes, dia);
        this.hora = hora;
        this.minuto = minuto;

    }
    @Override

    public int DataHora(int ano, int mes, int dia, int hora, int minuto){
        
        
        setDia(dia);
        setAno(ano);
        setHora(hora);
        setMes(mes);
        setMinuto(minuto);
    }
    
}
