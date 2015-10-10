app.factory('events', ['$http', function($http) {
  return $http.get('http://localhost:8080/com.practice.calendar/calendar/services/events')
         .success(function(data) {
        	 console.log(data);
           return data;
         })
         .error(function(data) {
        	 console.log("Error");
        	 return data;
         });
}]);