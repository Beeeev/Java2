# MultiThreading

### Instructions:
- Create a Value class that contains a private integer number field, a private lock field and a private condition. It will also contain a pair of methods.
  - One method should create a lock and increment number by a random amount between 0 and 10 unless the addition will cause number to exceed the maximum of 10. If the addition would cause the number to exceed the maximum the method should release the lock by waiting for number to decrease.
  - One method should create a lock and decrease number by a random amount between 0 and 10 unless the subtraction will cause number to go below the minimum of -10. If the subtraction would cause the number to drop below the minimum the method should release the lock by waiting for number to increase.
  - Each time either method waits or executes it should print the results.
- Create a ValueIncrease task class which will contain a run() method that calls the increment method of Value 10 times. In between each call it should sleep for a random amount of time between 0 and 250 milliseconds.
- Create a ValueDecrease task class which will contain a run() method that calls the decrease method of Value 10 times. In between each call it should sleep for a random amount of time between 0 and 250 milliseconds.
- Create a ValueUser class whose main method creates a Value, a thread containing a ValueIncrease task and a thread containing a ValueDecrease class. It should also start the threads after they are created.
- NOTE: Because of the way the program is designed it is possible that the last thread could be stuck waiting for ever. For example, if the second to last thread running is decrement and it subtracts 2 from the number to make number 3. If the increment thread is the last thread to run and it wants to add 9 it will go into the wait state because adding 3 to 9 would cause number to go to 12 and exceed the allowed maximum. The increment thread will end up waiting forever since no more decrement threads are left to run. You do not have to resolve this problem.
- NOTE: Number your tasks as was done in the example below so you know which one is executing.
- Insert a comment at the top of the code containing your name, the chapter number, lab number and the date the program was created.

### Example Output:
![image](https://user-images.githubusercontent.com/17011204/205147797-0a3d0639-15e8-4d12-87a7-626d6c7e8795.png)


### Grading:
4 – General, compiles, comments, proper indentation, etc  
6 – Value class increment method  
6 – Value class decrement method  
4 – ValueIncrease class  
4 – ValueDecrease class  
4 – ValueUser class  
 
