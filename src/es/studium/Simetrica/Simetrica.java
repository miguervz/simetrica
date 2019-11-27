package es.studium.Simetrica;

import java.util.Scanner;

public class Simetrica {

	public static void main(String[] args) {
		int tabla[][] = new int[3][3];
		int i, j;
		boolean simetrica= true;
		Scanner teclado = new Scanner(System.in);
	
		for( i=0;i<3;i++)
		{
		for(j=0;j<3;j++)
		{
		System.out.println("Ingrese el valor de la posición "+i+","+j);
		
		tabla[i][j] = teclado.nextInt();
		}
		}
		for( i=0;i<3;i++)
		{
		for(j=0;j<3;j++)
		{
			if (tabla[i][j]==tabla[j][i])
			{simetrica= true;
			}
			}
   	 }
		if(simetrica)
		{
			System.out.print("Es simétrica");
		}
        else 
        {
        System.out.print("No es simétrica");}
		teclado.close();
}
}
