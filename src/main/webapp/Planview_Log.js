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

/*function emptycheck()
{
		
	var email=document.getElementById("mail").value;
	var zip=document.getElementById("Zipcode").value;
	var isitnum=parseInt(zip);
	if((email=="")||(zip=="") )
		alert("mandatory fields should not be empty");
	else if(isNaN(isitnum))
		alert("Zipcode required is number");
	
	
	
		
	}
*/



$(document).ready(function(){
$(".modal-footer").click(emptycheck);

});

function emptycheck()
{
		
	var email=$("#mail").val();
	var zip=$("#Zipcode").val();
	var isitnum=parseInt(zip);
	if((email=="")||(zip=="") )
		alert("mandatory fields should not be empty");
	
	else if(isNaN(isitnum))
		alert("Zipcode required is number");
	
	
	
		
}
