/*
//groovy is a scripting language which internally include all the java libraries, therefore all java related keywords and functions can be used in groovy script directly
//java libraries come with soap Ui and  and are integrated during the soap ui installation
//similar to echo"vamsi" in linux, system.out.println("vamsi") in java == in groovy we use 
log.info("vamsi"); all prints vamsi
//variable= named memory space allocated at the run time
int x;  // here int is data type and x is variable
int x; // declaration
x=2; // intialization
//data types
String s= "groovy"
// int, string, Date
//def = groovy script key word to define data types
def s= "groovy";
def a= 10;
log.info(a); prints a value
*/ //we can comment whole para using /*...*/

//operators:
//airthematic operators == +,-,*,/,%
def a= 10;
def b=20;
log.info(a+b) // addition of 2 numbers
string s1= "hi";
string s2= "vamsi";
log.info(s1+s2) // concatenation of 2 strings
//unary operators: increment ++, decrement --
def a= 10;
a++
log.info (a)
//assignment operators =

//conditional statements
1. if else
int a=5; // i want to check given number is even or odd
if (a%2 == 0){
    log.info("a is evem number");
}
else{
    log.info("a is odd number");
}
log.info("if condition is completed")

2. if else ladder or nested if
String Env ="SIT"
String URL ="";
if (Env == "SIT"){
    URL= "SIT URL"
}
else if (Env == "UAT"){
    URL= "UAT"; 
}
else{
    URL= "not available"
    log.info("URL")
}

3. switch // switch has better performance compared to ifelse ladder
switch(conditional statements)
{
    case a:
    //statements:
    
    break;

    case b:
    //statements:

    break;

    case c:
    //statements:

    break;

    default: // default case will be executed if no case is satisfied
    //statements
}

//example
String Env ="SIT"
String URL ="";
switch (ENV)
{
    case "SIT"
    URL = " SIT URL"
    log.info (URL);
    break
    case "UAT"
    URL = " UAT URL"
    log.info (URL);
    break
    default :
    URL = "not avilable"
    log.info (URL);
}
