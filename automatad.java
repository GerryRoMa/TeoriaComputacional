//Gerardo de Jesús Rodriguez Martinez 140384    
//Expresión regular 1(00*)*
package automatad;
import java.util.Scanner; //importamos libreria
/**
 *
 * @author GERAR
 */
public class automatad {
    int val;
    char [] carac;
    boolean verda;
    
    public static void main(String[] args) {
        automatad au=new automatad();
        String cade;
        Scanner en=new Scanner(System.in); //definimos nuestro escaner
        cade=en.next();
        au.carac=cade.toCharArray(); //la cadena leida se va a un arreglo de caracteres 
        au.inicia(); //inicia la funcion
        if(au.verda) 
        {
            System.out.println("Cadena aceptada");
        }
        else
        {
            System.out.println("Cadena no aceptada");
        }
        
    }
    public void inicia()
    {
           
            val=0; //contador inicia en 0
            verda=false; //boleano empieza en falso
            q0(); //nos manda a la función Q0
        
    }
    public void q0()
    {      
        System.out.println("En Q0");
        if(val<carac.length) //si el contador es menor que la longitud de la cadena se hace
        {
            if(carac[val]=='1') //si el valor de la cadena en 0 es 1 
            {
              val++; //aumenta el contador
              q1(); //nos manda a q1
            }
//si se añade cualquier otro valor nos arroja cadena no aceptada ya que q0 no es estado aceptador
        }
    }
    public void q1()
    {
        verda=true; //q1 es estado aceptador
        System.out.println("En Q1");
        if(val<carac.length)//si el contador es menor que la longitud de la cadena se hace
        {
            if(carac[val]=='1')//si el valor siguiente de la cadena es 1 
            {
               val++; //aumenta el contador
               q2();     //nos manda a q2   
            }
            else
                if(carac[val]=='0')//si el valor siguiente de la cadena es 0
            {
               val++; //aumenta el contador
               q3();    //nos manda a q3    
            }
  
        }
    }
    public void q2()
    {
        
        System.out.println("En Q2");
        if(val<carac.length)//si el contador es menor que la longitud de la cadena se hace
        {
            if(carac[val]=='1')//si el valor siguiente de la cadena es 1 
            {
               val++; //aumenta el contador
               error();   //nos manda a la funcion error por que no es aceptador q2
            }
            else
             if(carac[val]=='0')//si el valor siguiente de la cadena es 0
            {
               val++; //aumenta el contador
               error();      //nos manda a la funcion error por que no es aceptador q2
            }  
        }
    }
    public void q3()
    {
        verda=true; //q3 es estado aceptador
        System.out.println("En Q3");
        if(val<carac.length) //si el contador es menor que la longitud de la cadena se hace
        {
            if(carac[val]=='0')//si el valor siguiente de la cadena es 0
            {
               val++; //aumenta el contador
               q3();   //nos manda a q3 por que es aceptador con 0       
            }
            else
            if(carac[val]!='0')//si el valor siguiente de la cadena es diferente de 0 
            {
               val++; //aumenta el contador
               error();  //nos manda a la funcion error por que a pesar que es aceptador 1 ya no lo aceptada   
            }
  
        }
    }
    
    public void error()
    {
       
         verda = false; //verda cambia a falso y nos indica que no es aceptada la cadena
        return;
    }
  
}


//La verdad me guié en el algoritmo que escribió en el pizarrón y a partir de ahí lo segui batalle un 
//poco por que no llevo programación y no es como que me encante,pero debia hacerlo aunque automatas si me gusta