function side_menu(){
    document.write(`

    <div id="mySidebar" class="sidebar">
        <h1>Assistente<br>ADA Compliance</h1>
        <div class="text">
            <p>Premendo il tasto sottostante tutto il contenuto della pagina invertirà la sua colorazione, così da aumentarne il contrasto.</p>
            <button onclick="change_colors()"> Press Me </button>
        </div>
    </div>
    <div onclick="closeSidebar()">
        <button class="btn" onclick="openSidebar()">
            <img  id="main" class="hamburger" src="../Immagini/Hamburger_icon.svg.png">
        </button>
    </div>

    `);
}

side_menu()


/* Declaring Variables */
var sidebar = document.getElementById("mySidebar"),
    main = document.getElementById("main"),
    bo = document.getElementById("cont"),
    site = document.getElementById("Site");

/* WORKING PROGRESS */
/*
function doWhichKey(e) { 
    e = e || window.event; 
    let charCode = e.keyCode || e.which; 
    return String.fromCharCode(charCode); 
} 
*/

/* sets the sidebar width on 150px an shift the icon by 150px */
function openSidebar(){
    sidebar.style.width = "500px";
    main.style.marginLeft = "500px";
    bo.style.opacity = "0.2"
}

/* sets the sidebar width on 0px an shift the icon as long as it return to his start position */
function closeSidebar(){
    if(sidebar.offsetWidth == 500){
        sidebar.style.width = "0";
        main.style.marginLeft = "0";
        bo.style.opacity = "1"
    }
}

/* color inverter function */
function change_colors(){
    if (site.style.filter == "invert(100%)"){
        site.style.filter = "";
    }else{
        site.style.filter = "invert(100%)";
    }
}


/* WORKING PROGRESS */
/*
window.addEventListener('keypress', function (e) {
    if (doWhichKey(e) == "a");
        openSidebar();
        if (sidebar.offsetWidth == 500){
            closeSidebar()
        }
}, false);
*/