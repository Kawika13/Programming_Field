/* Navigation Bar*/
function nav_bar(){
    document.write(`

    <div class="head">
        <a href="index.html?mn=home"><img src="../Immagini/logo.png" class="logo"/></a>
        <ul class="nav_bar">
            <li id="index"><a href="index.html?mn=home">Home</a></li>
            <li id="ist"><a href="istituto.html?mn=ist">Isitituto</a></li>
            <li id="did"><a href="didattica.html?mn=did">Didattica</a></li>
            <li id="mod"><a href="modulistica.html?mn=mod">Modulistica</a></li>
            <li id="news"><a href="news.html?mn=news">News</a></li>
        </ul>
    </div>
    
    `);
}

nav_bar();


/* Declaring Variables */
var path = window.location.pathname,
    page = path.split("/").pop(),
    index = document.getElementById("index"),
    ist = document.getElementById("ist"),
    did = document.getElementById("did"),
    mod = document.getElementById("mod"),
    news = document.getElementById("news");


/* "active" class assigment */
if (page == "index.html")
    {
    index.className = "active";
    }
else if (page == "istituto.html")
    {
    ist.className = "active";
    }
else if (page == "didattica.html")
    {
    did.className = "active";
    }
else if (page == "modulistica.html")
    {
    mod.className = "active";
    }
else if (page == "news.html")
    {
    news.className = "active";
    }
else
    {
    alert("Something probably is going wrong, please reset the page");
    }