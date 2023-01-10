package Lab_03;
public class Jim {
    public static void main(String[] args) {
/* 
Jim is a 40-year-old man. Life is tough on Jim. He works as a plumber. He is divorced and has 8
children. He earns 700 a week but needs 800 a week to support his ex-wife and children. He was
hoping to pass an exam which would enable him to earn more, but unfortunately poor Jim failed it
with a score of 27.5
 */

String name  = "jim";
int age = 40;
String gender = "man";
String pronoun = "he";
String profession = "plumber";
String maritalStatus = "divorced";
int numOfChilds = 8;
int wage = 700;
int requiredIncome = 800;
double score = 27.5;

String statement 
    = name + " is a " 
    + age + "-year-old " 
    + gender + ". Life is tough on " 
    + name + ". " 
    + pronoun + " works as a " 
    + profession + ". " 
    + pronoun + " is " 
    + maritalStatus + " and has" 
    + numOfChilds + "\nchildren. " 
    + pronoun + " earns " 
    + wage + " a week but needs " 
    + requiredIncome + " a week to support his ex-wife and children. " 
    + pronoun + " was \nhoping to pass an exam which would enable him to earn more, but unfortunately poor " 
    + name + " failed it \nwith a score of " 
    + score;

System.out.println(statement);

    }
}
