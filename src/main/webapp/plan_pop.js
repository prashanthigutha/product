// Get the modal
window.onload = function(){ 
var mmodal = document.getElementById('Medical_Modal');
var dmodal = document.getElementById('Dental_Modal');
var vmodal = document.getElementById('Vision_Modal');


// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];


// When the user clicks on <span> (x), close the modal
span.onclick = function() {
	mmodal.style.display = "none";
	dmodal.style.display = "none";
	vmodal.style.display = "none";
	
}



// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == mmodal || event.target == dmodal  ||  event.target == vmodal ) {
    	mmodal.style.display = "none";
    	dmodal.style.display = "none";
    	vmodal.style.display = "none";
    }
}
}

function showMedicalModal(){
	document.getElementById("Medical_Modal").style.display="block";
}
function showDentalModal(){
	document.getElementById("Dental_Modal").style.display="block";
}
function showVisionModal(){
	document.getElementById("Vision_Modal").style.display="block";
}

