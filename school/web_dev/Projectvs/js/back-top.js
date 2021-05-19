/* Declaring variables */
var btt = document.getElementById("backtop"),   // id backtop
    body = document.body,                       // body elem
    docElem = document.documentElement,         // all the elements (or all the document)
    offset = 200,                               // base position
    scrollPos, docHeight;                       // define scrollPos e docHeight (actual position and the max document height)

    
/* Scorlling function (used for the smooth effect) */
function scrolling(){
    window.scrollTo({
       top:0,
       left:0,
       behavior:"smooth"
    });
}

/* set the height of the document */
docHeight = Math.max(body.scrollHeight, body.offsetHeight, docElem.offsetHeight, docElem.scrollHeight, docElem.clientHeight);   //find the max from these elements


/* set the appropriate offset's value */
if (docHeight != undefined) //if docHeight isn't undefined, the offset is equal to it divided for 4
    {
    offset = docHeight / 4;
    }

console.log(offset);
console.log(docHeight);
/* event listener for the scroll position */
window.addEventListener("scroll", 
    function(event){
        scrollPos = body.scrollTop || docElem.scrollTop;
        btt.className = (scrollPos > offset) ? "visible" : "";  //if the scroll position is higher than the offset (base position), then the "backtop"'s class is "visible", otherwise not
    }
);