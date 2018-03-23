#include <stdio.h>
#include <stdlib.h>
// Se ingresar numeros(distintos de cero), no se saben cuantos
//Se pide mostrar cantidad de pares e impares,porcentaje de numeros positivos y negativos
//Máximo y mínimo,máximo número par,cantidad de numeros comprendidos entre 125 y 236
//
int main()
{
    int numero;
    int cantidadNumIngresados=0;
    int pares=0;
    int impares=0;
    int maximo;
    int minimo;
    int primerNumPar=0;
    int maximoNumPar;
    int cantidadNumPos=0;
    int cantidadNumNeg=0;
    float porcentajeNumPos;
    float porcentajeNumNeg;
    int numComprendidos=0;
    char rta='s';


    while(rta!='n')
    {
        //pido numero
        printf("\nIngrese numero ");

        scanf("%d",&numero);
        //valido que no sea 0
        while(numero==0)
        {
            printf("Ingrese numero distinto de cero");

            scanf("%d",&numero);

        }
        //maximo numero par
        if(numero%2==0)
        {
            maximoNumPar=numero;

        }

        //pares e impares
        if(numero%2==0)
        {
            pares++;
            primerNumPar=pares;
        }else
        {
            impares++;
        }

        //maximo numero par
        if(numero%2==0 && primerNumPar==1)
        {
            maximoNumPar=numero;

        }

        if(numero%2==0 && maximoNumPar<numero)
            {
                maximoNumPar=numero;

            }

        //positivos y negativos
        if(numero>0)
        {
            cantidadNumPos++;

        }else
        {
            cantidadNumNeg++;

        }
        //maximo y minimo
        if(cantidadNumIngresados==0)
        {
            maximo=numero;
            minimo=numero;

        }else
        {
            if(numero>maximo)
            {
                maximo=numero;
            }

            if(numero<minimo)
            {
                minimo=numero;

            }
        }
        //num comprendidos entre 125 y 236
        if(numero>125 && numero<236)
        {
            numComprendidos++;

        }

        cantidadNumIngresados++;

        printf("Desea continuar? ");
        rta=getche();
}
    //casteo convertir un numero a otro tipo de num.
    porcentajeNumPos=(float)(cantidadNumPos*100)/cantidadNumIngresados;
    porcentajeNumNeg=100-porcentajeNumPos;

    printf("\n Cantidad numeros ingresados : %d",cantidadNumIngresados);
    printf("\n Cantidad de numeros pares: %d",pares);
    printf("\n Cantidad de numeros impares : %d",impares);
    printf("\n Numero maximo %d :",maximo);
    printf("\n Numero minimo %d :",minimo);
    printf("\n Maximo numero par %d :",maximoNumPar);
    printf("\n Cantidad de numeros positivos: %d",cantidadNumPos);
    printf("\n Cantidad de numeros negativos : %d",cantidadNumNeg);
    printf("\n Porcentaje numeros positivos :  %f",porcentajeNumPos);
    printf("\n Porcentaje numeros negativos :  %f",porcentajeNumNeg);
    printf("\n Numeros entre 125 y 236 :%d ",numComprendidos);





    /**
    int numero;
    char n;
    printf("Ingrese numero");
    scanf("%d",&numero);
    printf("Ingrese caracter");
    scanf("%c",&n);
    fflush();
    getch();


    return 0;*/


    return 0;
}
