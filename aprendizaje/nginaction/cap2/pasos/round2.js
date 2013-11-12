var  myModule = angular.module('Angello', []);

myModule.controller('MainCtrl', function($scope) 
{ 
        
	$scope.stories = [
		{title:'Story 00', description:'Description pending.', criteria:'Criteria pending.', status:'To Do', type:'Feature', reporter:'Lukas Ruebbelke', assignee:'Brian Ford'},
	        {title:'Story 01', description:'Description pending.', criteria:'Criteria pending.', status:'Back Log', type:'Feature', reporter:'Lukas Ruebbelke', assignee:'Brian Ford'},
	        {title:'Story 02', description:'Description pending.', criteria:'Criteria pending.', status:'Code Review', type:'Enhancement', reporter:'Lukas Ruebbelke', assignee:'Brian Ford'},
	        {title:'Story 03', description:'Description pending.', criteria:'Criteria pending.', status:'Done', type:'Enhancement', reporter:'Lukas Ruebbelke', assignee:'Brian Ford'},
	        {title:'Story 04', description:'Description pending.', criteria:'Criteria pending.', status:'Verified', type:'Bug', reporter:'Lukas Ruebbelke', assignee:'Brian Ford'},
		{title:'Story 05', description:'Description pending.', criteria:'Criteria pending.', status:'To Do', type:'Spike', reporter:'Lukas Ruebbelke', assignee:'Brian Ford'}
		]; 
		
		$scope.statuses = [
		            {name:'Back Log'},
		            {name:'To Do'},
		            {name:'In Progress'},
		            {name:'Code Review'},
		            {name:'QA Review'},
		            {name:'Verified'},
		            {name:'Done'}
		        ];
		$scope.types = [
		            {name:'Feature'},
		            {name:'Enhancement'},
		            {name:'Bug'},
		            {name:'Spike'}
		];
		var buildIndex = function(source, property) {
				        var tempArray = [];
				        for(var i = 0, len = source.length; i < len; ++i) {
				            tempArray[source[i][property]] = source[i];
				        }
				        return tempArray;
				    };
		$scope.typesIndex = buildIndex($scope.types, 'name');
	        $scope.statusesIndex = buildIndex($scope.statuses, 'name');	
		
		// se activa cuando se hace click en div.story
		// en la forma form.form_horizontal los div.controls tienen como modelo currentStory.title ...
		$scope.setCurrentStory = function(story) { 
	    			$scope.currentStory = story;
			
				$scope.currentStatus = $scope.statusesIndex[story.status];
				$scope.currentType = $scope.typesIndex[story.type];
		};
				    
		$scope.setCurrentStatus = function(status) {
				            if(typeof $scope.currentStory !== 'undefined') {
				                $scope.currentStory.status = status.name;
				            }
		};
		
		$scope.setCurrentType = function(type) {
				            if(typeof $scope.currentStory !== 'undefined') {
				                $scope.currentStory.type = type.name;
				            }
		};
		
	       $scope.createStory = function() { 
    			
		$scope.stories.push({title:'New Story', 
					description:'Description pending.', 
					criteria:'Criteria pending.',
					status:'Back Log', 
					type:'Feature', 
			    		reporter:'Pending', 
			    		assignee:'Pending'});
				}; 
});   