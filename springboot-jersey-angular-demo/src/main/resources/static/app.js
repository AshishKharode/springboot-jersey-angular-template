var myApp = angular.module('myApp', ['ui.router']);

myApp.config(function($stateProvider, $urlRouterProvider) {
	$urlRouterProvider.otherwise('/');
    
	$stateProvider
      .state('home', {
        url: '/',
        templateUrl: 'partial/home.html'
      })
      .state('about', {
        url: '/about',
        templateUrl: 'partial/about.html'
      });
});

