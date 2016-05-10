/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;

/**
 *Supon que temos unha empresa de aluguer de barcos . Para calcular o precio do aluguer multiplicamos o número de días de ocupación por un módulo que reflicte o tamaño do barco ( este módulo calcúlase multiplicando 10 * eslora .
   Agora pretendemos diferenciar a información de alguns tipos de barcos :
Número de mástiles para veleros 
Potencia, en CV, para embarcacions deportivas a motor
Potencia, en CV, e número camarotes para yates
O módulo dos barcos dun tipo especial obtense como o módulo normal máis :
1- Número mástiles para veleros
2- Potencia, para embarcacions deportivas
3- Potencia e nº camarotes para yates
Crea unha clase abstracta Barco e as subclases correspondentes .
Fai un esquema da xerarquia de clases.
 Utilizando Herdanza e polimorfismo .Codifica un programa quea cree un ArrayList  de tipo barcos  nos permita calcular o aluguer de calquera tipo de barco .  Na factura debe ir a matricula do barco , eslora e precio aluguer.  
 * @author aabalalonso
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Barco> barcos = new ArrayList();
        Barco vel = new Veleros(15,2);
        Barco dep = new EmbarcacionesAMotor(14,30);
        Barco yat = new Yates(20,2,35);
        
        barcos.add(vel);
        barcos.add(dep);
        barcos.add(yat);
        
       for(Barco b:barcos){
           b.factura(3);
       }
    }    }
    

