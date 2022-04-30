package PracticaHarry;

public class PruebaHechicero {

    public static void main(String[] args) {
        show();
    }

    public static void show(){
        //creacion de los objetos
        Hechicero h1 = new Hechicero();
        Hechicero h2 = new Hechicero();
        Hechicero h3 =new Hechicero();
        Hechicero h4 = new Hechicero();
        Hechicero h5 = new Hechicero();

        //personaje 1
        h1.setNombre("Harry Potter");
        h1.setGenero("Masculino");
        h1.setCasa("Gryffinfor");
        h1.setBoggart("Dementor");
        h1.setPattronous("Espectro");
        System.out.println(h1.printMagic());

        //personaje 2
        h2.setNombre("Ronald");
        h2.setGenero("Masculino");
        h2.setBoggart("Dementor");
        h2.setCasa("Gryffinfor");
        h2.setPattronous("Riddikulus");
        System.out.println(h2.printMagic());

        //personaje 3
        h3.setNombre("Hermione");
        h3.setGenero("Femenino");
        h3.setBoggart("Dementor");
        h3.setCasa("Gryffinfor");
        h3.setPattronous("Riddikulus");
        System.out.println(h3.printMagic());

        //personaje 4
        h4.setNombre("Voldemort");
        h4.setGenero("Masculino");
        h4.setBoggart("--");
        h4.setCasa("--");
        h4.setPattronous("--");
        System.out.println(h4.printMagic());

        //personaje 5
        h5.setNombre("Dumbledore");
        h5.setGenero("Masculino");
        h5.setBoggart("Dementor");
        h5.setCasa("Gryffinfor");
        h5.setPattronous("Riddikulus");
        System.out.println(h4.printMagic());

    }
}
