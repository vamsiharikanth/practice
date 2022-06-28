//looping statements==execute a set of statements  multiple times based on a condition
1. for loop //used when there is a clear starting and clear ending conditions
for(intialization;condition;post increment/post decrement)
{

}
// print 1 to 10 numbers
for (int i=1; i<=10 ; i++)
{
    log.info(i);
}
2. while loop //preferred when a set of statements need to be executed based on condition
while(condition)
{
    ---
    statements
    -----
}
//
int j=1;
while (j<=10)
{
    log.info(j);
    j++;
}
3. do while loop // wont support unlike java
// break statement: i will exit all iterations and comes out the loop
for (int i=1; i<=10 ; i++)
{
    log.info(i);
    break;
}
//continue statement: i will exit the current iteration and continue into next iteration 
for (int i=1; i<=10 ; i++)
{
    log.info(i);
    continue;
}

//print all the numbers below 10 which are not divisble by3
for (int i=1; i<=10; i++)
{
    if (i%3 == 0)
    {
        continue; //break;
    }
    log.info(i);
}
4.for each loop
--------------------------------------------
arrays: collection of memory spaces of similar data types
int [] arr1 = new int[5]; // here int is array which can store 5 memories size
