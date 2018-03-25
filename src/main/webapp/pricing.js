function activeproduct(ele)
{
	ele.id="most-popular";
}
function passiveproduct(ele)
{
	ele.id="";
}

function showmedical(){

		document.getElementById("medical_plans").style.display="block";
		document.getElementById("dental_plans").style.display="none";
		document.getElementById("vision_plans").style.display="none";
}
function showdental(){

		document.getElementById("medical_plans").style.display="none";
		document.getElementById("dental_plans").style.display="block";
		document.getElementById("vision_plans").style.display="none";
}
function showvision(){

		document.getElementById("medical_plans").style.display="none";
		document.getElementById("dental_plans").style.display="none";
		document.getElementById("vision_plans").style.display="block";
}