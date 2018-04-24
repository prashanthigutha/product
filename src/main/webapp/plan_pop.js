


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





function ButtonAccess()
{
var currentUrl=window.location.href;
if(currentUrl.indexOf("#id1")>0)
	showmedical();
else if (currentUrl.indexOf("#id2")>0)
	showdental();
else if (currentUrl.indexOf("#id3")>0)
	showvision();

}

var product_id;
function addtocart(plancat,productid){
	
	product_id=productid;
	
	console.log(product_id);
	xmlHttp=GetXmlHttpObject() // 1) GET XHTTP object
	//var user_id=document.getElementById("username").value; // 2) get html form element
	var url="http://localhost:8080/addtocart";
	//product_id="+product_id;  
	xmlHttp.open("POST",url,true); // 3) Configure HTTP server request
	xmlHttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");// 4) set header values
	xmlHttp.send("product_id="+product_id); // 5) post data
	xmlHttp.onreadystatechange  = validateAddToCartResponse; // 6) call back function
	
	
	if(plancat=="Medical")
		showMedicalModal();
	else if(plancat=="Dental")
		showDentalModal();
	else if(plancat=="Vision")
		showVisionModal();
	}	


	// returns AJAX / XmlHTTP object based on user browser
	function GetXmlHttpObject()
	{ var xmlHttp=null;
	try { // create xhttp object in following browser Firefox, Opera 8.0+, Safari
		 xmlHttp=new XMLHttpRequest(); }
	catch (e)
	 {// create xhttp object in Internet Explorer browser 
		 try{ 	xmlHttp=new ActiveXObject("Msxml2.XMLHTTP"); 	  }
		 catch (e) { 	xmlHttp=new ActiveXObject("Microsoft.XMLHTTP"); 	  }
	 }	return xmlHttp;
	}
	
 // Callback function to process server’s Http response
	function validateAddToCartResponse() {
	if (xmlHttp.readyState == 4) {
		if(xmlHttp.status == 200) {
			var response= xmlHttp.responseText; 
			// alert(response);  
			}
		else {  alert("ajax call failed");
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

function showmedical(){
	document.getElementById("medical_plans").style.display="block";
	document.getElementById("dental_plans").style.display="none";
	document.getElementById("vision_plans").style.display="none";
	document.getElementById("viewcart").style.display="none";
}
function showdental(){

	document.getElementById("medical_plans").style.display="none";
	document.getElementById("dental_plans").style.display="block";
	document.getElementById("vision_plans").style.display="none";
	document.getElementById("viewcart").style.display="none";
}
function showvision(){

	document.getElementById("medical_plans").style.display="none";
	document.getElementById("dental_plans").style.display="none";
	document.getElementById("vision_plans").style.display="block";
	document.getElementById("viewcart").style.display="none";
}





