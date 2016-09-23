//Exemplo de Code Smell: Argumentos de Funções

var Numeral = function (valorInicial) {
	this.valor = valorInicial;
	this.adiciona = function (anterior, adicionado) {
		return this.valor + anterior + adicionado;
	};
	this.calculaGravidade = function (raioDoSol, raioDaTerra, massaDoSol, massaDaTerra) {
		var constante = (6,67428e-11)
		var resultado = constante * ((massaDoSol + massaDaTerra) / raioDoSol ^ 2);
		this.valor = resultado;
	};
};


var um = new Numeral(1);
// Você espera que essa função adicione no elemento atual, mas retorna em
// um novo elemento.
um.adiciona(1, 2);
// Ainda é 1, mas esperava o que adicionasse todos os argumentos
console.log(um.valor);
um.calculaGravidade(20, 50, 40e+11, 10e+11);
console.log(um.valor);
