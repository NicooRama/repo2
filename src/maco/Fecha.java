package maco;

public class Fecha {
    private int dia;
    private int mes;
    private int a�o;
     
    public Fecha(int dia,int mes,int a�o)
    {
        //recibe un dia mes y a�o y los setea en los parametros
        setDia(dia);
        setMes(mes);
        setA�o(a�o);
    }
     
    public String toString()
    {
        //se usa String.valueOf para pasar un int a un string y poder concatenarlo con las barras
        return (String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(a�o));
    }
     
    public boolean equals(Fecha otra) //para ver si una fecha es la misma que otra
    {
        boolean retorno = (otra.dia == dia)&& (otra.mes == mes) && (otra.a�o == a�o); //verifica si el dia mes y a�o de cada fecha son iguales
        return retorno;
    }
     
    //getters y setters
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
 
    public int getMes() {
        return mes;
    }
 
    public void setMes(int mes) {
        this.mes = mes;
    }
 
    public int getA�o() {
        return a�o;
    }
 
    public void setA�o(int a�o) {
        this.a�o = a�o;
    }
}