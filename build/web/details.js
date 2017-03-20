var app = angular.module('app', []);
app.controller('control', function($scope, $http) {
	$scope.flag = false;
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
    	.success(function(response) {$scope.employees=response.employees;
    	alert("Hi!");});
    	$scope.flag = false;
    	$scope.flag1 = true;
    	
	};
	$scope.reset = function() {
	    $scope.employees=null;
	    $scope.id=null;
	    $scope.flag = false;
	    $scope.flag1=false;
	};
	
	
	
	
	
});
