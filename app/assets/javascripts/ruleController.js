var RuleController = function($scope, $http) {
    'use strict';

    $http.get("/api/rules").then(function(res) {
        $scope.rules = res.data;
    });

    $scope.remove = function(id) {
        var req = {
            method: "DELETE",
            url: "/api/rules/" + id
        };
        return $http(req).then(function(res) {
            $scope.rules = res.data;
        });
    };

};

angular.module("xpertyapp").controller('RuleController', ['$scope', '$http', RuleController]);
