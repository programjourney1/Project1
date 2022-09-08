console.log("happy");
let button = document.getElementById('loadButton');
let content = document.getElementById('container');
button.onclick = loadSpan;

function loadSpan(){
content.innerText = "empty placeholder"
let response = All();
console.log(response);
content.innerText = response;
return response;
}

async function All(){
    let webResponse = await fetch ("https://pokeapi.co/api/v2/pokemon/ditto")
    .then((response) => response.json())
    console.log(webResponse);
    return webResponse;
}

/*
function All(){
    let webResponse = fetch("https://pokeapi.co/api/v2/pokemon/ditto").then(response => response)
} */