package Exercicios2;

public class piramideInternet {
	public class Main {
		   public static void triangolo(int altura,int colunas){ 
		       char matrix[][]=new char[altura][colunas];
		       int limitesesq,limitesdireita;
		         for(int y=0;y< altura; y++ ){//coloca '0'na matriz
		                 for(int i=0;i <  colunas; i++) 
		                          matrix[y][i]='o';
		         }
		             
		           for(int y=0;y <=6;y++){
		             limitesesq=(colunas/2) - y;  
		             limitesdireita=( colunas/2)+y;
		                   for(int i=limitesesq;i < limitesdireita; i++){
		                          matrix[y][i]='*';//coloca a sequencia que vc quiser 
		                        if(y == colunas/2) matrix[0][y]='*';
		                 }
		             }
		     
		                   for(int y=0;y< matrix.length; y++ ){//imprime a MATRIZ
		                         for(int i=0;i <  colunas; i++) 
		                             System.out.printf("%c",matrix[y][i]);
		                 System.out.println();
		                  }
		    }
		 
		    public static void main(String[] args) {
		        triangolo(7,12);
		    }
	}
}
