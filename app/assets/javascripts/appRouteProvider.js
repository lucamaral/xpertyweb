var AppRouteProvider = function($routeProvider) {
    'use strict';
    $routeProvider.when('/', {
        templateUrl: '/assets/templates/index.html'
    }).when('/variaveis', {
        templateUrl: '/assets/templates/variaveis.html',
        controller: 'AttributeController'
    }).when('/variaveis/criar', {
        templateUrl: '/assets/templates/editarVariavel.html',
        controller: 'SingleAttributeController'
    }).when('/variaveis/:id', {
        templateUrl: '/assets/templates/editarVariavel.html',
        controller: 'SingleAttributeController'
    }).when('/regras', {
        templateUrl: '/assets/templates/regras.html',
        controller: 'RuleController'
    }).when('/regras/criar', {
        templateUrl: '/assets/templates/editarRegra.html',
        controller: 'SingleRuleController'
    }).when('/regras/:id', {
        templateUrl: '/assets/templates/editarRegra.html',
        controller: 'SingleRuleController'
    }).when('/motor-xperty', {
        templateUrl: '/assets/templates/motor-xperty.html',
        controller: 'XpertyEngineController'
    }).otherwise({
        redirectTo: '/'
    });
};

angular.module("xpertyapp").config(AppRouteProvider);
