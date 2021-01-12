public class Lab12Test {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        try{
            Thread.sleep(10000); // please remove this to use the calculator comfortably !
                                      // we have been asked to add it
        }
        catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.exit(-1);
    }
}
