public class Circles {
    float radius;
    public Circles(){
        this.radius=radius;
    }

    public void calculateArea(float radius){
        System.out.println("area is: "+ 3.14*radius*radius);
    }

    public void calculatePerimeter(float radius){
        System.out.println("area is: "+ 2*3.14*radius);
    }
    public static void main(String[] args) {
        Circles c1 = new Circles();
        c1.calculateArea(7);
        c1.calculatePerimeter(7);
        
    }    
}
