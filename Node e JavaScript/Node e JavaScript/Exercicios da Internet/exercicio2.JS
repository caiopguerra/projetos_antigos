const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  rl.question('Digite um numero ', (numero) => {
 var operacao = (numero) * (numero) * (numero);
console.log("O numero digitado foi " + (numero) + ". E ele ao cubo tem o valor igual a " + operacao)});