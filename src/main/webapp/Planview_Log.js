// Get the modal
window.onload = function(){ 
var pmodal = document.getElementById('planview_Modal');
var myWindow;

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];


// When the user clicks on <span> (x), close the modal
span.onclick = function() {
	pmodal.style.display = "none";
	
}


// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == pmodal) {
    	pmodal.style.display = "none";
    	
    }
}
}

function showplansModal(){
	document.getElementById("planview_Modal").style.display="block";
}


