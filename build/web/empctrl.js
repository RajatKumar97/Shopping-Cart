var app = angular.module('myApp', []);
app.controller('controller', function($scope, $http) {
	/*$scope.flag = false;
	$scope.flag1=false;
	
	$scope.getEmployee = function() {
	    $http.get("http://localhost:8080/SpringEmpRESTWebService/employee/"+$scope.id)
	    .success(function(response) {$scope.employee=response.employees;});
	    $scope.employees=null;
	    $scope.flag = true;
	    $scope.flag1 = false;
	};
	$scope.all = function() {
    	$http.get("http://localhost:8080/SpringEmpRESTWebService/employees")
    	.success(function(response) {$scope.employees=response.employees;});
    	$scope.flag = false;
    	$scope.flag1 = true;
    	
	};*/
	$scope.reset = function() {
	    $scope.employees=null;
	    $scope.id=null;
	    $scope.name=null;
	    $scope.pass=null;
	    
	    $scope.gender=null;
	    $scope.phn=null;
	    $scope.age=null;
	    $scope.flag = false;
	};
	
	$scope.submit=function(){
		$http.get("http://localhost:8080/SpringEmpRESTWebService/insert/"+$scope.id+"/"+$scope.name+"/"+$scope.phn+"/"+$scope.gender+"/"+$scope.age+"/"+$scope.pass)
		.success(function(response) {alert("Successfully inserted");
		$scope.reset();});
		
	}
	$scope.login=function(){
		$http.get("http://localhost:8080/SpringEmpRESTWebService/login/"+$scope.id+"/"+$scope.pass)
		.success(function(response) {$scope.employee=response.employees;
		if($scope.employee.pass==$scope.pass){
			$scope.flag=true;
			alert("Hello "+$scope.employee.name);
			$scope.reset();
			window.location="display.jsp";


		}
		else{
			$scope.flag=false;
			alert("Username or password incorrect");
			$scope.reset();
			}
		})
		.failure(function(response){alert("Something wrong with the connection")});
		
		
	}
	
});
