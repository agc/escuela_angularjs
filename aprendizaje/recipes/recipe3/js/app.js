function MyCtrl($scope) {
  $scope.visible = false;

  $scope.toggle = function() {
    $scope.visible = !$scope.visible;
  };
}