programa
{
	inclua biblioteca Tipos --> tp
	inclua biblioteca Matematica --> m

	
	funcao inicio()
	{
	
		real num1
		real num2
		real resultado = 0.0
		
		
		
		escreva("digite o primeiro número \n")
		leia(num1)
		limpa()
		escreva("digite o segundo número \n")
		leia(num2)
		limpa()
		inteiro numint1 = tp.real_para_inteiro(num1 * 10)
		inteiro numint2 = tp.real_para_inteiro(num2 * 10)
		
		
		
		se(numint1 % 10 == 0 e numint2 % 10 == 0){
			inteiro int1 = m.arredondar(num1, 0)
			inteiro int2 = m.arredondar(num2, 0)

			inteiro soma = int1 + int2
			inteiro sub = int1 - int2
			inteiro mult = int1 * int2
			inteiro div =   int1 / int2

			escreva("Soma:" + soma + "\n", "Subtração:" + sub + "\n", "Multiplicação:" + mult + "\n", "Divisão:" + div)
			
		}senao se(numint1 % 10 == 0 e numint2 % 10 != 0){

			inteiro int1 = m.arredondar(num1, 0)

			real soma = int1 + num2
			real sub = int1 - num2
			real mult = int1 * num2
			real div = int1 / num2

			escreva("Soma:" + soma + "\n", "Subtração:" + sub + "\n", "Multiplicação:" + mult + "\n", "Divisão:" + div)
		}senao se(numint1 % 10 != 0 e numint2 % 10 == 0){

			inteiro int2 = m.arredondar(num2, 0)

			real soma = num1 + int2
			real sub = num1 - int2
			real mult = num1 * int2
			real div = num1 / int2

			escreva("Soma:" + soma + "\n", "Subtração:" + sub + "\n", "Multiplicação:" + mult + "\n", "Divisão:" + div)
		}senao{
			real soma = num1 + num2
			real sub = num1 - num2
			real mult = num1 * num2
			real div = num1 / num2

			escreva("Soma:" + soma + "\n", "Subtração:" + sub + "\n", "Multiplicação:" + mult + "\n", "Divisão:" + div)
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 633; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */