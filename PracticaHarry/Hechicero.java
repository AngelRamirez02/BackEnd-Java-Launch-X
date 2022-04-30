package PracticaHarry;

public class Hechicero {
    //atributos personales
    private String casa, genero, nombre;
    //atributos magicos
    private String boggart, pattronus;

    //metodos get
    public String getCasa(){  return casa;}
    public String getGenero(){  return genero;}
    public String getNombre(){  return nombre;}
    public String getBoggart(){  return boggart;}
    public String getPattronus(){  return pattronus;}

    //metodos setters
    public boolean setCasa(String casa){
        if (! casa.isEmpty()){
            this.casa= casa;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero= genero;
            return true;
        }else
            return false;
    }
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre= nombre;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart=boggart;
            return true;
        }else
            return false;
    }

    public boolean setPattronous(String pattronus){
        if (!pattronus.isEmpty()){
            this.pattronus=pattronus;
            return true;
        }else {
            return false;
        }
    }

    public String printMagic(){
        return "El mago pertenece a la casa: "+casa+" \n"+
                "Su genero es: "+genero+" \n"+
                "Su nombre es: "+nombre+" \n"+
                "Su boggart es: "+boggart+" \n"+
                "El pattronus que posee se llama: "+pattronus+" \n";
    }

}
