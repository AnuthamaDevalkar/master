<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.error {color .red
	
}
</style>

<script type="text/javascript">
function updateFlag (){
var d1 = new Date();
var d2 = document.getElementById("mdate").innerHTML;
	if(d1 < d2 ) 
		document.getElementById("chkExpired").value = "Y";
	else
		document.getElementById("chkExpired").value = "N";
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trade Store Application</title>
</head>
<body>
	<div align="center">
		<h2>Trade Store</h2>
		<form:form action="save" method="post" modelAttribute="trade">
			<table border="0" cellpadding="5">
				<tr>
					<td>Trade Id :</td>
					<td><form:input path="tradeId" /></td>
					<td><form:error path="tradeId" cssClass="error" /></td>
				</tr>

				<tr>
					<td>Trade Version :</td>
					<td><form:input path="version" /></td>
					<td><form:error path="version" cssClass="error" /></td>
				</tr>

				<tr>
					<td>Counter-Party Id :</td>
					<td><form:input path="counterPartyId" /></td>
					<td><form:error path="counterPartyId" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Book ID :</td>
					<td><form:input path="bookId" /></td>
					<td><form:error path="bookId" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Maturity Date :</td>
					<td><form:input id="mdate" path="maturityDate" onChange="updateFlag()" /></td>
					<td><form:error path="maturityDate" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Expired :</td>
					<td><form:select path="exp" id="chkExpired">
							<form:option  item="Y">Y</form:option>
							<form:option  item="N">N</form:option>
						</form:select></td>
					<td><form:error path="exp" cssClass="error" /></td>
				</tr>
				<tr>
					<td colspan=2><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>