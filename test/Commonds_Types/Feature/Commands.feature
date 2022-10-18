Feature: Cini_Mitra_Automation 

@default 
Scenario: Verifying CiniMitra Site is Accessable 
	Given Access_the_ browser 
	When  Open_the Page 
	Then  Page should open 
	
 @default
Scenario: Login with valid data 
	Given Click_Login_Button 
	And   Enter_UserName 
	And   Enter_Password 
	When  Click_Login 
	Then  User_Shouldbe_Login 
	And   click Welcome button 
	
  @default
Scenario: Filter the Submited Project 
	Given click and Enter the movie name 
	When  click the submited project 
	Then  page should navigate CAF page 
	And   click Apply button 
	

Scenario: Enter the GENERAL details in CAF page 
	Given Enter the Name Of Producer 
	And  Enter Mobile No 
	And  Enter Email 
	And  Enter Date Of Birth 
	And  Enter Leading Artist Name 
	And  Enter Name Of The Project 
	 

Scenario: Enter the LOCATION DETAILS in CAF Page 
	Given Enter the State 
	And Enter the City 
	And Enter the Ward 
	And Enter the ULB 
	And Enter the Location Type 
	And Enter the District 
	And Enter the Pincode 
	And Enter the Taluk 
	And Enter the Location 
	 