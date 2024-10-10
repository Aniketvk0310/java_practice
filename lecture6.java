import java.util.Scanner;

class box{

    private int length, breadth, heigth;        //instance member variables ... since they are made for every object

    public void setDimension(int l,int b,int h){
        length=l;
        breadth=b;
        heigth=h;

    }

    public void showDimension()
    {
        System.out.println("L = "+length);
        System.out.println("B = "+breadth);          
        System.out.println("L = "+heigth);

    }
}

class Example{

    public static void main(String[] args)
    {
        box smallbox = new box();
        smallbox.setDimension(2,5,7);    // actually here smallbox is not the name of object but a refrence variable
                                         // but we use this smallbox as object... actually there is no method by which we can
                                         //get objects other than this...also there are no name for objects in java

        smallbox.showDimension();
    }
}