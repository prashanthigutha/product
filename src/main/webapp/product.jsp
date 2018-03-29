<script src="pricing.js" type="text/javascript"></script>
<script src="Planview_Log.js" type="text/javascript"></script>
<script src="filters.js" type="text/javascript"></script>
<link  rel="stylesheet" type="text/css" href="pricing.css"></link>
<link  rel="stylesheet" type="text/css" href="cart.css"></link>
<link  rel="stylesheet" type="text/css" href="filters.css"></link>
<script src="cart.js" type="text/javascript"></script>
<jsp:include page="cart_modal.jsp"/>






	
<div id="product-search" style="height:100%;width:100%;" >
	
	<div id="filter" style="float:left;height:100%;width:15%">
		
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

	
	
	<div id="medical_plans" style="display:block;float:left; height:100%;width:85%">
		<div id="filters" style="height:5%;width:100%">
			<span>Monthly Premium:</span>
				<span class="custom-dropdown">
					<select >
						<option>$0 To $50</option>
						<option>$50 To $100</option>  
						<option>$100 To $150</option>
					</select>
				</span>
				
				<span>Coinsurance:</span>
				<span class="custom-dropdown">
					<select >
						<option>40% To 60%</option>
						<option>60% To 80%</option>  
						<option>80% To 100%</option>
						
					</select>
				</span>

				<span>Max Out Of Pocket:</span>
				<span class="custom-dropdown">
					<select >
						<option>$0 To $2000</option>
						<option>$2000 To $5000</option>  
						<option>$5000 To $1000</option>
					</select>
					
				</span>
				<span><input type="submit" value="Apply" style="height:30px; width:100px;background-color: #1ABC9C;color: #fff"/></span>
			</div>
		<div id="pricing-table" class="clear" style="height:95%;width:100%">
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Medical Value<span>$66.90</span></h3>
				 
					<div class="Addtocart" id="medBtn1" href="" onclick="showMedicalModal()">Add to Cart</div> 
				   
				<ul>
					<li><b>60%</b> Coinsurance</li>
					<li><b>12500</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>1000</b> Out Of Pocket Maximum</li>			
				</ul> 
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)" >
				<h3>Medical Value Plus<span>$132.20</span></h3>
				<div class="Addtocart" id= "MedBtn2" href="" onclick="showMedicalModal()">Add to Cart</div>  
					
				
				<ul>
					<li><b>70%</b> Coinsurance</li>
					<li><b>5000</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>5000</b> Out Of Pocket Maximum</li>					
				</ul>    
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Medicare<span>$74</span></h3>
				<div class="Addtocart" id= "MedBtn3" href="" onclick="showMedicalModal()">Add to Cart</div>
									  
				<ul>
					<li><b>95%</b> Coinsurance</li>
					<li><b>1000</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>3500</b> Out Of Pocket Maximum</li>		
				</ul>
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Medicaid<span>$17</span></h3>
			<div class="Addtocart" id= "MedBtn4" href="" onclick="showMedicalModal()">Add to Cart</div>
					  
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
		<div id="filters" style="height:5%;width:100%">
			<span>Monthly Premium:</span>
				<span class="custom-dropdown">
					<select >
						<option>$0 To $50</option>
						<option>$50 To $100</option>  
						<option>$100 To $150</option>
					</select>
				</span>
				
				<span>Coinsurance:</span>
				<span class="custom-dropdown">
					<select >
						<option>40% To 60%</option>
						<option>60% To 80%</option>  
						<option>80% To 100%</option>
						
					</select>
				</span>

				<span>Max Out Of Pocket:</span>
				<span class="custom-dropdown">
					<select >
						<option>$0 To $2000</option>
						<option>$2000 To $5000</option>  
						<option>$5000 To $1000</option>
					</select>
					
				</span>
				<span><input type="submit" value="Apply" style="height:30px; width:100px;background-color: #1ABC9C;color: #fff"/></span>
			</div>
		<div id="pricing-table" class="clear" style="height:95%;width:100%">
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Dental Primary<span>$20.68</span></h3>
			  	<div class="Addtocart" id= "DenBtn1" onclick="showDentalModal()" href="">Add to Cart</div>
					
				<ul>
					<li><b>70%</b> Coinsurance</li>
					<li><b>50</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>1000</b> Out Of Pocket Maximum</li>			
				</ul> 
			</div>
			
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)" >
				<h3>Dental Essential<span>$34.93</span></h3>
				<div class="Addtocart" id= "DenBtn2" onclick="showDentalModal()" href="">Add to Cart</div>
				<ul>
					<li><b>70%</b> Coinsurance</li>
					<li><b>50</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>800</b> Out Of Pocket Maximum</li>			
				</ul>    
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Dental Premier <span>$41.06</span></h3>
				<div class="Addtocart" id= "DenBtn3" onclick="showDentalModal()" href="">Add to Cart</div>
				<ul>
					<li><b>80%</b> Coinsurance</li>
					<li><b>50</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>600</b> Out Of Pocket Maximum</li>				
				</ul>
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Dental Elite<span>$55.20</span></h3>
			 <div class="Addtocart" id= "DenBtn4"  onclick="showDentalModal()" href="">Add to Cart</div>
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
		<div id="filters" style="height:5%;width:100%">
			<span>Monthly Premium:</span>
				<span class="custom-dropdown">
					<select >
						<option>$0 To $50</option>
						<option>$50 To $100</option>  
						<option>$100 To $150</option>
					</select>
				</span>
				
				<span>Coinsurance:</span>
				<span class="custom-dropdown">
					<select >
						<option>40% To 60%</option>
						<option>60% To 80%</option>  
						<option>80% To 100%</option>
						
					</select>
				</span>

				<span>Max Out Of Pocket:</span>
				<span class="custom-dropdown">
					<select >
						<option>$0 To $2000</option>
						<option>$2000 To $5000</option>  
						<option>$5000 To $1000</option>
					</select>
					
				</span>
				<span><input type="submit" value="Apply" style="height:30px; width:100px;background-color: #1ABC9C;color: #fff"/></span>
			</div>
		<div id="pricing-table" class="clear" style="height:95%;width:100%">
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Vision Basic<span>$11.40</span></h3>
			   <div class="Addtocart" id= "VisBtn1" onclick="showVisionModal()" href="">Add to Cart</div>
				<ul>
					<li><b>60%</b> Coinsurance</li>
					<li><b>100</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>1000</b> Out Of Pocket Maximum</li>			
				</ul> 
			</div>
			
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)" >
				<h3>Vision Prime<span>$15.70</span></h3>
				<div class="Addtocart" id= "VisBtn2" onclick="showVisionModal()" href="">Add to Cart</div>
				<ul>
					<li><b>60%</b> Coinsurance</li>
					<li><b>100</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>800</b> Out Of Pocket Maximum</li>			
				</ul>    
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Vision Choice <span>$25.50</span></h3>
				<div class="Addtocart" id= "VisBtn3" onclick="showVisionModal()" href="">Add to Cart</div>
				<ul>
					<li><b>70%</b> Coinsurance</li>
					<li><b>50</b> Deductible</li>
					<li><b>Monthly</b> Payment method</li>
					<li><b>600</b> Out Of Pocket Maximum</li>				
				</ul>
			</div>
			<div class="plan" onmouseover="activeproduct(this)" onmouseout="passiveproduct(this)">
				<h3>Vision Elite<span>$37.80</span></h3>
			    <div class="Addtocart" id= "VisBtn4" onclick="showVisionModal()" href="">Add to Cart</div>
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

