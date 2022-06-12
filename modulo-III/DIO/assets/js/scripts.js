var currenteNumberWrapper = document.getElementById('currentNumber');
var currenteNumber = 0;

function increment(){
    currenteNumber = currenteNumber + 1;
    currenteNumberWrapper.innerHTML = currenteNumber;
}

function decrement(){
    currenteNumber = currenteNumber - 1;
    currenteNumberWrapper.innerHTML = currenteNumber;
}