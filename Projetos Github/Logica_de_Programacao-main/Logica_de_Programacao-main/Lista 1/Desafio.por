programa {

	inclua biblioteca Util --> u
	inclua biblioteca Tipos --> t

    const cadeia nome = "Zé"
    real nota1 = 0.0, nota2 = 0.0, media=0.0
    

    funcao inicio() {
    	   
        escreva("Informe a primeira nota: ")
        leia(nota1)
    	   se(nota1 >= 0 e nota1 <= 10){
      	escreva("Informe a segunda nota: ")
          leia(nota2)
        	se(nota2 >= 0 e nota2 <= 10){ 
        		media = (nota1+nota2)/2
          	escreva("O aluno Zé obteve: \n\nNOTA 1 = ", nota1, "\nNOTA 2 = ", nota2, "\nMÉDIA = ", media, "!")
          }
          senao{
      		escreva("Nota invalida, insira a nota novamente\n")
      		u.aguarde(2000)
      		limpa()
    			inicio()
          }
        }
        senao{
    		escreva("Nota invalida, insira a nota novamente\n")
    		u.aguarde(2000)
    		limpa()
    		inicio()
       }
   }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 841; 
 * @PONTOS-DE-PARADA = 12;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */