package homeWorks.Task1_8;

public class HW8 {

    /*
    Create a public class called Cube without a constructor which gets one single private integer variable Side, a getter GetSide() and a setter SetSide(int num) method for this property. Actually, getter and setter methods are not the common way to write this code in C#. In the next kata of this series, we gonna refactor the code and make it a bit more professional...
    */
    private int Side;

    public int getSide() {
        return Side;
    }

    public void setSide(int side) {
        Side = side;
    }
     /*
    Write a class Block that creates a block (Duh..)

##Requirements

The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.*/

    //private int[] arr;
    int width;
    int length;
    int height;
    int Volume;
    int SurfaceArea;


    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public HW8(int[] arr) {
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
        }
    public int getVolume(){
        Volume = width*length*height;
        return Volume;
    }
    public int getSurfaceArea (){
        SurfaceArea = 2*width*length + 2*length*height + 2*width*height;
        return SurfaceArea;
    }


    //width, length, height

    public static void main(String[] args) {

        System.out.println( Kata.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
    }


}
