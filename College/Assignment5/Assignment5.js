
// Create the canvas
var canvas = document.createElement("canvas");
var ctx = canvas.getContext('2d');
var timer = 0;
var speed = 4;
var caught = false;

document.body.appendChild(canvas);
canvas.width = 700;
canvas.height = 550;

// Render
var render = function () {

    ctx.clearRect(0,0,ctx.canvas.width,ctx.canvas.height);
 
     if (bgReady) {
         ctx.drawImage(bgImage, 0, 100);
     }
     if (bugReady) {
         ctx.drawImage(bugImage, bug.x, bug.y);
     }
     if (caught == true) {
         if (bgReady) {
             ctx.drawImage(bgImage, 0, 100);
         }
         caught = false;
     }
     // Score, Title
     ctx.font = "30px Comic Sans MS";
     ctx.fillStyle = "red";
     ctx.textAlign = "left";
     ctx.fillText("Catch bug !!", 20, 26); 
     ctx.font = "30px Comic Sans MS";
     ctx.fillStyle = "black";
     ctx.textAlign = "left";
     ctx.fillText("Score: " + bugCaught, 20, 70);
 
     // Reset Score, Speed button
     ctx.fillStyle = "grey";
     ctx.arc(300,40,40,0,2*Math.PI);
     ctx.fill();
     ctx.arc(400,40,40,0,2*Math.PI);
     ctx.fill();
     // Write
     ctx.fillStyle = "white";
     ctx.font = "20px Comic Sans MS";
     ctx.textAlign = "top";
     ctx.fillText("Reset", 275, 35);
     ctx.fillText("Score", 275, 60);
     ctx.fillText("Reset", 375, 35);
     ctx.fillText("Speed", 375, 60);
 
     ctx.fillStyle = "black";
     ctx.font = "20px Comic Sans MS";
     ctx.textAlign = "top";
     ctx.fillText("Speed level: " + speed/4, 500, 40);
 
 };
 
 //Reset Score box
 function ResetScore(x, y) {
 
     if (x > (260) && x < (340) && y > (0) && y < (80)) 
     {
         return true;
     }
     return false;
 };
 
 //Reset speed box
 function ResetSpeed(x, y) {
     if (x > (360) && x < (440) && y > (0) && y < (80)) {
         speed = 4;
         return true;
     }
     return false;
 };
 
// Background image
var bgReady = false;
var bgImage = new Image();

bgImage.onload = function () {
    bgReady = true;
};
bgImage.src = "images/background.png";


// bug image
var bugReady = false;
var bugImage = new Image();
bugImage.onload = function () {
    bugReady = true;
};
bugImage.src = "images/bug.png";

var bug = {};
var bugCaught = 0;

// When nar is caught, reset
var reset = function () {
    bug.x = 40 + (Math.random() * (canvas.width - 70));
    do {
        bug.y = 40 + (Math.random() * (canvas.height - 70));
    }
    while (bug.y < 100)
};

//mousedown event
window.addEventListener("mousedown", onMouseDown, false);
function onMouseDown(e) {

    if (e.button != 0) return;

    mouseXinCanvas = e.clientX;
    mouseYinCanvas = e.clientY;

    if (bugBody(bug, mouseXinCanvas, mouseYinCanvas)) {
        caught = true;
        clearInterval(timer);
        timer = setInterval(reset, 20000 / speed);
        reset();
    }
    if (ResetScore(mouseXinCanvas, mouseYinCanvas)) {
        location.reload();
    }
    if (ResetSpeed(mouseXinCanvas, mouseYinCanvas)) {
        clearInterval(timer);
        timer = setInterval(reset, 20000 / speed);
        reset();
        render();
    }
};

//bug define
function bugBody(bug, x, y) {

    if (x <= (bug.x + 80) && bug.x <= (x + 80) && y <= (bug.y + 80) && bug.y <= (y + 80)
    ) {
        speed = speed + 4;
        if (speed/4 <= 5)
        {
        bugCaught = bugCaught+1;
        }
        else 
        {
        bugCaught = bugCaught+2;
        }
        return true;
    }
    return false;
};


// The main game loop
var main = function () {
    render();
    // Request to do this again ASAP
    requestAnimationFrame(main);
};

// Cross-browser support for requestAnimationFrame
var w = window;
requestAnimationFrame = w.requestAnimationFrame || w.webkitRequestAnimationFrame || w.msRequestAnimationFrame || w.mozRequestAnimationFrame;
// Let's play this game!
//var then = Date.now();
reset();
main();