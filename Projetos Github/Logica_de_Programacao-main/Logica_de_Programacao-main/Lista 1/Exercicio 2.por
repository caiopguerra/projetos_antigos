programa
{

 
	
	funcao inicio()
	{
          inteiro idade1 = 0
          inteiro idade
          inteiro somas = 0
          


		para(inteiro i = 0; i < 5; i++){
	     	escreva("Digite a idade do colega" , (i + 1) , "\n")
			leia(idade1)
			somas += idade1
			limpa()
		}


		escreva("Digite a sua idade \n")
		leia(idade)
		limpa()

		inteiro soma = somas + idade

		escreva("o tempo de vida de voces é " + soma)
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */