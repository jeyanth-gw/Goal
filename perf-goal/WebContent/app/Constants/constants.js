(function(){
	
	var goalApp = angular.module('goalApp');
	
	goalApp.constant('appService',{
		imageURL: '/RestTemplate/service/names/image',
		employeeListURL: '/RestTemplate/service/names/getEmployeeList',
		resumeLinkURL: '/RestTemplate/service/names/getResume/',
		uploadURL: '/RestTemplate/service/names/upload',
		utilGoalURL: '/RestTemplate/service/names/goals/UtilizationGoal',
		pracAreaURL: '/RestTemplate/service/names/goals/Practice%20Area%20Goal',
		profDvpURL: '/RestTemplate/service/names/goals/Professional%20Development%20Goal',
		genURL: '/RestTemplate/service/names/goals/General%20Goal',
		evalURL: '/RestTemplate/service/names/goals/Evaluation',
		contribURL: '/RestTemplate/service/names/contribution',
		ptoURL: '/RestTemplate/service/names/ptoDetails',
		getNotesURL: '/RestTemplate/service/names/getNotes/1',
		updateNotesURL: '/RestTemplate/service/names/updateNotes/1',
		prevYrsURL: '/RestTemplate/service/names/getPrevYearsGoal'
	});
	
	goalApp.constant('chartAttributes',{
		spiderTitle: 'Goals Across Criteria',
		spiderCategoryProject: 'Project',
		spiderCategoryProf: 'Professional',
		spiderCategoryOrg: 'Organization',
		spiderCategoryGen: 'General',
		spiderCategoryUtil: 'Utilization',
		spiderName: 'Years Rating'
	});
	
	goalApp.constant('factoryData',{
		
	});
	
	goalApp.constant('filterNames',{
		revertNewLine: 'revertNewLine',
		splitColon: 'splitColon'
	});
	
}());