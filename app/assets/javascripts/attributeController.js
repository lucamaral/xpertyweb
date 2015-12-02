var AttributeController = function($scope, $http) {
    'use strict';

    $http.get("/api/attributes").then(function(res) {
        $scope.attributes = res.data;
    });

    $scope.remove = function(id) {
        var req = {
            method: "DELETE",
            url: "/api/attributes/" + id
        };
        return $http(req).then(function(res) {
            $scope.attributes = res.data;
        });
    };

};

angular.module("xpertyapp").controller('AttributeController', ['$scope', '$http', AttributeController]);
