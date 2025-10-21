const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  rl.question ('Digite a Temperatura em Fahrenheit', (fahrenheit) => {
    var celsius = (fahrenheit) - 32 * 0.5556;
    console.log(fahrenheit + " Em graus Celsius equivale a " + celsius + " graus celsius")
  })