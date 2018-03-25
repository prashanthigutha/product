<script src="pricing.js" type="text/javascript"></script>
<link  rel="stylesheet" type="text/css" href="pricing.css"></link>


<div id="product-search" style="height:100%;width:100%">
	<div id="filter" style="float:left; height:100%;width:15%">

		<div id="category" style="height:10%;width:100%"></div>
		<div class="catg" >
		<a href="#id1" class="flipper-container">
		  <div id="id1" class="flipper">
			<div class="front-face" onclick="showmedical()" data-icon="" href="#"><span >Medical</span></div>
			<div class="back-face" data-icon="">Medical</div>
		  </div>
		</a>
		</div>
		<div class="catg">
		<a href="#id2" class="flipper-container">
		  <div id="id2" class="flipper">
			<div class="front-face" onclick="showdental()" data-icon="" href="#"><span data-hover="Clicked" >Dental</span></div>
			<div class="back-face" data-icon="">Dental</div>
		  </div>
		</a>
		</div>
		<div class="catg">
		<a href="#id3" class="flipper-container">
		  <div id="id3" class="flipper">
			<div class="front-face" onclick="showvision()" data-icon="" href="#"><span data-hover="Clicked" >Vision</span></div>
			<div class="back-face" data-icon="">Vision</div>
		  </div>
		</a>
		</div>
	</div>


	<div id="medical_plans" style="display:none;float:left; height:100%;width:85%">
		<div id="pricing-table" class="clear">
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Medical Value<span>$66.90</span></h3>
				<a class="Addtocart" href="">Add to Cart</a>         
				<ul>
					<li><b>60%</b> Coinsurance</li>
					<li><b>12500</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>1000</b> Out Of Pocket Maximum</li>			
				</ul> 
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)" >
				<h3>Medical Value Plus<span>$132.20</span></h3>
				<a class="Addtocart" href="">Add to Cart</a>     
				<ul>
					<li><b>70%</b> Coinsurance</li>
					<li><b>5000</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>5000</b> Out Of Pocket Maximum</li>					
				</ul>    
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Medicare<span>$74</span></h3>
				<a class="Addtocart" href="">Add to Cart</a>  
				<ul>
					<li><b>95%</b> Coinsurance</li>
					<li><b>1000</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>3500</b> Out Of Pocket Maximum</li>		
				</ul>
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Medicaid<span>$17</span></h3>
				<a class="Addtocart" href="">Add to Cart</a>  	
				<ul>
					<li><b>90%</b> Coinsurance</li>
					<li><b>1000</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>2500</b> Out Of Pocket Maximum</li>			
				</ul>
			</div> 	

		</div>
	</div>


	<div id="dental_plans" style="display:none;float:left; height:100%;width:85%">
		<div id="pricing-table" class="clear">
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Dental Primary<span>$20.68</span></h3>
			   <a class="Addtocart" href="">Add to Cart</a>          
				<ul>
					<li><b>70%</b> Coinsurance</li>
					<li><b>50</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>1000</b> Out Of Pocket Maximum</li>			
				</ul> 
			</div>
			
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)" >
				<h3>Dental Essential<span>$34.93</span></h3>
				<a class="Addtocart" href="">Add to Cart</a>          
				<ul>
					<li><b>70%</b> Coinsurance</li>
					<li><b>50</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>800</b> Out Of Pocket Maximum</li>			
				</ul>    
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Dental Premier <span>$41.06</span></h3>
				<a class="Addtocart" href="">Add to Cart</a>  
				<ul>
					<li><b>80%</b> Coinsurance</li>
					<li><b>50</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>600</b> Out Of Pocket Maximum</li>				
				</ul>
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Dental Elite<span>$55.20</span></h3>
			   <a class="Addtocart" href="">Add to Cart</a>  	
				<ul>
					<li><b>90%</b> Coinsurance</li>
					<li><b>50</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>500</b> Out Of Pocket Maximum</li>				
				</ul>
			</div> 	
		</div>

	</div>


	<div id="vision_plans" style="display:none;float:left; height:100%;width:85%" >
		<div id="pricing-table" class="clear">
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Vision Basic<span>$11.40</span></h3>
			   <a class="Addtocart" href="">Add to Cart</a>          
				<ul>
					<li><b>60%</b> Coinsurance</li>
					<li><b>100</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>1000</b> Out Of Pocket Maximum</li>			
				</ul> 
			</div>
			
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)" >
				<h3>Vision Prime<span>$15.70</span></h3>
				<a class="Addtocart" href="">Add to Cart</a>          
				<ul>
					<li><b>60%</b> Coinsurance</li>
					<li><b>100</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>800</b> Out Of Pocket Maximum</li>			
				</ul>    
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Vision Choice <span>$25.50</span></h3>
				<a class="Addtocart" href="">Add to Cart</a>  
				<ul>
					<li><b>70%</b> Coinsurance</li>
					<li><b>50</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>600</b> Out Of Pocket Maximum</li>				
				</ul>
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Vision Elite<span>$37.80</span></h3>
			   <a class="Addtocart" href="">Add to Cart</a>  	
				<ul>
					<li><b>80%</b> Coinsurance</li>
					<li><b>50</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>500</b> Out Of Pocket Maximum</li>				
				</ul>
			</div> 	
		</div>
	</div>

</div>


