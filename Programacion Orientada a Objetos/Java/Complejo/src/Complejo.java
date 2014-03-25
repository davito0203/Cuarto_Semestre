/* práctica 1 - ejercicio 2 */

    public class Complejo {
   
      public static final int CARTESIANAS = 0;
      public static final int POLARES = 1;
   
      private double parteReal;
      private double parteImaginaria;
   
   
    // CONSTRUCTORES
    // .......................
       public Complejo (double x,double y) {
         this(x,y,CARTESIANAS);
      }
       public Complejo (double x,double y,int tipo) {
         if (tipo == CARTESIANAS){
            parteReal=x;
            parteImaginaria=y;
         } 
         else if (tipo == POLARES){
            parteReal=x*Math.cos(y);
            parteImaginaria=x*Math.sin(y);
         } 
         else {
            System.out.println("Constructor mal invocado");
         }
      }
   
    // ACCESORES
   
       public double getParteReal() {
         return parteReal;
      }
   
       public double getParteImaginaria() {
         return parteImaginaria;
      }   
   	
   	// OPERACIONES
   	
       public Complejo suma(Complejo c) {
         Complejo nuevoComplejo= new Complejo(parteReal+c.getParteReal(),parteImaginaria+c.getParteImaginaria());
         return nuevoComplejo; 			
      }
   
       public Complejo resta(Complejo c) {
         Complejo nuevoComplejo= new Complejo(parteReal-c.getParteReal(),parteImaginaria-c.getParteImaginaria());
         return nuevoComplejo;
         }
}   