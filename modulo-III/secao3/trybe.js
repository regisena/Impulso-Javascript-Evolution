/*
 * Complete a função 'tripleTheChances' abaixo.
 *
 * O retorno da função é uma variável do tipo INTEGER_ARRAY.
 * A função aceita o parâmetro chances do tipo INTEGER_ARRAY.
 * 
 * chance[2,3,5];
 * 2, será multiplicado por 3, resultando em: 6
 * 3, será multiplicado por 3, resultando em: 9
 * 5, será multiplicado por 3, resultando em: 15
 * array[6,9,15];
 */

/*
 * Complete a função 'vezesLetraAparece' abaixo.
 *
 * É esperado que a função retorne um número inteiro.
 * A função aceita os seguintes parâmetros:
 *  1. frase (string)
 *  2. letra (string)
 */


//console.log("Reginaldo");

/*var chances = [2,3,5]; //,3,5,8,10];*/
/*function tripleTheChances(chances){
   for(var i = 0; i < chances.length; i++) {
      chances[i] = 3 * chances[i];
   }
   return chances;
}*/

//console.log(tripleTheChances(c = [2,3,5,8,10]));


/*============================================================================ */

/*VI*/

/*1 - Quem calça mais? // sem funcao

Valores de entrada: 35 37
Resultado: 'Luisa calça mais'

Neste exemplo, o tamanho do sapato de Isabela é 35, o tamanho do sapato de Luisa é 37. Logo, Luisa possui um tamanho maior de sapato, então deve ser retornado 'Luisa calça mais'

* Receber 2 parametros: sendo dois números inteiros, representando o tamanho do sapato de Isabela e Luisa, respectivamente;
* Retornar uma string dependendo da comparação dos tamanhos:
   * Se o sapato de Isabela for maior, então retorna 'Isabela calça mais';
   * Se o sapato de Luisa for maior, então retorna 'Luisa calça mais';
   * Se os tamanhos forem iguais, então retorna 'Isabela e Luisa calçam o mesmo tamanho de sapato';

function comparaTamanhoSapatos(tI,tL){
    
    var resultado = '';

    if(tI > tL) {
        resultado =  'Isabela calça mais';
    }else if(tI < tL){
        resultado = 'Luisa calça mais';
    }else{
        resultado = 'Isabela e Luisa calçam o mesmo tamanho de sapato';
    }
    
    return resultado;
}

console.log(comparaTamanhoSapatos(36,37));
*/



/*2 - Array composto por múltiplos de três //sem funcao
Neste desafio, vc deve implementar a funçao multiplosPorTres, que deve verificar quais numeros são multiplos de 3.
* 6 é multiplo de 3, pois o resultado da multiplicacao de 3 x 2;
* 9 é multiplo de 3, pois e o resultado da multiplicacao de 3 x 3;
* 11 não e multiplo de 3.
Caso um numero nao seja multiplo de 3, ele deve ser multiplicado por 3. Por exemplo:
11 não é multiplo de 3, portanto, ele deve ser multiplicado por 3: 3 x 11 = 33.

Sua funcao deve:
* Receber 1 parametro: sendo um array composto por números;
* Retornar um novo array em que é composto por apenas múltiplo de 3, em que:
   * Se o numero que está sendo checado é multiplo de 3, adiciona no array;
   * Se o numero que está sendo checado não for multiplo de 3, vc deve multiplicar este numero por 3 e adiciona-lo no array.
A primeira linha deve conter um array contendo os numeros a serem testados

Exemplo:
Valores de cada parametro
6 // Número de itens do array
1 2 3 9 15 16

Resultado
3 6 3 9 15 48

function multiplosPorTres(valores){
   var arrayRetorno = [];   
   for(var index = 0; index < valores.length; index++){
      if((valores[index] % 3) == 0){
         arrayRetorno.push(valores[index]);
      }else{
         arrayRetorno.push(valores[index] * 3);
      }
   }
   
   return arrayRetorno;
}

console.log(multiplosPorTres([1,2,3,9,15,16]));
*/


/**3 - É volgal ou consoante? function vezesLetraAparece(frase, letra)
 * recebe 2 parametros: frase,q ue deve ser uma string e letra outra string;
 * retorna a frase: letra é  uma consoante e aparece n vezes na frase. onde letra é a letra passada por parametro e é numero de vezes que essa letra aparece na frase. Por exemplo, o é uma vogal e aparece 2 vezes na frase.
 * 
 * A primeira linha deve conter uma string, que será o valor de frase.
 * A segunda linha deve conter uma string, que será o valor de letra.
 * 
 * E#xemplo:
 * Frase: The Lord of The Rings
 * letra: o
 * 
 * Resultado
 * o é uma vogal e aparece 2 vezes na frase

 
 */
 function vezesLetraAparece(frase, letra) {
     
     var contador = 0;
     var resultado = '';
   
     for (var indice  = 0; indice  < frase.length; indice++) {
       if(frase[indice] === letra){
         contador++;
       }
       if((letra == 'a')||(letra == 'e')||(letra == 'i')||(letra == 'o')||(letra == 'u')){
         resultado = 'vogal';
       }else{
         resultado = 'consoante';
       }
     }
     return letra+' é uma '+resultado+' e aparece '+contador+' vezes na frase';
   }
   
   //console.log(vezesLetraAparece('The Lord of The Rings', 'o')); // 3
   console.log(vezesLetraAparece('The greatest glory in living lies not in falling, but in rising every time we fall', 'l')); // 3



