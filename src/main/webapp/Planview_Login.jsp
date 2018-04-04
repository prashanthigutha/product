<!-- Modal content -->
<script src="Planview_Log.js" type="text/javascript"></script>
<script src="pricing.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="cart.css"></link>
<div id="planview_Modal" style="display: block;" class="modal">
	<div class="modal-content">
		<div class="modal-header">
			<span class="close">&times;</span>
			<h2>Enter Details</h2>
		</div>
		<br />
		<div class="modal-body">
			<form action="details">
				<div>

					<div>
						<label for="mail">E-mail:</label> <input type="email" id="mail"
							name="email" /><br>
					</div>
					<div>
						<label for="zcode">Zipcode:</label> <input type="text"
							id="Zipcode" name="zipcode" onblur="emptycheck()" />
					</div>



				</div>
				<div class="modal-footer">
					<input type="submit" value="Ok">
				</div>
			</form>
		</div>
	</div>
</div>


