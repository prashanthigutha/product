function showcart(){
	
	document.getElementById("viewcart").style.display="block";
	document.getElementById("medical_plans").style.display="none";
	document.getElementById("dental_plans").style.display="none";
	document.getElementById("vision_plans").style.display="none";
	
}

function remove1()
{
	
	var x = document.getElementById("remove1");
	var y = document.getElementById("p1");	
	y.remove();
    x.remove();
	
	}

function remove2()
{
	
	var x = document.getElementById("remove2");
	var y = document.getElementById("p2");	
	
	y.remove();
    x.remove();
	
	}

function remove3()
{
	
	var x = document.getElementById("remove3");
	var y= document.getElementById("p3");	
	
	y.remove();
    x.remove();
  
	
	}


