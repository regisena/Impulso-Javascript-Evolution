// tipos primitivos
console.log('=============');
//boolean
var vOuF = false;
console.log("Valor: "+vOuF);
console.log("Tipo: "+typeof(vOuF));
console.log('=============');

//number
var numeroQualquer = 1;
console.log("Valor: "+numeroQualquer);
console.log("Tipo: "+typeof(numeroQualquer));
console.log('=============');

//string
var nome = 'Reginaldo';
console.log("Valor: "+nome);
console.log("Tipo: "+typeof(nome));
console.log('=============');

// function
var funcao = function(){}
console.log("Tipo: "+typeof(funcao));
console.log('=============');

// var
// nada declarado
console.log('====== var =======');
console.log(variavel); // undefined ou null
// variavel declarada mas não inicializada
var variavel;
console.log(variavel);// undefined ou null
// variavel declarada e inicializada
var variavel = 'Reginaldo';
console.log(variavel);// Reginaldo
// variavel alterada
var variavel = 'Antonella';
console.log(variavel);// Antonella
console.log('=============');
console.log('====== let =======');
let variavel2;
console.log(variavel2);
variavel2 = "Melissa";
console.log(variavel2);
console.log('====== const =======');
const VARIAVEL = 'Nome constante';
console.log(VARIAVEL);

// escopo global
var escopoGlobal = 'global';
console.log("escopo: "+escopoGlobal);

function escopoLocal(){
    let escopoLocalInterno = 'local';
    console.log("escopo: "+escopoLocalInterno);
}
escopoLocal();

// atribuição
var atribuição = 'Regi';

// comparação
var comparacao = '0' == 0;
console.log(comparacao);

var comparacaoIdentica = '0' === 0;
console.log(comparacaoIdentica);