/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejemplo {

    
/**
 * Ejemplo de ingreso de datos.
 */    
public static void IngresoDeDatos(){

        int num1;
        int num2;
        int resultado;
        Scanner misc;
        misc = new Scanner(System.in);
        
        System.out.println("Ingrese primer número : ");
        num1=misc.nextInt();
        System.out.println("Ingrese segundo número : ");
        num2=misc.nextInt();
        
        resultado=num1+num2;
        System.out.println(resultado);
}    

/**
 * Verifico numeros (mayor,menos e igual)
 */

public static void MostrarMayor()
{
        int num1;
        int num2;
        int resultado;
        Scanner misc;
        misc = new Scanner(System.in);
        
        System.out.println("Ingrese primer número : ");
        num1=misc.nextInt();
        
        System.out.println("Ingrese segundo número : ");
        num2=misc.nextInt();
        
        resultado=num1+num2;
        System.out.println(resultado);
        
        //verificamos cual de los dos num es el mayor
        
        if(num1>num2)
        {
            System.out.println("EL primer número es el mayor");
        }else
        {   if(num2>num1)
        {
            System.out.println("El segundo número es el mayor");
        }else
            
                System.out.println("Son iguales");
        }
    }

/**
 * Saludo.
 */
public static void Saludar()
{
    System.out.println("Hola Mundo");
}


/**
 * Muestra la cantidad de días que tiene el mes
 */
public static void UsoDelSwitch()
{
    String mes;
    Scanner miSc = new Scanner(System.in);
    
    System.out.println("Ingrese mes del año");
    mes=miSc.next();
    mes=mes.toLowerCase();
    switch(mes)
    {
        case "febrero":
            System.out.println("Tiene 28 días");break;
        case "enero":
        case "mayo":
        case "marzo":
        case "julio":
        case "agosto":
        case "octubre":
        case "diciembre":
        
            System.out.println("Tiene 31 días");break;
        default:
        
            System.out.println("Tiene 30 días");
        
      }
  }

/**
 * uso de swicth más if
 */

public static void UsoDeSwitchMasIf()
{
    //se pide el ingreso de un día de la semana y una edad
    //de ser dia del fin de semana y tener menos de 13 años
    //mostrar el msj "a descansar",si es dia de la semana y la misma edad el msj
    // a estudiar,si la edad supera los 18 años el msj es a trabajar.
   //si la edad esta entre los 15 y los 30 "a festejar " solo si es fin de semana 
    
    Scanner miTeclado=new Scanner(System.in);
    String dia;
    int edad;
    
    System.out.println("Ingrese día :");
    dia=miTeclado.next();
    
    System.out.println("Ingrese edad : ");
    edad=miTeclado.nextInt();
    
    dia=dia.toLowerCase();
   
    switch(dia)
    {
        case "domingo":
        case "sabado":
            if (edad<13)
            {
                System.out.println("A descansar");
            }
            
            if(edad>15 && edad<30)
            {
                System.out.println("A festejar");
            }
           break;
        default:
            if(edad<13)
            {
                System.out.println("A estudiar");
            }
            
            if(edad>18)
            {
                System.out.println("A trabajar");
                            
            }
            
            
        
        
        
        
        
        
        
    }
    
    
    
}

/**
 * Iteración con while. Ascendente.
 */
public static void UsoDelWhileAsc()
{
    Integer contador;
    contador=0;
    
    while(contador<10)
    {
        contador++;
        System.out.println("Es la iteracion "+contador);
        
    }
    
    System.out.println("Salió con "+contador);
    
    
    
    
}

/**
 * Iteración while.Descendente.
 */
public static void UsoDelWhileDesc()
{
    Integer contador;
    contador=10;
    
    while(contador>0)
    {
        contador--;
        System.out.println("Es la iteracion "+contador);
        
    }
    
    System.out.println("Salió con "+contador);
}

public static void UsoDelWhileValidar()
{
    Integer edad; //mayor a 0 y menor a 100
    Integer sueldo; //mayor a 0
    String sexo; //f o m
    String tipoAlumno; //C = cursante, L = libre, E = egresado
    Integer temperatura; //-200 y +200
    String respuesta; //si o no
    Scanner misc=new Scanner(System.in);
    
    //pido edad
    System.out.println("Ingrese edad");
    edad=misc.nextInt();
    //valido edad
    while (edad<0 || edad>100)
    {
        System.out.println("Error, Reingrese edad");
        edad=misc.nextInt();
    }
    
    //pido sueldo
    System.out.println("Ingrese sueldo");
    sueldo=misc.nextInt();
    //valido sueldo
    while (sueldo<0)
    {
        System.out.println("Error, Reingrese sueldo");
        sueldo=misc.nextInt();
    }
    
    //pido sexo
    System.out.println("Ingrese sexo");
    sexo=misc.next();
    
    //valido sexo
    while (!sexo.equals("f") && !sexo.equals("m"))
    {
        System.out.println("Error, Reingrese sexo (f o m)");
        sexo=misc.next();
    }
    
    //pido alumno
    System.out.println("Ingrese alumno (C = cursante, L = libre, E = egresado)");
    tipoAlumno=misc.next();
    
    //valido alumno
    while (!tipoAlumno.equals("C") && !tipoAlumno.equals("L") && !tipoAlumno.equals("E"))
    {
        System.out.println("Error, Reingrese alumno (C = cursante, L = libre, E = egresado)");
        tipoAlumno=misc.next();
    }
    switch(tipoAlumno)
    {
            case "C":
            tipoAlumno="Cursante";break;
            case "L":
            tipoAlumno="Libre";break;
            case "E":
            tipoAlumno="Egresado";break;
    }
    
    //pido temperatura
    System.out.println("Ingrese temperatura");
    temperatura=misc.nextInt();
    //valido temp
    while (edad<-200 || edad>200)
    {
        System.out.println("Error, Reingrese temperatura (Rango -200 a 200)");
        temperatura=misc.nextInt();
    }
    
     //pido respuesta
    System.out.println("Ingrese respuesta");
    respuesta=misc.next();
    
    //valido respuesta
    while (!respuesta.equals("si") && !respuesta.equals("no"))
    {
        System.out.println("Error, Reingrese respuesta (si o no)");
        respuesta=misc.next();
    }
    
}

}


