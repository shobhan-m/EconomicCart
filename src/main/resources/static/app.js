var myapp = angular.module('shoppingCart',['ui.router']);

myapp.config(function($stateProvider,$urlRouterProvider) {
  
  $stateProvider
    .state('login', {
      url: "/login",
      templateUrl: "partials/login.html",
      controller: 'login'
    })
    
    .state('productslist', {
      url: "/productslist",
      templateUrl: "partials/productslist.html",
      controller: 'productslist'
    });
    $urlRouterProvider.otherwise("/login");
});

myapp.run(function ($rootScope){
	
	$rootScope.hello = true;
	
});

myapp.controller('login',function ($scope,$state,$rootScope,$http){
	$scope.fnLogin = function(){
		alert(12345)
		var emailId = $scope.emailId;
		var pwd = $scope.pwd;
		
		$http.get("v1/ecart/validateUser/test@nisum.com").success(
				function(response) {
					alert(response);
				}).error(function(response) {
			alert("error "+JSON.stringify(response));
		})
		
		
		$state.go("productslist");
	}
	
});

myapp.controller('productslist',function ($scope,$state,$rootScope){
	
});