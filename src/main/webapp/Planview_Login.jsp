<!-- Modal content -->
<script src="Planview_Log.js" type="text/javascript"></script>
<script src="pricing.js" type="text/javascript"></script>
<link  rel="stylesheet" type="text/css" href="cart.css"></link> 
<div id="planview_Modal" style="display:block;" class="modal">
	<div class="modal-content"> 
		<div class="modal-header">
			<span class="close">&times;</span>
			<h2>Enter Details</h2>
		</div>
		<br/>
		<div class="modal-body">
			<div>
<form action="/planmain.jsp" get=post>
  <div>
    <label for="mail">E-mail:</label>
    <input type="email" id="mail" name="user_email" /><br>
  </div>
   <div>
    <label for="zcode">Zipcode:</label>
    <input type="text" id="Zipcode" name="zipcode" />
  </div>
			
			 
			 
		</div>
		 <div class="modal-footer">
      	  <input type="submit" value="Ok" onclick="main.jsp">
				
      	</div>
	</div>
</div>
</div>

</form>
 