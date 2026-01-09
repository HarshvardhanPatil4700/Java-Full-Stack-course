// A method is a block of code that performs a specific task and is executed only when it is called.
// Format :
// returnType methodName(parameters) {
      // code to be executed
// }

class Computer {
    public void playMusic() {  // void is datatype which does not return.
        System.out.println("Playing Music");
    }
    
    public void playVideo() {
        System.out.println("Playing Video");
    }

    public String getData(int rollNo) { // the rollNo is parameter(Variables defined in the method definition)
        if(rollNo > 0 && rollNo <= 100) {
            System.out.println("Fetching Data of Roll No. " + rollNo);
            return "data";
        }
        else {
            return "Enter valid Roll No.";
        }
    }
}
public class Methods {
    public static void main(String[] args) {//main is also a method (special) because: It is the entry point of a Java program.Execution of a Java program starts from main
        Computer c = new Computer();
        c.playMusic();
        c.playVideo();
        String data = c.getData(18); // Here, 18 is argument(actual value) of the parameter 'rollNo'
        System.out.println(data);
    }
}
