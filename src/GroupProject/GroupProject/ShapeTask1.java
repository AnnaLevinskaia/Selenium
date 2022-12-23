package GroupProject;

 public interface ShapeTask1 {

    //Create an Interface 'Shape' with undefined
    //methods as calculateArea and
    //calculatePerimiter. Create 2 classes Circle &
    //Square that implements functionality defined in
    //the Shape Interface. Test your code.

 void calculateArea(int a);
 void calculatePerimiter(int b);


 }

 class Circle implements ShapeTask1{

     public void calculateArea(int a) {
         System.out.println(3.14*a*a);
     }

     @Override
     public void calculatePerimiter(int b) {
         System.out.println(2*3.14*b);
     }

     static class Square implements ShapeTask1{

         public void calculateArea(int a) {
             System.out.println(a*a);
         }

         @Override
         public void calculatePerimiter(int b) {
             System.out.println(4*b);
         }

     }

     public static void main(String[] args) {

         Circle obj=new Circle();
         obj.calculateArea(3);
         obj.calculatePerimiter(2);

         Square obj1=new Square();
         obj1.calculateArea(3);
         obj1.calculatePerimiter(2);

     }
 }
