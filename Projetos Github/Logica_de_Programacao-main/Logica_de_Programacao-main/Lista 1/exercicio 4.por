programa
{
	
	funcao inicio()
	{
		real celcius
		real fahrenheit

          escreva("Digite a temperatura em Celcius \n")
          leia(celcius)
          limpa()

          real conversao = celcius * 1.8 + 32
          fahrenheit = conversao

          escreva("Temperatura em °C: " + celcius + "\n")
          escreva("Temperatura em °F: " + fahrenheit)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 122; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */