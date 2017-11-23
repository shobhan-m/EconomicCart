var myapp = angular.module('shoppingCart', [ 'ui.router' ]);

myapp.config(function($stateProvider, $urlRouterProvider) {

	$stateProvider.state('login', {
		url : "/login",
		templateUrl : "partials/login.html",
		controller : 'login'
	})

	.state('productslist', {
		url : "/productslist",
		templateUrl : "partials/productslist.html",
		controller : 'productslist'
	});
	$urlRouterProvider.otherwise("/login");
});

myapp.run(function($rootScope) {

	$rootScope.hello = true;

});

myapp.controller('login', function($scope, $state, $rootScope, $http) {
	$scope.fnLogin = function() {
		var emailId = $scope.emailId;
		var pwd = $scope.pwd;

		$http.get("v1/ecart/validateUser/test@nisum.com").success(
				function(response) {
					//fnLoadProductDetails();
					$state.go("productslist");
				}).error(function(response) {
			// alert("error "+JSON.stringify(response));
		})

		
	}

	$scope.fnLoadProductDetails = function() {
		// http://localhost:8080/ECart/v1/ecart/product
		$http.get("v1/ecart/product").success(function(response) {
			// fnLoadProductDetails();
			$scope.products = response;
		}).error(function(response) {
			// alert("error "+JSON.stringify(response));
		})
	}

});

myapp.controller('productslist', function($scope, $state, $rootScope, $http) {

	
	
	$http.get("v1/ecart/product").success(function(response) {
		// fnLoadProductDetails();
		$scope.products = response;
	}).error(function(response) {
		// alert("error "+JSON.stringify(response));
	})
});