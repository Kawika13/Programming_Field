var path = window.location.pathname;
var page = path.split("/").pop();
console.log( page );

function nav_bar(){
    document.write(`

    <div class="head">
        <img src="../Immagini/logo.png" class="logo"/>
        <ul class="nav_bar">
            <li><a href="index.html?mn=home">Home</a></li>
            <li><a href="istituto.html?mn=ist">Isitituto</a></li>
            <li><a href="didattica.html?mn=did">Didattica</a></li>
            <li><a href="modulistica.html?mn=mod">Modulistica</a></li>
            <li><a href="news.html?mn=news">News</a></li>
        </ul>
    </div>
    
    `);
}