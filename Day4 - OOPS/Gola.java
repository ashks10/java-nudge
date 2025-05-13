class Ciclo{

    private double radius;

           public double getRadius(){
               return radius;
           }
           public void setRadius(double r){
               radius = r;
           }

           public double getArea(){
               return 3.14*radius*radius;
           }

           public double getPerimeter(){
               return 2*3.14*radius;
           }
             public void checkPerimeter(double p) {
                 double peri = getPerimeter();
                 if(Math.abs(peri - p)<0.001){
                     System.out.println("Correct perimeter");
                 }else {
                     System.out.println("Perimeter is absolutely wrong");
                 }
             }
         }

         public void checkArea(double a){
            double area = getArea();
            if(Math.abs(area - a) < 0.001){
                System.out.println("Correct area");
            }else {
                System.out.println("Wrong areae");
            }
         }

public class Gola {
    public static void main(String[] args) {
        Ciclo cir = new Ciclo();

        cir.setRadius(2.45);
        System.out.println(cir.getRadius());
        System.out.println(cir.getArea());
        System.out.println(cir.getPerimeter());
    }
}





