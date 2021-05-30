
var sidebar = document.getElementById("mySidebar"),
    main = document.getElementById("main"),
    bo = document.getElementById("cont");

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