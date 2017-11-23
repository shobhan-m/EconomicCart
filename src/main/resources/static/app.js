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
	
	
	
	$scope.addwatch = function(product){
		debugger;
		//var PriceRequest  = { "productId":product.productId, "emailId":"dhirajkishores@gmail.com", "fromPrice":50,"toPrice":product.productPrice,"selectDaysRange":10,"comment":"Product watched" };
//		PriceRequest.productId = product.productId;
////		PriceRequest.emailId = $scope.myEmail;
//		PriceRequest.emailId = "dhirajkishores@gmail.com";
////		PriceRequest.fromPrice = $scope.priceFrom;
//		PriceRequest.fromPrice = 50;
//		PriceRequest.toPrice = product.productPrice;
//		PriceRequest.selectDaysRange = 10;
//		PriceRequest.comment = "Product watched";
		//console.log(JSON.stringify(PriceRequest))
		$http.get("e1/priceRequest/getPriceRequest").success(

		function(response) {
			alert("Product add to watched Successfully")
			$state.go("productslist");
				angular.element('.closeone').trigger('click');
		//fnLoadProductDetails();

		console.log(responce);

		}).error(function(response) {

		//alert("error "+JSON.stringify(response));

		}) 
	
	}
	
});