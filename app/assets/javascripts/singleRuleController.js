var SingleRuleController = function($scope, $http, $routeParams, $location) {
    'use strict';

    if ($routeParams.id) {
        $http.get("/api/rules/" + $routeParams.id).then(function(res) {
            $scope.rule = res.data;
        });
    } else {
        $scope.rule = {};
    }

    $scope.save = function(attribute) {
        if (attribute.id) {
            $http.put("/api/rules/" + attribute.id, attribute).then(redirectToListPage);
        } else {
            $http.post("/api/rules", attribute).then(redirectToListPage);
        }
    };

    function redirectToListPage() {
        $location.path("/regras");
    }

};

angular.module("xpertyapp").controller('SingleRuleController', ['$scope', '$http', '$routeParams', '$location', SingleRuleController]);
