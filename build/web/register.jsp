<!DOCTYPE html>
<html lang="en-US">
   	<meta http-equiv="X-UA-Compatible" content="IE=edge"></meta>
	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<body>

<div ng-app="myApp" ng-controller="controller"> 
<form id="Form">
<h1>
		Employee Registration Application
</h1>
<h2>
	Emp Id: <input type="text" ng-model="id"><br>
<br>
Name: <input type="text" ng-model="name"><br>
<br>
Phone: <input type="text" maxlength="10" ng-model="phn"><br>
<br>
 Gender:Male <input type="radio" value="M" ng-model="gender">
 Female  <input type="radio" value="F" ng-model="gender"><br>
<br>
Age: <input type="text" ng-model="age"><br>
<br>
Password: <input type="password" ng-model="pass"><br>
<br>
 <!--	<button ng-click="reset()">Reset</button>
	<button ng-click="getEmployee()">Get Name</button>
	<button ng-click="all()">View All</button>
	 --><button  ng-click="submit()">SUBMIT</button>
<br><!--
<table ng-show="flag1">
<tr><th>Emp Id</th><th>Name</th><th>Phone</th><th>Gross</th></tr>


<tr ng-repeat="x in employees">
<td>{{x.empId}}</td><td>{{x.name}}</td><td>{{x.phone}}</td>
</tr>
  
</table>
<br>
	<p ng-show="flag">
		{{ 'Emp Id: ' + employee.id + ' - Name: ' + employee.name }}
	</p> -->
</h2>
  </form>  
</div>


<script src="empCtrl.js" type="text/javascript"></script>


</body>
</html>
