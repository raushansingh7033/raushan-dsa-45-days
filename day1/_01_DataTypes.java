public class _01_DataTypes {
    public static void main(String[] args) {
        // data type is used to specify which type of data stored in variable
        // primitive data type -> 8 byte short int long float double char boolean 
        // non primitive data type ->class array String interface enums

        byte b=10; // -2^8 to 2^8 - 1
        short s=129;//-2^16 to 2^16 -1 
        int i=2222; //-2^32 to 2^32-1
        long l=434343;// -2^64 to 2^64-1
        float f=30.00f;//-2^32 to 2^32-1;
        double d=300.44; // -2^64 to 2^64-1
        boolean bool=false; //-2^8 to 2^8 -1 
        char ch='c'; // -2^16 to 2^16-1

        System.out.println("byte"+" " +b);
        System.out.println("short"+" "+s);
        System.out.println("long"+" "+l);
        System.out.println("int"+" "+i);
        System.out.println("float"+" "+f);
        System.out.println("double"+" "+d);
        System.out.println("boolean"+" "+bool);
        System.out.println("char"+" "+ch);
    }
}
