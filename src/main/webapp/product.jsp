
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script src="pricing.js" type="text/javascript"></script>
<script src="Planview_Log.js" type="text/javascript"></script>
<%-- <script src="filters.js" type="text/javascript"></script> --%>
<link  rel="stylesheet" type="text/css" href="pricing.css"></link>
<link  rel="stylesheet" type="text/css" href="plan_pop.css"></link>
<link  rel="stylesheet" type="text/css" href="filters.css"></link>
<script src="plan_pop.js" type="text/javascript"></script>
<%-- <script src="viewcart.js" type="text/javascript"></script> --%>
<jsp:include page="plan_popup.jsp"/>

<%@ taglib uri="/struts-tags" prefix="s" %>




	
<div ng-app="angapp" ng-controller="angcntrl" id="product-search" style="height:100%;width:100%;" >
	
	<div id="filter" style="float:left;height:100%;width:15%">
		
		<div id="category" style="height:10%;width:100%"></div>
		
		<div class="catg" >
		<a href="#id1" class="flipper-container">
		  <div id="id1"  class="flipper">
			<div class="front-face" ng-model="id1" ng-click="showmedical()" data-icon="" href="#"><span >Medical</span></div>
			<div class="back-face" data-icon="">Medical</div>
		  </div>
		</a>
		</div>
		
		<div class="catg">
		<a href="#id2" class="flipper-container">
		  <div id="id2" class="flipper">
			<div class="front-face" ng-model="id2" ng-click="showdental()" data-icon="" href="#"><span data-hover="Clicked" >Dental</span></div>
			<div class="back-face" data-icon="">Dental</div>
		  </div>
		</a>
		</div>
		<div class="catg">
		<a href="#id3" class="flipper-container">
		  <div id="id3" class="flipper">
			<div class="front-face" ng-model="id3"ng-click="showvision()" data-icon="" href="#"><span data-hover="Clicked" >Vision</span></div>
			<div class="back-face" data-icon="">Vision</div>
		  </div>
		</a>
		</div>
	</div>

	
	
	<div id="medical_plans" ng-model="medical_plans" ng-style="getmedicalstyle()" style="display:block; float:left; height:100%;width:85%" >
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
				<span><input type="submit" value="View cart" ng-model="viewcart" ng-click="showcart()" style="height:30px; width:100px;background-color: #1ABC9C;color: #fff"/></span>
			</div>
		
			<div id="pricing-table" class="clear" style="display:block;height:95%;width:100%">
				<s:iterator value="medicalplanList" var="plans">
					<div class="plan" onmouseover="activeproduct(this)"
						onmouseout="passiveproduct(this)">
						<h3>
							<s:property value="#plans.planname" />
							<span>$<s:property value="#plans.premiumamnt" /></span>
						</h3>
						<div class="Addtocart" id="medBtn1" href=""
							onclick="showMedicalModal()">Add to Cart</div>
						<ul>
							<li><b><s:property value="#plans.Coinsurance" /></b>
								Coinsurance</li>
							<li><b><s:property value="#plans.Deductible" /></b>
								Deductible</li>
							<li><b><s:property value="#plans.Paymentmethod" /></b>
								Payment method</li>
							<li><b><s:property value="#plans.Maxoutpkt" /></b> Out Of Pocket
								Maximum</li>
						</ul>
					</div>
					</s:iterator>
			</div>
			

		</div>
	


	<div id="dental_plans" ng-model="dental_plans" ng-style="getdentalstyle()" style="display:none;float:left; height:100%;width:85%">
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
				<span><input type="submit" value="View cart" ng-model="viewcart" ng-click="showcart()" style="height:30px; width:100px;background-color: #1ABC9C;color: #fff"/></span>
			</div>
		<div id="pricing-table" class="clear" style="height:95%;width:100%">
			<s:iterator value="dentalplanList" var="plans">
					<div class="plan" onmouseover="activeproduct(this)"
						onmouseout="passiveproduct(this)">
						<h3>
							<s:property value="#plans.planname" />
							<span>$<s:property value="#plans.premiumamnt" /></span>
						</h3>
						<div class="Addtocart" id="medBtn1" href=""
							onclick="showDentalModal()">Add to Cart</div>
						<ul>
							<li><b><s:property value="#plans.Coinsurance" /></b>
								Coinsurance</li>
							<li><b><s:property value="#plans.Deductible" /></b>
								Deductible</li>
							<li><b><s:property value="#plans.Paymentmethod" /></b>
								Payment method</li>
							<li><b><s:property value="#plans.Maxoutpkt" /></b> Out Of Pocket
								Maximum</li>
						</ul>
					</div>
					</s:iterator>
		</div>

	</div>


	<div id="vision_plans" ng-model="vision_plans" ng-style="getvisionstyle()" style="display:none;float:left; height:100%;width:85%" >
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
				<span><input type="submit" value="View cart" ng-model="viewcart" ng-click="showcart()" style="height:30px; width:100px;background-color: #1ABC9C;color: #fff"/></span>
			</div>
		<div id="pricing-table" class="clear" style="height:95%;width:100%">
			<s:iterator value="visionplanList" var="plans">
					<div class="plan" onmouseover="activeproduct(this)"
						onmouseout="passiveproduct(this)">
						<h3>
							<s:property value="#plans.planname" />
							<span>$<s:property value="#plans.premiumamnt" /></span>
						</h3>
						<div class="Addtocart" id="medBtn1" href=""
							onclick="showVisionModal()">Add to Cart</div>
						<ul>
							<li><b><s:property value="#plans.Coinsurance" /></b>
								Coinsurance</li>
							<li><b><s:property value="#plans.Deductible" /></b>
								Deductible</li>
							<li><b><s:property value="#plans.Paymentmethod" /></b>
								Payment method</li>
							<li><b><s:property value="#plans.Maxoutpkt" /></b> Out Of Pocket
								Maximum</li>
						</ul>
					</div>
					</s:iterator>
		</div>

	</div>	
	
	
	
	<div id="viewcart" ng-model="viewcart" ng-style="getcartstyle()" style="display:none;float:left; height:100%;width:85%" >
	
		<div id="pricing-table" class="clear" style="height:95%;width:100%">
			<s:iterator value="visionplanList" var="plans">
					<div class="plan" onmouseover="activeproduct(this)"
						onmouseout="passiveproduct(this)">
						<h3>
							<s:property value="#plans.planname" />
							<span>$<s:property value="#plans.premiumamnt" /></span>
						</h3>
						<div class="Addtocart" id="medBtn1" href=""
							onclick="showcart()">Remove</div>
						<ul>
							<li><b><s:property value="#plans.Coinsurance" /></b>
								Coinsurance</li>
							<li><b><s:property value="#plans.Deductible" /></b>
								Deductible</li>
							<li><b><s:property value="#plans.Paymentmethod" /></b>
								Payment method</li>
							<li><b><s:property value="#plans.Maxoutpkt" /></b> Out Of Pocket
								Maximum</li>
						</ul>
					</div>
					</s:iterator>
			
			<span><input type="submit" value="Check Out" style="height:50px; width:150px;background-color: #1ABC9C;color: #fff"/></span>
			
		  </div>
	
	
	</div>
	
	
</div>

