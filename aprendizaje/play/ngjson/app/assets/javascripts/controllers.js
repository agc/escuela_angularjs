'use strict';

/** Controllers */
angular.module('productosNG.controllers', []).
    controller('ProductosCtrl', function ($scope, $http) {
      $scope.codigosEan=[]
      $scope.codigosEan=$http.get("/codigos").then(function(resultado){
          $scope.codigosEan=resultado.data;
      });

        $scope.productos=[]
        $scope.productos=$http.get("/productos").then(function(resultado){
            $scope.productos=resultado.data;
        });

    });