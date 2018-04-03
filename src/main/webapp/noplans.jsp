
<style>

* {
    margin:0;
    padding:0;
 }
 
 .titeplan{
	width:50%;
	height:100%;
	float:left;
 }
 .otherplan{
	width:16%;
	height:100%;float:left;
 }
 
 </style>
<div>

	<div id="header" style="height:18%;width:100%">
		<iframe src="http://ec2-18-188-27-184.us-east-2.compute.amazonaws.com:8080/header.jsp" style="height:100%;width:100%"></iframe>
		<%-- <jsp:include page="header.jsp" />--%>
	</div>
	
	<div id="body" style="height:77%;width:100%">
		
 		<jsp:include page="empty.jsp" />
				

	</div>
	
	<div id="footer"  style="height:5%;width:100%">
	
		<iframe src="http://ec2-18-188-27-184.us-east-2.compute.amazonaws.com:8080/footer.jsp" style="height:100%;width:100%"></iframe>
		<%-- <jsp:include page="footer.jsp" />--%>
	</div>
</div> 

</body>
