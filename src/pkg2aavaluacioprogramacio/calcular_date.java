/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2aavaluacioprogramacio;

import java.util.Scanner;
import java.util.GregorianCalendar;
/**
 *
 * @author xavier
 */
public class calcular_date {
    
    public static int[] data_actual() {
        GregorianCalendar data = new GregorianCalendar();
        int[] data_avui=new int[3];
        data_avui[0] = (data.get(GregorianCalendar.DATE));
        data_avui[1] = (data.get(GregorianCalendar.MONTH));
        data_avui[2] = (data.get(GregorianCalendar.YEAR));
        return data_avui;
    }
    public static boolean any_traspas(int any){
        if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0)))
            return true;
        else
            return false;
    }
    public static int calcula_dies_anys_complets(int any_objectiu){
        int dies_anys=0;
        int any_actual=data_actual()[2];
        boolean es_futur;
        if (any_actual<=any_objectiu)
            es_futur=true;
        else
            es_futur=false;
        if (es_futur) {
            for(int i=any_actual+1;i<any_objectiu;i++){ //afegim 1 per no comptar l'any inicial que no serà complet
                if(any_traspas(i))
                    dies_anys+=365;
                else
                    dies_anys+=366;
            }
        } else {
            for(int i=any_objectiu+1;i<any_actual;i++){ //afegim 1 per no comptar l'any inicial que no serà complet
                if(any_traspas(i))
                    dies_anys+=365;
                else
                    dies_anys+=366;
            }
        }
        return dies_anys;
    }
    public static int dies_mes(int mes){
        int[] mesos={31,28,31,30,31,30,31,31,30,31,30,31};
        return mesos[mes]; //Afegim +1 per compensar la posició 0 de la matriu
    }
    public static int calcula_dies_fins_final_any(int dia_objectiu, int mes_objectiu){
        int dies_mesos=0;
        int mes_actual=data_actual()[1];
        int dia_actual=data_actual()[0];
        dies_mesos+=dies_mes(mes_actual)-dia_actual; //Calcula dies fins final de mes actual
        for (int i=mes_actual+1;i<12;i++){ //Calcula dies de cada mes, des de mes següent a l'actual fins a desembre
            dies_mesos+=dies_mes(i);
        }
        return dies_mesos;
    }
    public static int calcula_dies_des_de_principi_any(int dia_objectiu, int mes_objectiu){
        int dies_principi_any=0;
        int mes_actual=data_actual()[1];
        int dia_actual=data_actual()[0];
        for (int i=0;i<mes_objectiu;i++){
            dies_principi_any+=dies_mes(i);
        }
        dies_principi_any+=dia_objectiu;
        return dies_principi_any;
    }
    
    public static void main(String[] arg){
        int dies=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Posa any");
        int any=sc.nextInt();
        System.out.println("Posa mes");
        int mes=sc.nextInt()-1;
        System.out.println("Posa dia");
        int dia=sc.nextInt();
        

        int[] data_avui=data_actual();
        dies+=calcula_dies_anys_complets(any);
        dies+=calcula_dies_fins_final_any(dia,mes);
        dies+=calcula_dies_des_de_principi_any(dia,mes);
    
        System.out.println(dies);
        System.out.println(dies_mes(mes));
        System.out.println("Dies fins final d'any: "+calcula_dies_fins_final_any(dia,mes));
        System.out.println("Dies des de principi d'any: "+calcula_dies_des_de_principi_any(dia,mes));
        System.out.println("Dies Total: "+dies);
    }
}
