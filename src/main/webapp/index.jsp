<%@ include file="include/header.jsp"%>
<div style="background-color: #f8f8ff">
<center>
<h1>Welcome to REST API WebSite</h1>
<h3>We are Happy to help You</h3>
</center>
</div>
<div class="card">
	<div class="card-body">
		<form action="MyService.java" method="GET">
			
			<button type="submit">SHOW ALL</button>
			
		</form>
	</div>
	
	<div class="card-body">
		<form action="" method="DELETE">
			
			<input type="text" name="DeleteID">
			<button type="submit">Delete</button>
			
		</form>
	</div>
	
	<div class="card-body">
		<form action="" method="GET">
			
			<button type="submit">SHOW ALL</button>
			
		</form>
	</div>
	
	<div class="card-body">
		<form action="" method="GET">
			
			<button type="submit">SHOW ALL</button>
			
		</form>
	</div>
</div>
<%@ include file="include/footer.jsp"%>