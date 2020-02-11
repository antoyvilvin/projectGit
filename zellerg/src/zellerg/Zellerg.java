/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//santy Vil
package zellerg;

/**
 *
 * @author antonyvilvin
 */
public class Zellerg {

    String Zellerg[];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int d = ZellerG(4, 1, 2001);

        String[] dias = new String[]{
            "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
   
 
       System.out.println(dias[d]);
    
        //modificamos el programa para visualizar eldia Lunes, martes ...
    }

    private static int ZellerG(int Day, int Month, int Year) {
        int Zeller;

        Month = (Month + 10) % 12;
        Year = Year - 1 * ((Month > 10) ? 1 : 0);
        Zeller = (13 * Month - 1) / 5 + 1 + Year % 100 + (Year % 100) / 4 + (-2 * (Year / 100)) + (Year / 400) % 7;
        Zeller = ((Zeller + Day) % 7 + 6) % 7;
        return Zeller;

    }

}
