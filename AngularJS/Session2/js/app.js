var myApp = angular.module("MyApp",['ui.bootstrap']);

myApp.controller('customerListControl', ['$scope', '$http',function ($scope, $http) {
  $http.get('json/customer.json').success(function(data) {
    $scope.customers = data;
    $scope.totalItems = $scope.customers.length;
  }).error(function() {
    console.log("error");
  });
  $scope.currentPage = 1;
  $scope.itemsPerPage = 7;

}]);
