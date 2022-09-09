console.log(document);
let button = document.getElementById('loadButton');
let buttonf = document.getElementById('loadButtonf');
let buttonN = document.getElementById('loadButtonN');
let buttonB = document.getElementById('loadButtonB');
let content = document.getElementById('container');
//let loadButton = document.getElementById("loadButton");
//let button.onclick = loadSpan;
button.onclick = loadPoison;
buttonf.onclick = loadFly;
buttonN.onclick = loadNorm;
buttonB.onclick = loadBug;
//loadButton.addEventListener("click", loadPoison);

function loadSpan(response){
//content.innerText = "Poison Pokemon"
for(let i = 0; i < response.length; i++){
    let paintingTitle = document.createElement("p");
    paintingTitle.innerText = response[i].Species +" -"+ response[i].Description;
    content.appendChild(paintingTitle);
}}
function loadPoison(){
    let request = new XMLHttpRequest();
    request.open("GET", "http://localhost:9004/Pokemon/Poison");
    request.send();

    request.onreadystatechange = load;

    function load(){
        if(request.readyState == 4 && request.status == 200){
            let responsejson = JSON.parse(request.response);
            console.log(responsejson);
            loadSpan(responsejson);
        }
    }
}
//////////////////////////////
function loadSpanF(response){
    content.innerText = "Flying Pokemon"
    for(let i = 0; i < response.length; i++){
        let paintingTitle = document.createElement("p");
        paintingTitle.innerText = response[i].Species +" -"+ response[i].Description;
        content.appendChild(paintingTitle);
    }}
    function loadFly(){
        let request = new XMLHttpRequest();
        request.open("GET", "http://localhost:9004/Pokemon/Flying");
        request.send();
    
        request.onreadystatechange = load;
    
        function load(){
            if(request.readyState == 4 && request.status == 200){
                let responsejson = JSON.parse(request.response);
                console.log(responsejson);
                loadSpan(responsejson);
            }
        }
    }
////////////////
function loadSpanN(response){
    content.innerText = "Normal Pokemon"
    for(let i = 0; i < response.length; i++){
        let paintingTitle = document.createElement("p");
        paintingTitle.innerText = response[i].Species +" -"+ response[i].Description;
        content.appendChild(paintingTitle);
    }}
    function loadNorm(){
        let request = new XMLHttpRequest();
        request.open("GET", "http://localhost:9004/Pokemon/Normal");
        request.send();
    
        request.onreadystatechange = load;
    
        function load(){
            if(request.readyState == 4 && request.status == 200){
                let responsejson = JSON.parse(request.response);
                console.log(responsejson);
                loadSpan(responsejson);
            }
        }
    }
    /////////////////////
    function loadSpanB(response){
        content.innerText = "Bug Pokemon"
        for(let i = 0; i < response.length; i++){
            let paintingTitle = document.createElement("p");
            paintingTitle.innerText = response[i].Species +" -"+ response[i].Description;
            content.appendChild(paintingTitle);
        }}
        function loadBug(){
            let request = new XMLHttpRequest();
            request.open("GET", "http://localhost:9004/Pokemon/Bug");
            request.send();
        
            request.onreadystatechange = load;
        
            function load(){
                if(request.readyState == 4 && request.status == 200){
                    let responsejson = JSON.parse(request.response);
                    console.log(responsejson);
                    loadSpan(responsejson);
                }
            }
        }






















//let response = Poison();
//console.log(response);
//content.innerText = response;
//return response;

/////
/*
async function Poison(){
    console.log("button clicked");
    let response = await fetch("http://localhost:9004/Pokemon");
  //  response =  await response.json();
    loadingPoison(response);
    console.log(response);
}
///////////////
async function postPoison(){
    let inputPoison = {
        Species:titleInput.value,
        Description:idInput.value
    }
    let response = await fetch("http://localhost:9004/pokemon/Poison", {
        method:'POST',
        mode:'cors',
        headers: {
            'Content-Type': 'application/json'
            // 'Content-Type': 'application/x-www-form-urlencoded',
          },
        body:JSON.stringify(inputPoison)
    });
    postPoison();
}
/////////////
async function loadingPoison(response){
    content.innerHTML = "";
    console.log(response)
    let poisonList = document.createElement("ul");
    for(let i = 0; i < response.length; i++){
        let artist = await Poison(response[i]);
        console.log(artist);
} content.appendChild(poisonList);}
////////////

  /*  
    
        let artist = await Poison(response[i].artistID);
        console.log(artist);
        console.log(artist.id);
        console.log(artist.name);
        // ul is unordered list (bullet points)
        // li is a list element
        let paintingCard = document.createElement("li");
        let paintingTitle = document.createElement("a");
        paintingTitle.href = "file:///C:/Users/TedBa/Documents/Revature/js2/painting.html"+"#painting="+response[i].title;
        paintingTitle.innerText = response[i].title;
        let artistName = document.createElement("p");
        artistName.innerText = artist.name;
        paintingCard.appendChild(paintingTitle);
        paintingCard.appendChild(artistName);
        paintingList.appendChild(paintingCard);
    }
   
*/
function loadPoison(){
    let request = new XMLHttpRequest();
    request.open("GET", "http://localhost:9004/Pokemon/Poison");
    request.send();

    request.onreadystatechange = load;

    function load(){
        if(request.readyState == 4 && request.status == 200){
            let responsejson = JSON.parse(request.response);
            console.log(responsejson);
            loadSpan(responsejson);
        }
    }
}
/*
//////////
async function Poison(){
    let webResponse = await fetch ("https://localhost:9004/Poison")
    .then((response) => response.json())
    console.log(webResponse);
    return webResponse;
}
//////
function All(){
    let webResponse = fetch("http://localhost9004").then(response => response)
} */