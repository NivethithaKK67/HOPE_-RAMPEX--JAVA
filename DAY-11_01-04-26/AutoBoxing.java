public class AutoBoxing {
    public static void main(String[] args) {
        // int a = 10;
        // Integer obj = a;//Integer.valueOf(a)==>manual AutoBoxing
        // System.out.println(obj);
    //     Integer a=1000;
    //     Integer obj = 1000;
    //     System.out.println(a==obj);//==>false because of cache memory,==>it checks both the value and reference
    //     System.out.println(a.equals(obj));//==>true because of value comparison,==>it checks only the value
    Float b = 126.5F;
    Float c = 120.5F;
    System.out.println(b==c);//==>false because of cache memory,==>it checks both the value and reference
}
}//what is reference?=>reference is the address of the object in memory,==>it is used to access the object in memory,==>it is used to compare the objects in memory,==>it is used to check if two objects are same or not,==>it is used to check if two objects are equal or not,==>it is used to check if two objects are same or not,==>it is used to check if two objects are equal or not,==>it is used to check if two objects are same or not,==>it is used to check if two objects are equal or not,==>it is used to check if two objects are same or not,==>it is used to check if two objects are equal or not,==>it is used
//what is autoBoxing?=>autoBoxing is the process of converting a primitive data type to its corresponding wrapper class object,==>it is done automatically by the compiler,==>it is done when we assign a primitive value to a wrapper class variable,==>it is done when we pass a primitive value to a method that expects a wrapper class object,==>it is done when we return a primitive value from a method that returns a wrapper class object,==>it is done when we use a primitive value in an expression that expects a wrapper class object,==>it is done