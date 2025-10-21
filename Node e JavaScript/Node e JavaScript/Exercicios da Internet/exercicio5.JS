const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  rl.question("Digite um numero ", (numero) => {
    var numeroInvertido = numero.split('').reverse().join('');
    console.log(numeroInvertido);
  })