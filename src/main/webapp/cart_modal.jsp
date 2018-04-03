<!-- Modal content -->
<script src="pricing.js" type="text/javascript"></script>
<link  rel="stylesheet" type="text/css" href="cart.css"></link> 
<script src="cart.js" type="text/javascript"></script>
<div id="Medical_Modal" style="display:none;" class="modal">
	<div class="modal-content"> 
		<div class="modal-header">
			<span class="close">&times;</span>
			<h2>Expand Your Coverage</h2>
		</div>
		<br/>
		<div class="modal-body">
			<div>
				<p>Add Dental Plan and Save More
				<input type="Button" onclick="javascript:showdental();" value="Continue"></p>
			</div>
			<div>
				<p>Add Vision Plan and Save More
				<input type="Button" onclick="javascript:showvision();" value="Continue"></p>
				
			</div>
			 
		</div>
		 
		 <div class="modal-footer">
		 <form action="addcart">
      	  		<input type="submit"  value="Checkout">
      	  		</form>
			</div>
		  	
	</div>
</div>
<div id="Dental_Modal" style="display:none;" class="modal">
		<div class="modal-content"> 
		<div class="modal-header">
			<span class="close">&times;</span>
			<h2>Expand Your Coverage</h2>
		</div>
		<br/>
		<div class="modal-body">
			<div>
				<p>Add Medical Plan and Save More
				<input type="Button" onclick="javascript:showmedical();" value="Continue"></p>
				</div>
			<div>
				<p>Add Vision Plan and Save More
				<input type="Button" onclick="javascript:showvision();" value="Continue"></p>
				</div>
		</div>
		 <div class="modal-footer">
      	  
      	 <input type=button onclick="location.href='http://ec2-18-219-227-199.us-east-2.compute.amazonaws.com:8080/order.jsp';" value="Checkout">
				
      	</div>
	</div>
</div>
<div id="Vision_Modal" style="display:none;" class="modal">
	<div class="modal-content"> 
		<div class="modal-header">
			<span class="close">&times;</span>
			<h2>Expand Your Coverage</h2>
		</div>
		<br/>
		<div class="modal-body">
			<div>
				<p>Add Medical Plan and Save More
				<input type="Button" onclick="javascript:showmedical();" value="Continue"></p>
			</div>
			<div>
				<p>Add Dental Plan and Save More
				<input type="Button" onclick="javascript:showdental();" value="Continue"></p>
			</div>
			
		</div>
		 <div class="modal-footer">
      	 
				<input type=button onclick="location.href='http://ec2-18-219-227-199.us-east-2.compute.amazonaws.com:8080/order.jsp';" value="Checkout">
				 
			
      	</div>
	</div>
</div>