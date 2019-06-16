// Java Script

var index =1;
var imageindex =0;
var slideIndex = 1;
//Zoom
var image1 = document.getElementById("image1");
var image2 = document.getElementById("image2");
var image3 = document.getElementById("image3");
var image4 = document.getElementById("image4");
var image5 = document.getElementById("image5");

var hideimage = document.getElementById("hideimage");
var hidedot = document.getElementById("dot")
var hidebutton = document.getElementById("close")
var hidesesilder = document.getElementById("allslide")


showSlides(slideIndex);

function newFunction()
{
  return 1;
}
function plusSlides(n) 
{
  showSlides(slideIndex += n);
}

function currentSlide(n) 
{
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("Slide");  
  if (n > slides.length) 
  {
    slideIndex = 1
  } 
  if (n < 1) 
  {
    slideIndex = slides.length
  }
  for (i = 0; i < slides.length; i++) 
  {
      slides[i].style.display = "none"; 
  }
  slides[slideIndex-1].style.display = "block"; 

}


hideimage.style.display ="none";
hidebutton.style.display ="none";

image1.addEventListener("click", Changeimage1);
image2.addEventListener("click", Changeimage2);
image3.addEventListener("click", Changeimage3);
image4.addEventListener("click", Changeimage4);
image5.addEventListener("click", Changeimage5);

function Changeimage1()
{
    hideimage.src='images/Daegu1.PNG';
    hideimage.style.display ="block";
    hidebutton.style.display ="block";
    hidedot.style.display ='none';
    hidesesilder.style.display = "none";
}
function Changeimage2()
{
    hideimage.src='images/Daegu2.PNG';
    hideimage.style.display ="block";
    hidebutton.style.display ="block";
    hidedot.style.display ='none';
    hidesesilder.style.display = "none";
}
function Changeimage3()
{
    hideimage.src='images/Daegu3.PNG';
    hideimage.style.display ="block";
    hidebutton.style.display ="block";
    hidedot.style.display ='none';
    hidesesilder.style.display = "none";
}
function Changeimage4()
{
    hideimage.src='images/Daegu4.PNG';
    hideimage.style.display ="block";
    hidebutton.style.display ="block";
    hidedot.style.display ='none';
    hidesesilder.style.display = "none";
}
function Changeimage5()
{
    hideimage.src='images/Daegu5.PNG';
    hideimage.style.display ="block";
    hidebutton.style.display ="block";
    hidedot.style.display ='none';
    hidesesilder.style.display = "none";
}

function closebigimage()
{
    hidedot.style.display ='block';
    hidesesilder.style.display = 'block';
    hidebutton.style.display ="none";
    hideimage.style.display ='none';
}

//favorite

var Fimage1 = document.getElementById("Fimage1");
var Fimage2 = document.getElementById("Fimage2");
var Fimage3 = document.getElementById("Fimage3");
var Fimage4 = document.getElementById("Fimage4");
var Fimage5 = document.getElementById("Fimage5");

Fimage1.style.display ="none";
Fimage2.style.display ="none";
Fimage3.style.display ="none";
Fimage4.style.display ="none";
Fimage5.style.display ="none";


var FClose1= document.getElementById("FCloseButtion1");
var FClose2= document.getElementById("FCloseButtion2");
var FClose3= document.getElementById("FCloseButtion3");
var FClose4= document.getElementById("FCloseButtion4");
var FClose5= document.getElementById("FCloseButtion5");

FCloseButtion1.style.display ="none";
FCloseButtion2.style.display ="none";
FCloseButtion3.style.display ="none";
FCloseButtion4.style.display ="none";
FCloseButtion5.style.display ="none";

function favorite1()
{
    Fimage1.style.display ="block";
    FClose1.style.display ="block";
}
function favorite2()
{
    Fimage2.style.display ="block";
    FClose2.style.display ="block";

}
function favorite3()
{
    Fimage3.style.display ="block";
    FClose3.style.display ="block";

}
function favorite4()
{
    Fimage4.style.display ="block";
    FClose4.style.display ="block";

}
function favorite5()
{
    Fimage5.style.display ="block";
    FClose5.style.display ="block";

}

Fimage1.addEventListener("click", FChangeimage1);
Fimage2.addEventListener("click", FChangeimage2);
Fimage3.addEventListener("click", FChangeimage3);
Fimage4.addEventListener("click", FChangeimage4);
Fimage5.addEventListener("click", FChangeimage5);

function FChangeimage1()
{
    Fimage1.style.display ="none";
    FCloseButtion1.style.display ="none";

}
function FChangeimage2()
{
    Fimage2.style.display ="none";
    FCloseButtion2.style.display ="none";

}
function FChangeimage3()
{
    Fimage3.style.display ="none";
    FCloseButtion3.style.display ="none";

}
function FChangeimage4()
{
    Fimage4.style.display ="none";
    FCloseButtion4.style.display ="none";

}
function FChangeimage5()
{
    Fimage5.style.display ="none";
    FCloseButtion5.style.display ="none";

}