function side_menu(){
    document.write(`

    <div id="mySidebar" class="sidebar">
        <h1>Assistente<br>ADA Compliance</h1>
        <div class="text">
            <h3>Colorazione</h3>
            <p>Premendo il tasto sottostante tutto il contenuto della pagina invertirà la sua colorazione, così da aumentarne il contrasto.</p>
            <button id="inverter" tabindex="1" onclick="change_colors()"> Press Me </button>
            <br><br>
            <h3>Navigazione Intelligente</h3>
            <p>Le frecce "&rarr;" e "&larr;" della tastiera permetteranno rispettivamente di aprire e chiudere la barra laterale qui presente.</p>
            <p>Premendo il tasto Tab sarà possibile navigare tra i vari link della pagina.</p>
        </div>
    </div>
    <div >
        <button class="btn" onclick="bar_int()">
            <div id="main" class="container">
                <div class="bar1"></div>
                <div class="bar2"></div>
                <div class="bar3"></div>
            </div>
        </button>
    </div>

    `);
}

side_menu()


/* Declaring Variables */
var sidebar = document.getElementById("mySidebar"),
    main = document.getElementById("main"),
    bo = document.getElementById("cont"),
    site = document.getElementById("Site"),
    inv = document.getElementById("inverter"),
    img = document.getElementsByClassName("img");


console.log(img)

/* icon transformation */
function myFunction(x) {
    x.classList.toggle("change");
}

/* sets the sidebar width on 150px an shift the icon by 150px */
function openSidebar(){
    if(sidebar.offsetWidth == 0){
        sidebar.style.width = "500px";
        main.style.marginLeft = "500px";
        bo.style.opacity = "0.2"
        myFunction(main);
    }
}

/* sets the sidebar width on 0px an shift the icon as long as it return to his start position */
function closeSidebar(){
    if(sidebar.offsetWidth == 500){
        sidebar.style.width = "0";
        main.style.marginLeft = "0";
        bo.style.opacity = "1"
        myFunction(main);
    }
}

/* onclick bug resolver for the toggle */
function bar_int(){
    if(sidebar.offsetWidth == 500)
        closeSidebar();
    else
        openSidebar();
}

/* color inverter function */
function change_colors(){
    /* if the screen is inverted */
    if (site.style.filter == "invert(1)"){
        site.style.filter = "";

        /* normal invert for the images */
        for (var i = 0; i < img.length; i++)
            img[i].style.filter = "invert(0)";

        /* normal transition for the images */
        for (var i = 0; i < img.length; i++)
            img[i].style.transition = "all .5s";
    
    /* if the screen isn't inverted */
    }else{
        site.style.filter = "invert(1)";

        /* counter invert for the images */
        for (var i = 0; i < img.length; i++)
            img[i].style.filter = "invert(1)";
    
        /* clear the transition for the invert action */
        for (var i = 0; i < img.length; i++)
            img[i].style.transition = "all 0s";
    }
    /* reset the transition */
    setTimeout(function(){
        for (var i = 0; i < img.length; i++)
            img[i].style.transition = "all .5s";
    }, 1);
}

/* keyboard features */
document.addEventListener("keyup", function(event){
    /* Arrows interaction */
    if(event.key == "ArrowRight")
        openSidebar();
    else if(event.key == "ArrowLeft")
        closeSidebar();

    /* Tab event */
    else if(event.key == "Tab"){
        if(inv === document.activeElement)
            openSidebar();
        else
            closeSidebar();
    }
});