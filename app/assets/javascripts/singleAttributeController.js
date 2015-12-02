var SingleAttributeController = function($scope, $http, $routeParams, $location) {
    'use strict';

    if ($routeParams.id) {
        $http.get("/api/attributes/" + $routeParams.id).then(function(res) {
            $scope.attribute = res.data;
        });
    } else {
        $scope.attribute = {};
    }

    $scope.save = function(attribute) {
        if (attribute.id) {
            $http.put("/api/attributes/" + attribute.id, attribute).then(redirectToListPage);
        } else {
            $http.post("/api/attributes", attribute).then(redirectToListPage);
        }
    };

    function redirectToListPage() {
        $location.path("/variaveis");
    }

};

angular.module("xpertyapp").controller('SingleAttributeController', ['$scope', '$http', '$routeParams', '$location', SingleAttributeController]);
