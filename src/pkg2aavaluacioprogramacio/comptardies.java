/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2aavaluacioprogramacio;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author xavier desembre 2017 Ok 12/12/2017
 */

//Salva was Here.
//Salva was here x2.
//Salva was here x3.
//Comentari Xavier.
//Aquí fariem els canvis necessari. Una vegada fets els canvis hem de fer un commit de la versio
//Una vegada fet el commit, el feim en local, farem un push dels fitxers canviats cap al repositori
public class comptardies {
    public static int[] data1=new int[3];
    public static int[] data2=new int[3];

    public static int[] compon_data(String data){
        String dia_string;
        String mes_string;
        String any_string;
        int[] data_int=new int[3];
        if ((data.substring(2,3).equals("/")) && (data.substring(5,6).equals("/"))){
            dia_string=data.substring(0,2);
            mes_string=data.substring(3,5);
            any_string=data.substring(6,10);
            data_int[0]=Integer.parseInt(dia_string);
            data_int[1]=Integer.parseInt(mes_string)-1;
            data_int[2]=Integer.parseInt(any_string);
        } else {
            data_int[0]=9999; //Per detectar data mal formatada
        }
        
        return data_int;
    }

    private static void ordena_dates(int[] datainicial, int[] dataobjectiu){
            int coeficient_datainicial=365*datainicial[2]+
                    30*datainicial[1]+1*datainicial[0];
            int coeficient_dataobjectiu=365*dataobjectiu[2]+
                    30*dataobjectiu[1]+1*dataobjectiu[0];
            if (coeficient_dataobjectiu>coeficient_datainicial) {
                    comptardies.data2[2]=dataobjectiu[2];
                    comptardies.data2[1]=dataobjectiu[1];
                    comptardies.data2[0]=dataobjectiu[0];
                    comptardies.data1[2]=datainicial[2];
                    comptardies.data1[1]=datainicial[1];
                    comptardies.data1[0]=datainicial[0];
            } else {
                    comptardies.data2[2]=datainicial[2];
                    comptardies.data2[1]=datainicial[1];
                    comptardies.data2[0]=datainicial[0];
                    comptardies.data1[2]=dataobjectiu[2];
                    comptardies.data1[1]=dataobjectiu[1];
                    comptardies.data1[0]=dataobjectiu[0];
            }
    }
			
    public static int[] obtenir_data_actual() {
        GregorianCalendar data = new GregorianCalendar();
        int[] data_actual=new int[3];
        data_actual[0] = (data.get(GregorianCalendar.DATE));
        data_actual[1] = (data.get(GregorianCalendar.MONTH));
        data_actual[2] = (data.get(GregorianCalendar.YEAR));
        return data_actual;
    }
    public static boolean comprova_bisiesto(int any){
        if(any % 4 == 0 && any % 100 != 0 || any % 400 == 0)
            return true;
        else
            return false;     
    }
    public static int Dies_mes(int mes){
        int[] dies_mes={31,28,31,30,31,30,31,31,30,31,30,31};
        return dies_mes[mes];
    }
    public static int calcula_dies_anys_sencers(int any_inici, 
            int any_objectiu){
        int dies_parcial=0;
        
        for (int i=any_inici+1;i<any_objectiu;i++) {
            if (comprova_bisiesto(i))
                dies_parcial+=366;
            else
                dies_parcial+=365;
        }
        return dies_parcial;
    }
    public static int calcula_dies_mesos_sencers(int mes_inici, 
            int mes_objectiu, int any_inici, int any_objectiu){
        int dies_parcial=0;
        if (any_inici!=any_objectiu) {
        // Calculam la porció de dies dels mesos sencers des 1/1/ del any 
            for (int i=0;i<mes_objectiu;i++) {
                //Si el mes es febrer i any bisiesto
                if ((i==1) && comprova_bisiesto(any_objectiu)) { 
                    dies_parcial+=29;
                }
                else 
                    dies_parcial+=Dies_mes(i);
            }
            // Calculam la porció de dies dels mesos sencers des del mes 
            // seguent de la data inici
            for (int i=mes_inici+1;i<12;i++) {
                //Si el mes es febrer i any bisiesto
                if ((i==1) && comprova_bisiesto(any_inici)) { 
                    dies_parcial+=29;
                }
                else 
                    dies_parcial+=Dies_mes(i);
            }
        }
        return dies_parcial;
    }
    public static int calcula_dies_sols(int[] data_inicial, int[] data_final){
        int dies_parcial=0;
        if (data_inicial[2]!=data_final[2]){
            dies_parcial+=Dies_mes(data_inicial[1])-data_inicial[0];
            dies_parcial+=data_final[0];   
            // Si el mes es febrer i es bisiesto afagirem 1
            if ((data_inicial[1]==1) && (comprova_bisiesto(data_inicial[2]))) 
                dies_parcial+=1;
        } else {
            dies_parcial=data_final[0]-data_inicial[0];
        }
        return dies_parcial;
    }

    public static void main(String[] args){
        int[] data_inici=obtenir_data_actual();
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Dia data objectiu:");
        int dia_objectiu=sc.nextInt();
        System.out.println("Mes data objectiu:");
        int mes_objectiu=sc.nextInt();
        System.out.println("Any data objectiu:");
        int any_objectiu=sc.nextInt();*/
        boolean error_format_data=false;
        int[] data_objectiu=new int[3];
        do {
            System.out.println("Introdueix data objectiu (dd/mm/aaaa)");
            String data_objectiu_string=sc.nextLine();
            data_objectiu=compon_data(data_objectiu_string);
            if (data_objectiu[0]==9999) {
                System.out.println("Data mal introduïda");
                error_format_data=true;
            } else {
                error_format_data=false;
            }
        } while (error_format_data);
        
        // Ficam la data objectiu dins una matriu per millor tractament
        //int[] data_objectiu={dia_objectiu,mes_objectiu-1,any_objectiu};
        // Ordenam les dates de menor a major i les ficam a data1 i data2
        ordena_dates(data_inici,data_objectiu);
        int dies=calcula_dies_anys_sencers(data1[2],data2[2]);
        dies+=calcula_dies_mesos_sencers(data1[1],data2[1],data1[2],data2[2]);
        dies+=calcula_dies_sols(data1,data2);
        System.out.println("El numero de dies entre "+data1[0]+"/"+(data1[1]+1)+
                "/"+data1[2]+" i "+data2[0]+"/"+(data2[1]+1)+"/"+data2[2]+
                " es de: "+ dies);
    }
}