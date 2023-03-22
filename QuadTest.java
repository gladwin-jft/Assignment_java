class Quadrilateral //Define a class named Quadrilateral,
{
    //it has length & breadth data members
    int length;
    int breadth;

    //a constructor and a method to display the dimensions
    Quadrilateral(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public String dimension()
    {
        return "\nLength : " + this.length + " Breadth : " + this.breadth;
    }
}
class Rectangle extends Quadrilateral//A class named Rectangle which inherits Quadrilateral 
{
    

    Rectangle(int length, int breadth)
    {
        super(length, breadth);
        
    }
    //defines methods for calculating area and perimeter.
    public int area()
    {
        return length * breadth;
    }
    public int perimeter()
    {
        return length + breadth;
    }
}
class Cube extends Quadrilateral//Define another class name Cube which also inherits Quadrilateral
{
    int height;//defines height data member

    Cube(int height , int length, int breadth)
    {
        super(length, breadth);
        this.height = height;
    }
    //methods for calculating volume and displaying dimensions.
    public int volume()
    {
        return height * length * breadth;
    }

    @Override public String dimension()
    {
        return super.dimension() + " height: " + this.height;
    }
    

}
public class QuadTest 
{
    public static void main(String [] args)
    {
        //Define another class named QuadTest with main Function

        Rectangle r1 = new Rectangle(5 , 6);
        Rectangle r2 = new Rectangle(7, 2);
        Cube c1 = new Cube(9, 9, 9);
        Cube c2 = new Cube(7, 7, 7);

        //in it create two Rectangle and two Cube objects, display their dimensions and 
        //display the area & perimeter of the rectangles and volume of cubes.

        System.out.println("Rectangle 1: ");
        r1.dimension();
        System.out.println("area : " + r1.area());
        System.out.println("perimeter : " + r1.perimeter());
        System.out.println("");

        System.out.println("Rectangle 2: ");
        r2.dimension();
        System.out.println("area : " + r2.area());
        System.out.println("perimeter : " + r2.perimeter());
        System.out.println("");

        
        
        System.out.println("Cube 1: ");
        System.out.println("Volume : " + c1.volume());
        System.out.println("Dimensions :" + c1.dimension());
        System.out.println("");

        
       
        System.out.println("Cube 2: ");
        System.out.println("Volume : " + c2.volume());
        System.out.println("Dimensions : " + c2.dimension());
        System.out.println("");
        
        
        

    }
}