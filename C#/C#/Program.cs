// Screen Sound (projeto alura)
string mensagem = "Boas vindas ao Screen Sound";

List<String> bandas = new List<string>();

Console.WriteLine(@"

█▀ █▀▀ █▀█ █▀▀ █▀▀ █▄░█   █▀ █▀█ █░█ █▄░█ █▀▄
▄█ █▄▄ █▀▄ ██▄ ██▄ █░▀█   ▄█ █▄█ █▄█ █░▀█ █▄▀

");

void ExibeMensagem()
{
Console.WriteLine(mensagem);
}

void RegistrarBanda(){
    Console.Clear();
    Console.WriteLine("Registro de Bandas");
    Console.Write("Digite o nome da banda a ser registrada: ");
    string NomeBanda = Console.ReadLine()!;
    bandas.Add(NomeBanda);
    Console.Clear();
    Console.WriteLine($"A banda {NomeBanda} foi registrada com sucesso");
    Thread.Sleep(2000);
    Console.Clear();
    Menu();
}

void MostrarBandas()
{
    Console.Clear();
    Console.WriteLine("Lista de Bandas");
    //for (int i = 0; i < bandas.Count; i++){
       // Console.WriteLine($"Banda: {bandas[i]}");
    //}

    foreach(string banda in bandas){
        Console.WriteLine($"Banda: {banda}");
    }

    Console.WriteLine("Digite qualquer tecla para voltar ao menu principal");
    Console.ReadKey();
    Console.Clear();
    Menu();
}

void Menu()
{
    Console.WriteLine("\nDigite 1 para registrar banda");
    Console.WriteLine("Digite 2 para exibir todas as bandas");
    Console.WriteLine("Digite 3 para avaliar bandas");
    Console.WriteLine("Digite 4 para sair");
    Console.Write("\nDigite sua opção: ");
    string opcao = Console.ReadLine()!;
    int numero = int.Parse(opcao);

    switch(numero) 
    {
        case 1: RegistrarBanda();
            break;
        case 2: MostrarBandas();
            break;
        case 3: Console.WriteLine("voce escolheu a opção " + opcao);
            break;
        case 4: Console.WriteLine("adeus");
            break;
        default: Console.WriteLine("opção inválida");
            break;
    }
}


ExibeMensagem();
Menu();