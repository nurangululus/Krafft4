package day10_UnaryLogicalOperantpreviem;

public class C05_LogicalOperators {
    public static void main(String[] args) {

    String name = "Ayse" ;
    int age = 30;
    String citizen= "turkey";

    //18+,turkey

        boolean isEligibleVote = age>=18  && citizen =="turkey";
        //                          34>=18 &&"turkey"=="turkey"
        //                         true    &&   true

        System.out.println("isEligibleVote = " + isEligibleVote);

        System.out.println("--------------------");

        String name2 = "umit";
        int findexScore = 800;
        int age2 = 43;
        int income = 40000;

        //boolean isEligibleForloan = findexScore>=1500  && 18 <=age2   &&    30000;

        //System.out.println(name2+" is eligible for loan :"+ isEligibleForloan);

         String name3 = "Hatice";
         int age3 = 21;
         char gender ='F';  //Female Male

        boolean isEligble = age >=18 &&(gender =='M' || gender == 'F');
        //                     true  &&  ( false  ||  true )
        //                              true    &&   true
        //                                     true

        System.out.println("is eligble to be selected as MP: " + isEligble);

        System.out.println("--------------------");

        String student = "Ali";
        double gpa = 2.5;
        int familyIncome = 15000;

        boolean isEligibleForScholarship = gpa >=3.5  ||  familyIncome <=20000;

        System.out.println("--------------------");



    }
}
