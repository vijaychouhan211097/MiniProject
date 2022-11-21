#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int Menu();       /*Globally declared fuctions*/
void riksha();
void cycle();
void bus();
void bike();
void car();
void pickup();
void truck();
void loadedVehicle();
void ShowDetail();
void Delete();
/*Globally declared variable                       */
/*here, count => used to count total No of vehicle*/
int amount=0,count=0,noOfRiksha=0,noOfBus=0,noOfCycle=0,noOfBike=0,noOfCar=0,noOfPickup=0,noOfTruck=0,noOfLoadedVehicle;

void main() {     
while(1) {       /*infinite loop used to repeat condition to enter vehicles */
switch(Menu()) {
case 1:
      riksha();
      break;
case 2:
      cycle();
      break;
case 3:
      bus();
      break;
case 4:
      bike();
      break;
case 5:
      car();
      break;
case 6:
      pickup();
      break;
case 7:
      truck();
      break;
case 8:
      loadedVehicle();
      break;
case 9:
      ShowDetail();
      break;
case 10:
      Delete();
      break;
case 11:
      exit(0);    //used to exit from loop.
default :
      printf("Invalid choice:\n");

}
}
}
int Menu() 
{             /*Menu here is the HomePage for userInterface with choices*/
int choice;
printf("\nWelcome to the Screen of Toll Plaza\n          Entry Section");
printf("\n1.Enter riksha🛺:");
printf("\n2.Enter cycle🚲:");
printf("\n3.Enter bus🚎:");
printf("\n4.Enter bike🛵🏍️:");
printf("\n5.Enter car🚗:");
printf("\n6.Enter pickup🛻:");
printf("\n7.Enter truck🚚:");
printf("\n8.Enter loadedVehicle🚛:");
printf("\n9.Show status:");
printf("\n10.Delete Data:");
printf("\n11.To Exit");
printf("\n\nEnter your Choice:\n");
scanf("%d",&choice);
return(choice);

}
void Delete() {    /*Delete=> function used to delete all data entered     */
                   /*and Restart Enter new data from begining of the day  */
amount=0;
count=0;
noOfRiksha=0;
noOfBus=0;
noOfCycle=0;
noOfBike=0;
noOfCar=0;
noOfPickup=0;
noOfTruck=0;
noOfLoadedVehicle=0;

}
void ShowDetail()     /*ShowDetail=>Used to show all Entered data Datail   */
                      /*and totalNoOfVehicle  =count                      */
                      /*and amount collection                            */
{
printf("\nNumber of riksha=%d",noOfRiksha);
printf("\nNumber of cycle=%d",noOfCycle);
printf("\nNuber of bus=%d",noOfBus);
printf("\nNumber of bike=%d",noOfBike);
printf("\nNumber of Car=%d",noOfCar);
printf("\nNumber of pickup=%d",noOfPickup);
printf("\nNuber of truck=%d",noOfTruck);
printf("\nNumber of loadedVehicle=%d",noOfLoadedVehicle);
printf("\nTotal Number of vehicle=%d",count);
printf("\nTotal Collection amount = %d",amount);

}
void riksha() {          //used for riksha details
                         //tax = 50Rs.
printf("Entry success✅👍\n");
noOfRiksha++;
amount=amount+50;
count++;

}
void cycle() {          //used for cycle details
                        //tax = 0Rs.
printf("Entry success✅👍\n");
noOfCycle++;
amount=amount+0;
count++;

}
void bus() {          //used for bus details
                      //tax = 100Rs.
printf("Entry success✅👍\n");
noOfBus++;
amount=amount+100;
count++;

}
void bike() {        //used for bike details
                     //tax = 0Rs.
printf("Entry success✅👍\n");
noOfBike++;
amount=amount+0;
count++;

}
void car() {        //used for car details
                    //tax = 70Rs.
printf("Entry success✅👍\n");
noOfCar++;
amount=amount+70;
count++;

}
void pickup() {       //used for pickup details
                      //tax =100Rs.
printf("nEntry success✅👍\n");
noOfPickup++;
amount=amount+100;
count++;

}
void truck() {       //used for truck deatails
                     //tax = 120Rs.
printf("Entry success✅👍\n");
noOfTruck++;
amount=amount+120;
count++;

}
void loadedVehicle() {  //used for loaded vehicle details
                        //tax = 150Rs.
printf("Entry success✅👍\n");
noOfLoadedVehicle++;
amount=amount+150;
count++;

}