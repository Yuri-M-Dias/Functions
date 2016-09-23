//Exemplo de boa prática: Menor quantidade de argumentos possíveis.

var Numeral = function (valorInicial) {
	this.valor = valorInicial;
	this.adicionaUm = function () {
		this.valor++;
	};
	this.adiciona = function (numero) {
		this.valor += numero;
	};
};


var um = new Numeral(1);
um.adicionaUm();
console.log(um.valor);
um.adiciona(2);
console.log(um.valor);
