var XpertyEngineController = function($scope, $http, $location) {

    var index = 0;
    var attributes = [];
    var answers = [];

    var init = function() {
        $http.get("/api/attributes").then(function(res) {
            attributes = [];
            for (var i = 0; i < res.data.length; i++) {
                var attr = res.data[i];
                if (!attr.isGoal) {
                    attributes.push(attr);
                }
            }
            if (attributes.length) {
                index = 0;
                $scope.attribute = attributes[index];
            } else {
                swal({
                    title: "Você não cadastrou variáveis",
                    text: "Você será redirecionado para pagina das variaveis"
                }, function() {
                    $location.path("/variaveis");
                    $scope.$apply();
                });
            }
        });
    };

    $scope.next = function() {
        var answer = $scope.attribute.answer;
        if ($scope.attribute.valueType === "BOOLEAN") {
            if (answer === "true") {
                answer = true;
            } else {
                answer = false;
            }
        }
        answers.push({
            idAttribute: $scope.attribute.id,
            answer: answer
        });
        $http.post("/api/xperty", answers).then(function(res) {
            if (res.data.length) {
                var matchedRules = res.data;
                var text = "";
                for (var i = 0; i < matchedRules.length; i++) {
                    var matchedRule = matchedRules[i];
                    text += "<h4>" + matchedRule.attribute + " - " + matchedRule.value + "</h4>";
                }
                swal({
                    title: "Resultado",
                    text: text,
                    html: true
                }, function() {
                    $location.path("/");
                    $scope.$apply();
                });
            } else {
                if (index + 1 <= attributes.length - 1) {
                    index++;
                    $scope.attribute = attributes[index];
                    $("#answer").focus();
                } else {
                    swal({
                        title: "Sem solução",
                        text: "Nenhuma regra cadastrada bate com as variáveis preenchidas"
                    });
                }
            }
        });
    };

    $scope.reset = function() {
        init();
    };

    init();

};

angular.module("xpertyapp").controller('XpertyEngineController', ['$scope', '$http', '$location', XpertyEngineController]);
