package GroupProject;

abstract class MarksTask2 {
/*    We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning
    the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as its parameters and
    the marks in four subjects as its parameters for student B. Test your code*/

    int markMath;
    int markBiology;
    int markHistory;
    int markPhysics;
    abstract int getPercentage();

}
class A extends MarksTask2{

    A(int markMath, int markBiology, int markHistory) {
        this.markBiology=markBiology;
        this.markHistory=markHistory;
        this.markMath=markMath;
    }

    int getPercentage(){
         int averagePercentage=(markBiology+markHistory+markMath)/3;
         return averagePercentage;
     }
}

class B extends MarksTask2{

    B(int markMath, int markBiology, int markHistory, int markPhysics) {
        this.markBiology=markBiology;
        this.markHistory=markHistory;
        this.markMath=markMath;
        this.markPhysics=markPhysics;
    }

    int getPercentage(){
        int averagePercentage=(markBiology+markHistory+markMath+markPhysics)/4;
        return averagePercentage;
    }
}
class Test {
    public static void main(String[] args) {
        A obj1=new A(95, 80, 92);
        System.out.println(obj1.getPercentage());

        B obj2=new B(98,85,89,80);
        System.out.println(obj2.getPercentage());

    }
}
