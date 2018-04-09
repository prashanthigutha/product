<!-- Modal content -->
<!-- <script src="pricing.js" type="text/javascript"></script> -->
<link  rel="stylesheet" type="text/css" href="plan_pop.css"></link> 
<script src="plan_pop.js" type="text/javascript"></script>
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
      	  
      	  <form action="addcart">
      	 <input type="submit"  value="Checkout">
		</form>
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
      	 	<form action="addcart">
				<input type="submit" value="Checkout">
			</form>	 
			
      	</div>
	</div>
</div>