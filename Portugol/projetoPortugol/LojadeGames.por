programa
{
	inclua biblioteca Util --> u
	inclua biblioteca Sons --> s
	inclua biblioteca Texto --> txt
	inclua biblioteca Tipos --> t
	inclua biblioteca Matematica  --> m
		
	real valor = 0.0
	inteiro logout = 0
	cadeia usuario = "", senha = ""
	cadeia usuarios[6][6]

	funcao inicio()
     {
    	
	    	usuarios[0][0] = "Administrador"
	     usuarios[0][1] = "123456"
	     usuarios[1][0] = "Gabriel"
	     usuarios[1][1] = "654321"
	     usuarios[2][0] = "Caio"
	     usuarios[2][1] = "010203"
	     usuarios[3][0] = "Felipe"
	     usuarios[3][1] = "030201"
	     usuarios[4][0] = "Max"
	     usuarios[4][1] = "678910"
	     usuarios[5][0] = "Rafael"
	     usuarios[5][1] = "109876"
	
    	     logo()
    	     iniciar()
	}	
	
	funcao menu()
	{
		inteiro escolha_menu
			escreva("********************************************\n")
			escreva("**********   BEM-VINDO A STEAM7   **********\n")
			escreva("********************************************\n")
			escreva("============================================\n")
			escreva("|(1)Categorias|(2)Carrinho|(3)Ajuda|(4)Sair|\n")
			escreva("\n")
			escreva("Escolha uma opção do menu: ")
			leia(escolha_menu)
			
	}

		
   

	funcao admin()
    {
        escreva("Usuário: \n")
        leia(usuario)
        limpa()
        escreva("Senha: \n")
        leia(senha)
        limpa()

		login = falso
		
		para(i = 0; i < 1; i++)

		{

			se(usuario == usuarios[i][0] e senha == usuarios[i][1])
			{
				login = verdadeiro	
			}	
		}

		se(login)
		{
			escreva("Login feito com sucesso!\n")
			u.aguarde(1500)
			limpa()
			menu()							

			limpa()
			escreva("Aguarde")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			limpa()
			categorias()
		}
		senao se(escolha_menu == "2")
		{
			limpa()
			escreva("Aguarde")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			limpa()
			carrinho()
		}
		senao se(escolha_menu == "3")
		{
			limpa()
			escreva("Aguarde")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			limpa()
			ajuda()
		}
		senao se(escolha_menu == "4")
		{
			limpa()
			escreva("Aguarde")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			limpa()
			escreva("Obrigado por usar a STEAM7, volte sempre!\n")
			u.aguarde(1000)
			limpa()
			logar()
			retorne
		}
		senao se(escolha_menu == "5" e usuario == "Administrador")
		{
			cadeia nome
			escreva("Digite o nome do usuário a ser excluído: ")
			leia(nome)
			deletar_usuario(nome)
			menu()
		}
		senao
		{
			limpa()
			escreva("Opção inválida!Tente novamente...")
			u.aguarde(3000)
			limpa()
			menu()
		}

	}	

	}
    						
		funcao playstation(){
		cadeia nome
		escreva("Voce selecionou a opção de jogos Playstation. Digite o nome do jogo\n")
		leia(nome)
		limpa()
		
		se(nome == "The last of Us" ou nome == "the last of us")
		{
			inteiro som = s.carregar_som("C:\\Serratec\\Github\\Trabalho Final\\the last of us.mp3")
			inteiro musica =  s.reproduzir_som(som, verdadeiro)
			cadeia choiceTLOU
			escreva(nome, "\n")
			escreva("plataforma: Playstation\n")
			escreva("preço: R$: 29,90\n")
			escreva("Deseja adiquirir esse jogo ? \n")
			leia(choiceTLOU)
			se(choiceTLOU == "sim" ou choiceTLOU == "Sim" ou choiceTLOU == "s")
			{
				escreva("item adicionado ao carrinho\n")
				valor += 29.90
				u.aguarde(5000)
				limpa()
				escreva("Voce voltará ao menu principal, caso queira continuar comprando, acesse o menu categorias.")
				u.aguarde(5000)
				limpa()
				menu()
			}
			senao se(choiceTLOU == "não" ou choiceTLOU == "Não" ou choiceTLOU == "n")
			{
				escreva("Voce voltara para a categoria Playstation")
				u.aguarde(3000)
				limpa()
				playstation()
			}
			senao
			{
				escreva("opção inválida. Voce voltara para a categoria Playstation")
				u.aguarde(3000)
				limpa()
				playstation()
			}

		}	
		senao se(nome == "Spider-man: Miles Morales" ou nome == "spider-man: miles morales")
		{
			cadeia choiceSP
			escreva(nome, "\n")
			escreva("plataforma: Playstation\n")
			escreva("preço: R$: 39,90\n")
			escreva("Deseja adiquirir esse jogo ? \n")
			leia(choiceSP)
			se(choiceSP == "sim" ou choiceSP == "Sim" ou choiceSP == "s")
			{
				escreva("item adicionado ao carrinho\n")
				valor += 39.90
				u.aguarde(5000)
				limpa()
				escreva("Voce voltará ao menu principal, caso queira continuar comprando, acesse o menu categorias.")
				u.aguarde(5000)
				limpa()
				menu()
			}
			senao se(choiceSP == "não" ou choiceSP == "Não" ou choiceSP == "n"){
				escreva("Voce voltara para a categoria Playstation")
				u.aguarde(3000)
				limpa()
				playstation()
			}
			senao
			{
				escreva("opção inválida. Voce voltara para a categoria Playstation")
				u.aguarde(3000)
				limpa()
				playstation()
			}
		}					
		senao se(nome == "God of War: Ragnarok" ou nome == "god of war: ragnarok")
		{
			cadeia choiceGOW
			escreva(nome, "\n")
			escreva("plataforma: Playstation\n")
			escreva("preço: R$: 49,90\n")
			escreva("Deseja adiquirir esse jogo ? \n")
			leia(choiceGOW)
			se(choiceGOW == "sim" ou choiceGOW == "Sim" ou choiceGOW == "s")
			{
				escreva("item adicionado ao carrinho\n")
				valor += 49.90
				u.aguarde(5000)
				limpa()
				escreva("Voce voltará ao menu principal, caso queira continuar comprando, acesse o menu categorias.")
				u.aguarde(5000)
				limpa()
				menu()
			}
			senao se(choiceGOW == "não" ou choiceGOW == "Não" ou choiceGOW == "n")
			{
				escreva("Voce voltara para a categoria Playstation")
				u.aguarde(3000)
				limpa()
				playstation()
			}
			senao
			{
				escreva("opção inválida. Voce voltara para a categoria Playstation")
				u.aguarde(3000)
				limpa()
				playstation()
			}
		}
		senao
		{
			escreva("Jogo não encontrado, Tente novamente")
			u.aguarde(3000)
			limpa()
			playstation()
		}
	}
			
	funcao xbox()
	{

		cadeia nome
		escreva("Voce selecionou a opção de jogos Xbox. Digite o nome do jogo\n")
		leia(nome)
		limpa()

		se(nome == "halo" ou nome == "Halo")
		{
			cadeia choiceHalo
			escreva(nome, "\n")
			escreva("plataforma: Xbox\n")
			escreva("preço: R$: 30,00\n")
			escreva("Deseja adiquirir esse jogo ? \n")
			leia(choiceHalo)
			se(choiceHalo == "sim" ou choiceHalo == "Sim" ou choiceHalo == "s")
			{
				escreva("item adicionado ao carrinho\n")
				valor += 30.00
				u.aguarde(5000)
				limpa()
				escreva("Voce voltará ao menu principal, caso queira continuar comprando, acesse o menu categorias.")
				u.aguarde(5000)
				limpa()
				menu()
			}
			senao se(choiceHalo == "não" ou choiceHalo == "Não" ou choiceHalo == "n")
			{
				escreva("Voce voltara para a categoria Xbox")
				u.aguarde(3000)
				limpa()
				xbox()
			}
			senao
			{
				escreva("opção inválida. Voce voltara para a categoria Xbox")
				u.aguarde(3000)
				limpa()
				xbox()
			}
		}
		senao se(nome == "Forza Horizon 5" ou nome == "forza horizon 5")
		{
			cadeia choiceFH
			escreva(nome, "\n")
			escreva("plataforma: Xbox\n")
			escreva("preço: R$: 50,00\n")
			escreva("Deseja adiquirir esse jogo ? \n")
			leia(choiceFH)
			se(choiceFH == "sim" ou choiceFH == "Sim" ou choiceFH == "s")
			{
				escreva("item adicionado ao carrinho\n")
				valor += 50.00
				u.aguarde(5000)
				limpa()
				escreva("Voce voltará ao menu principal, caso queira continuar comprando, acesse o menu categorias.")
				u.aguarde(5000)
				limpa()
				menu()
			}
			senao se(choiceFH == "não" ou choiceFH == "Não" ou choiceFH == "n")
			{
				escreva("Voce voltara para a categoria Xbox")
				u.aguarde(3000)
				limpa()
				xbox()
			}
			senao
			{
				escreva("opção inválida. Voce voltara para a categoria Xbox")
				u.aguarde(3000)
				limpa()
				xbox()
			}
		}
		senao se(nome == "Gears of War" ou nome == "gears of war")
		{
			cadeia choiceGOF
			escreva(nome, "\n")
			escreva("plataforma: Xbox\n")
			escreva("preço: R$: 40,00\n")
			escreva("Deseja adiquirir esse jogo ? \n")
			leia(choiceGOF)
			se(choiceGOF == "sim" ou choiceGOF == "Sim" ou choiceGOF == "s")
			{
				escreva("item adicionado ao carrinho\n")
				valor += 40.00
				u.aguarde(5000)
				limpa()
				escreva("Voce voltará ao menu principal, caso queira continuar comprando, acesse o menu categorias.")
				u.aguarde(5000)
				limpa()
				menu()
			}
			senao se(choiceGOF == "não" ou choiceGOF == "Não" ou choiceGOF == "n")
			{
				escreva("Voce voltara para a categoria Xbox")
				u.aguarde(3000)
				limpa()
				xbox()
			}
			senao
			{
				escreva("opção inválida. Voce voltara para a categoria Xbox")
				u.aguarde(3000)
				limpa()
				xbox()
			}
		}
		senao
		{
			escreva("Jogo não encontrado, Tente novamente")
			u.aguarde(3000)
			limpa()
			xbox()
		}
	}

	funcao nintendo(){
		cadeia nome
		escreva("Voce selecionou a opção de jogos Playstation. Digite o nome do jogo\n")
		leia(nome)
		limpa()

		se(nome == "Pokemon" ou nome == "pokemon")
		{
			cadeia choicePoke
			escreva(nome, "\n")
			escreva("Plataforma: Nintendo\n")
			escreva("Preço: R$: 79,90\n")
			escreva("Deseja adiquirir esse jogo ? \n")
			leia(choicePoke)
			se(choicePoke == "sim" ou choicePoke == "Sim" ou choicePoke == "s")
			{
				escreva("item adicionado ao carrinho\n")
				valor += 79.90
				u.aguarde(5000)
				limpa()
				escreva("Voce voltará ao menu principal, caso queira continuar comprando, acesse o menu categorias.")
				u.aguarde(5000)
				limpa()
				menu()
			}
			senao se(choicePoke == "não" ou choicePoke == "Não" ou choicePoke == "n")
			{
				escreva("Voce voltara para a categoria Nintendo")
				u.aguarde(3000)
				limpa()
				nintendo()
			}
			senao
			{
				escreva("opção inválida. Voce voltara para a categoria Nintendo")
				u.aguarde(3000)
				limpa()
				nintendo()
			}
		}
		senao se(nome == "Zelda" ou nome == "zelda")
		{
			cadeia choiceZe
			escreva(nome, "\n")
			escreva("Plataforma: Nintendo\n")
			escreva("Preço: R$: 69,90\n")
			escreva("Deseja adiquirir esse jogo ? \n")
			leia(choiceZe)
			se(choiceZe == "sim" ou choiceZe == "Sim" ou choiceZe == "s")
			{
				escreva("item adicionado ao carrinho\n")
				valor += 79.90
				u.aguarde(5000)
				limpa()
				escreva("Voce voltará ao menu principal, caso queira continuar comprando, acesse o menu categorias.")
				u.aguarde(5000)
				limpa()
				menu()
			}
			senao se(choiceZe == "não" ou choiceZe == "Não" ou choiceZe == "n")
			{
				escreva("Voce voltara para a categoria Nintendo")
				u.aguarde(3000)
				limpa()
				nintendo()
			}
			senao
			{
				escreva("opção inválida. Voce voltara para a categoria Nintendo")
				u.aguarde(3000)
				limpa()
				nintendo()
			}
		}
		senao se(nome == "Mario kart" ou nome == "mario kart")
		{
			cadeia choiceMK
			escreva(nome, "\n")
			escreva("Plataforma:Nintendo\n")
			escreva("Preço: R$: 59,90\n")
			escreva("Deseja adiquirir esse jogo ? \n")
			leia(choiceMK)
			se(choiceMK == "sim" ou choiceMK == "Sim" ou choiceMK == "s")
			{
				escreva("item adicionado ao carrinho\n")
				valor += 59.90
				u.aguarde(5000)
				limpa()
				escreva("Voce voltará ao menu principal, caso queira continuar comprando, acesse o menu categorias.")
				u.aguarde(5000)
				limpa()
				menu()
			}
			senao se(choiceMK == "não" ou choiceMK == "Não" ou choiceMK == "n")
			{
				escreva("Voce voltara para a categoria Nintendo")
				u.aguarde(3000)
				limpa()
				nintendo()
			}
			senao
			{
				escreva("opção inválida. Voce voltara para a categoria Nintendo")
				u.aguarde(3000)
				limpa()
				nintendo()
			}
		}
		senao
		{
			escreva("Jogo não encontrado, Tente novamente")
			u.aguarde(3000)
			limpa()
			nintendo()
		}
	}

	funcao carrinho()
	{	
		cadeia escolha_carrinho 
		escreva("********************************************\n")
		escreva("***************   CARRINHO   ***************\n")
		escreva("********************************************\n")
		escreva("============================================\n")
		escreva("|(1)Finalizar compra|(2)Cancelar|(3)Sair|\n")
		escreva("Olá, ",usuario,"!")
		escreva("\n")
		escreva("Valor do carrinho: ",valor," moedas Shopee\n")
		escreva("Escolha uma das opções: ")
		leia(escolha_carrinho)
		limpa()
		se(escolha_carrinho == "1")
		{
			escreva("Compra finalizada com sucesso!!\n")
			escreva("Volte sempre :)")
			u.aguarde(2000)
			limpa()
			escreva("Saindo")
			u.aguarde(200)
			escreva(".")
			u.aguarde(200)
			escreva(".")
			u.aguarde(200)
			escreva(".")
			u.aguarde(200)
			limpa()
			valor = 0.0
			menu()
		}
		senao se(escolha_carrinho == "2")
		{
			escreva("Você cancelou sua compra...\n")
			u.aguarde(300)
			escreva("Seu carrinho foi zerado.\n")
			u.aguarde(300)
			limpa()
			valor = 0.0
			menu()
		}
		senao se(escolha_carrinho == "3")
		{
			menu()			
		}
		senao
		{
			escreva("Opção inválida, tente novamente.")
			u.aguarde(1000)
			limpa()
			carrinho()
		}				
	}
	funcao categorias()
	{
		cadeia escolha_categorias
		escreva("********************************************\n")
		escreva("**************   CATEGORIAS   **************\n")
		escreva("********************************************\n")
		escreva("============================================\n")
		escreva("|(1)PlayStation|(2)Xbox|(3)Nintendo|(4)Sair|\n")
		escreva("\n")
		escreva("Escolha uma categoria de jogos: ")
		leia(escolha_categorias)
		se(escolha_categorias == "1")
		{
			limpa()
			escreva("Aguarde")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			limpa()
			playstation()
		}
		senao se(escolha_categorias == "2")
		{
			
			limpa()
			escreva("Aguarde")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			limpa()
			xbox()
		}
		senao se(escolha_categorias == "3")
		{
			
			limpa()
			escreva("Aguarde")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			limpa()
			nintendo()
		}
		se(escolha_categorias == "4")
		{						
			limpa()
			escreva("Aguarde")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			limpa()
			menu()
		}
		senao
		{
			limpa()
			escreva("Opção inválida!Tente novamente...")
			u.aguarde(3000)
			limpa()
			categorias()
		}
	}
	funcao ajuda()
	{
		escreva("********************************************\n")
		escreva("*****************   AJUDA   ****************\n")
		escreva("********************************************\n")
		escreva("============================================\n")				
	}	
	funcao logo()
	{
		escreva("Aqui entra a logo\n")
		u.aguarde(3000)
		limpa()		
	}	
	funcao logar()
	{
				
		
		logico login

		 escreva("Usuário: \n")
        	 leia(usuario)
           limpa()
           escreva("Senha: \n")
           leia(senha)
           limpa()

           
           
           login = falso
		
	      para(inteiro i = 0; i <= 5; i++)
		 {
		 	se(usuario == usuarios[i][0] e senha == usuarios[i][1])
		 	{
		 		login = verdadeiro	
		 	}	
		 }
		 se(login)
		 {
			escreva("Login feito com sucesso!\n")
			u.aguarde(1500)
			limpa()
			menu()
			retorne 							
		 }
		 senao
		 {
			enquanto(logout < 2)
			{
				logout += 1
				limpa()
				escreva("Usuário ou senha incorretos! Tente novamente.")
				u.aguarde(2000)
				limpa()
				logar()
			}
						
		 }
		 escreva("Você falhou muitas vezes no login e será desconectado!")
		 u.aguarde(2000)
		 limpa()
	}
	funcao iniciar()
	{		
		cadeia entrar
		limpa()
		escreva("Deseja entrar na loja? \n")
		escreva("|(1)Sim|(2)Sair|\n")
		leia(entrar)
		se(entrar == "1")
		{
			
			
			limpa()
			escreva("Aguarde")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			escreva(".")
			u.aguarde(300)
			limpa()
			logar()
		}
		senao se(entrar == "2")
		{
			limpa()
			escreva("Q")
			u.aguarde(200)
			escreva("u")
			u.aguarde(200)
			escreva("e")
			u.aguarde(200)
			escreva(" ")
			u.aguarde(200)
			escreva("p")
			u.aguarde(200)
			escreva("e")
			u.aguarde(200)
			escreva("n")
			u.aguarde(200)
			escreva("a")
			u.aguarde(200)
			escreva(".")
			u.aguarde(200)
			escreva(".")
			u.aguarde(200)
			escreva(".")
			u.aguarde(200)
		}
		senao
		{
			escreva("Opção Inválida!")
			iniciar()
		}						
	}	
	funcao deletar_usuario(cadeia nome)
	{
		para(inteiro i = 0; i <= 5; i++)
		{
		 	se(nome == usuarios[i][0])
		 	{
		 		usuarios[i][0] = " "
		 		usuarios[i][1] = " "		 				 			
		 	}	
		}
		escreva("O usuário ",nome," foi deletado!\n")
		u.aguarde(2000)
		limpa()
	}}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */