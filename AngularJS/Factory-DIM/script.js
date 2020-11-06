var application = angular.module("modA",[])
application.factory("counter",function(){
    console.log("Inside Factory");
    counterObj = {};
    var number = 0;
    counterObj.getCounter = function(){
        return number
    }
    counterObj.setCounter = function(counter){
        number=counter
    }
    return counterObj
})
application.controller("operation",function($scope,counter){
    $scope.increment = function(){
        $scope.number = counter.getCounter();
        $scope.number = $scope.number + 1; 
        counter.setCounter($scope.number)
        console.log($scope.number);
    }
    $scope.decrement = function(){
        $scope.number = counter.getCounter();
        $scope.number = $scope.number - 1; 
        counter.setCounter($scope.number)
        console.log($scope.number);
    }
    $scope.number = counter.getCounter()

})
