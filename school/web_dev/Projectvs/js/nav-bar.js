/* Navigation Bar*/
function nav_bar(){
    document.write(`

    <div class="head">
        <a href="index.html?mn=home"><img src="../Immagini/logo.png" class="logo"/></a>
        <ul class="nav_bar">
            <li id="index"><a href="index.html?mn=home">Home</a></li>
            <li id="ist"><a href="#">Isitituto &darr;</a>
                <ul class="dropdown">
                    <li><a href="https://www.isitgrosseto.com/?mn=ist" target="_blank">Presentazione</a></li>
                    <li><a href="https://www.polomanettiporciatti.edu.it/pagine/regolamento-di-istituto-as-20202021?mn=ist" target="_blank">Regolamento</a></li>
                </ul>
            </li>
            <li id="did"><a href="#">Didattica &darr;</a>
                <ul class="dropdown">
                    <li><a href="https://www.polomanettiporciatti.edu.it/pagine/orario-delle-lezioni---as-202021#?mn=did" target="_blank">Orari Lezione</a></li>
                    <li><a href="https://www.polomanettiporciatti.edu.it/pagine/siti-utili?mn=did" target="_blank">Siti Utili</a></li>
                </ul>
            </li>
            <li id="mod"><a href="#">Modulistica &darr;</a>
                <ul class="dropdown">
                    <li><a href="https://www.polomanettiporciatti.edu.it/pagine/libri-di-testo-as-202021?mn=mod" target="_blank">Libri di testo</a></li>
                    <li><a href="https://www.polomanettiporciatti.edu.it/pagine/uscita-autonoma-del-minore-da-scuola?mn=mod" target="_blank">Uscita Autonoma</a></li>
                    <li><a href="https://www.polomanettiporciatti.edu.it/pagine/versamenti-tasse-e-contributi?mn=mod" target="_blank">Versamenti</a></li>
                </ul>
            </li>
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