<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
</head>
<body style="background-color:linen">



<div ng-app="app" ng-controller="control" style="text-align:center"> 
<form id="Form">
<h1 style="color: maroon; text-align:center;">
		Employee Details
</h1>
<h2>
	Emp Id: <input type="text" ng-model="id"><br>
<br>

	<button ng-click="reset()">Reset</button>
	<button ng-click="getEmployee()">Get Name</button>
	<button ng-click="all()">View All</button>
	<br>


  <table ng-show="flag1">
<tr><th>Emp Id</th><th>Name</th><th>Phone</th><th>Gross</th></tr>


<tr ng-repeat="x in employees">
<td>{{x.empId}}</td><td>{{x.name}}</td><td>{{x.phone}}</td>
</tr>
  
</table>
<br>
	<p ng-show="flag">
		{{ 'Emp Id: ' + employee.id + ' - Name: ' + employee.name }}
	</p> 


</h2>
  </form>  
</div>


<script src="details.js" type="text/javascript"></script>



</body>
</html>
