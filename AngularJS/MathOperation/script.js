var app = angular.module("modA",[])
app.factory("MathFactory",function(){
    var mathObject = {}
    mathObject.square = function(number){
        return number*number;
    }
    mathObject.cube = function(number){
        return number*number*number;
    }
    return mathObject
})
app.controller("SquareController",function($rootScope,$scope,MathFactory){
    $rootScope.getSquare = function(){
        $scope.square=true;
        $scope.getValue = MathFactory.square($rootScope.number);
    }
})

app.controller("CubeController",function($rootScope,$scope,MathFactory){
    $rootScope.getCube = function(){
        $scope.cube=true;
        $scope.getValue = MathFactory.cube($rootScope.number);
    }
})