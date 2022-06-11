//var x = 0; comentário de linha

/* Comentário de múltiplas linhas
var y = 1;

var z =  2; fim do comentário de múltiplas linhas*/

var preco = 2;

var desconto = 0.2;

preco = preco - desconto;

const PRECO = 2;

var total = PRECO - desconto;


//declarando função
function soma(a, b){
    return a + b;
}

console.log(soma( 3, 5)+" Retorno da função soma"); // chamando a função cujo resultado será de: 8

console.log('Hello world!');

function returnEvenValues(array){
    evenNums = [];
    for(let i = 0; i < array.length; i++){
        if(array[i] % 2 === 0){
            evenNums.push(array[i]);
        }else{
            console.log(`${array[i]}, não é par!`);
        }
    }
    console.log('Os números pares são: '+evenNums);
}

let array = [1,2,3,4,5,6,7,8];
returnEvenValues(array);