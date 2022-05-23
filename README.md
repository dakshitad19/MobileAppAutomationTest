# MobileAppAutomationTest


TITLE
APK automation using Espresso
Deliverables: 
•	Framework – Espresso 
•	Test cases are separated with different scenarios, there can be single class file but public methods of each test is different
LANGUAGE
 JAVA

BUILD AUTOMATION TOOL
Gradle

 Tool
Android Studio

IDE 
Intellj

PROJECT STRUCTURE DETAILS 
 
1.	Location of Test files = src/androidTest/java/com/freenow/android_demo/LocationTest.java
2.	Main Activity location - com/freenow/android_demo/activities/MainActivityTest.java
3.	CircleCi is also present in the Root Directory 


REQUIREMENT #1
4.	Location - src/androidTest/java/com/freenow/android_demo/LocationTest.java
1.	#1 – Located the id of username &password with onView() , perfom action then the Assertion 
2.	
REPORT GENERATION (ALLURE)
1.	If using Inellj import the framework from Github run following commands
•	Build the gradle file 
2.	Launch the emulator through AVD manager 





CREATED_BY
Dakshita Dhaundiyal
dakshitad19@gmail.com











UI Test Scenarios for Login Page
1.	Verify that all the labels and controls including text-boxes, buttons, and links are present on the Login page.
2.	Verify that the application’s UI is responsive i.e. it should adjust to different screen resolutions and devices.
3.	Check that the font type and size of the labels and the text written on the different elements should be clearly visible.


Functional Test Scenarios for Login Page
1.	Verify that as soon as the login page opens, by default the cursor should remain on the username textbox.
2.	Verify that the user is able to navigate or access the different controls by pressing the ‘Tab’ key on the keyboard.
3.	Check if the password is in masked form when typed in the password field.
4.	Check if the password can be copy-pasted or not.
5.	Verify that the user is able to login by entering valid credentials and clicking on the ‘Login’ button
6.	Verify that the user is able to login by entering valid credentials and pressing Login key.
7.	Check that the user is not able to login with an invalid username and password.
8.	Verify that the validation message gets displayed in case the user leaves the username or password field as blank.
9.	Check that the validation message is displayed in the case the user exceeds the character limit of the user name and password fields.




![image](https://user-images.githubusercontent.com/32579088/169860491-125c94ea-641b-4f7a-9c24-bda802498164.png)
