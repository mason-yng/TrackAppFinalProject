# TrackAppFinalProject
To download this application, click on "code -> downlaod zip" or clone... Once you have it downloaded you can import and unzip it straight into Android Studio. To do so in Android Studio go to 

"File -> New Project -> Import Project and select the newly unzipped folder -> press OK" and the gradle should be built automatically.

<img width="150" alt="Screen Shot 2021-04-22 at 9 38 57 PM" src="https://user-images.githubusercontent.com/82237127/115806352-9f7ad480-a3b4-11eb-9f0a-9c2e26158087.png"> <img width="155" alt="Screen Shot 2021-04-22 at 9 42 50 PM" src="https://user-images.githubusercontent.com/82237127/115806358-a1449800-a3b4-11eb-80f6-ad640b034416.png">
<img width="154" alt="Screen Shot 2021-04-22 at 9 44 39 PM" src="https://user-images.githubusercontent.com/82237127/115806366-a3a6f200-a3b4-11eb-9b97-f35971db4d99.png">
<img width="156" alt="Screen Shot 2021-04-22 at 9 45 04 PM" src="https://user-images.githubusercontent.com/82237127/115806369-a4d81f00-a3b4-11eb-8f6b-38d587726aed.png">
<img width="154" alt="Screen Shot 2021-04-22 at 9 45 47 PM" src="https://user-images.githubusercontent.com/82237127/115806372-a6094c00-a3b4-11eb-9653-407cd86f2a16.png">
<img width="157" alt="Screen Shot 2021-04-22 at 9 47 21 PM" src="https://user-images.githubusercontent.com/82237127/115806376-a86ba600-a3b4-11eb-9ab3-9a567f8887b8.png">
<img width="157" alt="Screen Shot 2021-04-22 at 9 47 02 PM" src="https://user-images.githubusercontent.com/82237127/115806348-9c7fe400-a3b4-11eb-958d-db47be070419.png">

There are eight .java files each containing the code for each activity XML. There are 10 .XML files. I included screenshots of the activity screens.
There are buttons to move between each and every screen and an instructions screen to further offer help. The layout is very user friendly and easy to see. 

Currently in its beta stages. The proposal indicated that there will be bonus features and more tracking features as the app is further developed. It has its base features of tracking and needs however an issue is that the information is not retained properly. Saving the information on the screen only lasts within the activity and not when the application is closed or when the activity is switched. You will get a clear example of this in the mood tracker. 

My goal is to develop this project into a fully functional weekly usage tracking app. Right now it serves some purpose for its minimal tracking and calculating... however it lacks the full week usage currently. 

Most bugs have been dealt with through multiple tests however there are some that have not been completely dealt with.
Finance activity screen for calculating the 6 categories if all 6 categories aren't filled in with a number, the app crashes. 
If the weekly or monthly deduction buttons are pressed before any input is put in it also crashes. 

Mood, Finance and Calorie tracking for weekly purposes does not currently work fully as the information is lost after application is closed. However, the calculators provided are functioning. 

Any other bugs identified please contact me so I can fix it. 

Track your fitness, mood, finance and calories. Soon to have more tracking features as well as saving the information for weekly use. 

My project logo consists of 4 borrowed images that I put together and adjusted in photoshop. These 4 images are the 4 categories that can be used within the app right now. 

There is an instructions screen giving a basic description on how to maneuver through the app and each activity screen is pretty self explanatory and if not, there is usually a prompt or instruction there to help out. 

**Mood Screen:**

As mentioned earlier about the saving of the information. If you press save info for the mood screen of what you have inputted. It only stays saved if you stay within that activity. So if you stay within the activity and change your answers and then press reveal saved, you will get your original inputs back but if you exit the app or the screen, that information is lost again. 

onSaveInstanceState was used to save activity and it was supposed to be brought back with onRestoreInstanceState but it was not fully functioning. Same applies partially for Finance screen and it applies for the Calorie screen.

**Fitness Screen:**

Set your goals and then click start to get your plus and minus buttons. If you only want to set a goal for one workout that is fine because when you press start, it reveals all the workouts' plus and minus buttons and it sets the goals with no input to 0. 
When you deduct your goal down to 0, it will reveal a checkmark that you've completed it. If you have a large goal and do not want to deduct by ones, hop back into the goal input and retype the number. Instead of pressing the '-1' 30 times from 100. You can retype it as 70. When you add numbers back onto the goal or retype the goal. As soon as the + or - is pressed, the checkmark will disappear. You have the option of writing your own workout in as well but there will not be an image with that one.

**Calorie Screen:**

Type in your calorie intake for any day of the week. 

Soon to be added!! (Full saving of the info again...) but also a full diet plan suited for multi purposes such as bulking up, losing weight, runners, lifters, etc as well as a calculator for the amount of calories taken in. Calculator will be made with different food categories i.e protein, fruits and veggies, dairy. 

**Finance Screen:**

Currently has 5 prime categories many people budget for and need to calculate costs as well as a 6th category for anything extra. Type in 6 values and calculate to get your total amount in dollars. 
Weekly budget and monthly budget works as it is supposed to when the values are typed in but the budget values do not stay when the activity is left or when the application is closed. 

Fitness image: https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.kissclipart.com%2Fgym-pictogram-clipart-fitness-centre-physical-fitn-2vw9y7%2F&psig=AOvVaw2d0J4ax7BOMpHrjuab_dVc&ust=1616108846731000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLj6q-a4uO8CFQAAAAAdAAAAABAE
Finance image: https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.vectorstock.com%2Froyalty-free-vector%2Fpersonal-finance-cartoon-vector-24477698&psig=AOvVaw1toCh72BvD9DyEB35wrmvu&ust=1616118270330000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJDQn-3buO8CFQAAAAAdAAAAABAD
Calorie image: https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.weightlossresources.co.uk%2Fcalories%2Fburning_calories%2Fburn_more_calories.htm&psig=AOvVaw3isNzkrf5DopbbDoVTjLXP&ust=1616123419473000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLCLk87vuO8CFQAAAAAdAAAAABAD
Mood tracker image: https://www.google.com/url?sa=i&url=https%3A%2F%2Fmagicwareapps.wordpress.com%2Fportfolio%2Fmood-tracker-journal-activity-and-food-diary%2F&psig=AOvVaw1-bZYtnf_5Ew-iuhUvsOO4&ust=1616123500677000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCKDM86zvuO8CFQAAAAAdAAAAABAD
