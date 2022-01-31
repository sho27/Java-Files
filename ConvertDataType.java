public class ConvertDataType {
  public static void main(String args[]) {
    int i_int = 56;
    double d_double = i_int;   //implicit type conversion

    double e_double = 78.98632;
    
    //Explicit type casting
    int j_int = (int) e_double;  
    long l_long = (long) e_double;
    char c_char = (char) e_double;

    System.out.println(d_double);
    System.out.println(j_int);
    System.out.println(l_long);
    System.out.println(c_char);
  }  
}
