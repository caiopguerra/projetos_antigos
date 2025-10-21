const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  rl.question ('digite a base do triangulo ', (base) => {
    rl.question('digite a altura do triangulo ', (altura) => {
      var area = base * altura;
      console.log(area)
    })
  })