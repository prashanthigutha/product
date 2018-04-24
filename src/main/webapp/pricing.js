
function activeproduct(ele)
{
	ele.id="most-popular";
}
function passiveproduct(ele)
{
	ele.id="";
}



/*function showplans()
{
    
	showmedical()
	showdental()
	showvision()

	
}*/

//Angular-JS code

var app=new angular.module("angapp",[]);
app.controller("angcntrl",function($scope,$filter,$interval){
	

$scope.showmedical=function(){
	$scope.getmedicalstyle=function(){
		
	var sty={
			 "display":"block"
			 
	};
	return sty;
				 
	}
	$scope.getdentalstyle=function(){
		
		var sty={
				 "display":"none"
				 
		};
		return sty;
					 
	}
	$scope.getvisionstyle=function(){
		
		var sty={
				 "display":"none"
				
		};
		return sty;
					 
	}
	$scope.getcartstyle=function(){
		var sty={
				 "display":"none"
				
		};
		return sty;
		
	}
	
}

$scope.showdental=function(){
	$scope.getmedicalstyle=function(){
		
	var sty={
			 "display":"none"
			 
	};
	return sty;
				 
	}
	$scope.getdentalstyle=function(){
		
		var sty={
				 "display":"block"
				 
		};
		return sty;
					 
	}
	$scope.getvisionstyle=function(){
		
		var sty={
				 "display":"none"
				
		};
		return sty;
					 
	}
	$scope.getcartstyle=function(){
		var sty={
				 "display":"none"
				
		};
		return sty;
		
	}
	
}

$scope.showvision=function(){
	$scope.getmedicalstyle=function(){
		
	var sty={
			 "display":"none"
			 
	};
	return sty;
				 
	}
	$scope.getdentalstyle=function(){
		
		var sty={
				 "display":"none"
				 
		};
		return sty;
					 
	}
	$scope.getvisionstyle=function(){
		
		var sty={
				 "display":"block"
				
		};
		return sty;
					 
	}
	$scope.getcartstyle=function(){
		var sty={
				 "display":"none"
				
		};
		return sty;
		
	}
	
}




$scope.showcart=function(){
	$scope.getmedicalstyle=function(){
		
	var sty={
			 "display":"none"
			 
	};
	return sty;
				 
	}
	$scope.getdentalstyle=function(){
		
		var sty={
				 "display":"none"
				 
		};
		return sty;
					 
	}
	$scope.getvisionstyle=function(){
		
		var sty={
				 "display":"none"
				
		};
		return sty;
					 
	}
	$scope.getcartstyle=function(){
		var sty={
				 "display":"block"
				
		};
		return sty;
		
	}
	
}
});



//Java script code

/*function showmedical(){
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
}*/
/*function showcart(){
	
	document.getElementById("viewcart").style.display="block";
	document.getElementById("medical_plans").style.display="none";
	document.getElementById("dental_plans").style.display="none";
	document.getElementById("vision_plans").style.display="none";
	
}*/
