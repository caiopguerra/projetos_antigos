programa
{
	
	funcao inicio()
	{
		cadeia nome
		cadeia sobrenome
          caracter genero
		
		escreva("Qual o seu nome ? \n")
		leia(nome)
		limpa()
		
		escreva("Qual o seu sobrenome \n")
		leia(sobrenome)
          limpa()
          
		escreva("Qual o seu genero \n")
		leia(genero)
          limpa()
          
		se(genero == 'M' ou genero == 'm') {
			escreva("Olá" + nome + " " + sobrenome + ", seja bem vindo ao mundo da programação")
		} 
		senao se(genero == 'F' ou genero == 'f'){
			escreva("Olá" + " " + nome + " " + sobrenome + ", seja bem vinda ao mundo da programação")
		}
		senao{
			escreva("letra inválida")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 593; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */