public class L1
{
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}

//System and String are both predefined classes 

// inner classes why is it public?
//so that JVM can access it from outside

//why static?
//actually when we make objects we make some instance functions which can be called only by object
//i.e we have to create an object and call that function but if we make the function as static we can call it 
// even if we dont have the object actually JVM will call the class and in it main function will be executed.

//now 
//System.out.println("");
//here System is the class 
//whenever you see any class having . after it means that we are calling/access static member like out

//out is static refrence variable and refers to an object so out is like a pointer 

// so think that out is an object anyways it is a pointer which points to an object 
//so out is like a object which is accessing the function println

//one more thing is in java you have to name the file also the same name as your class name