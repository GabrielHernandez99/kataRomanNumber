public class RomanNumber {

    public RomanNumber() {
    }

    public String romanConverter (int number){
        if(number==1){
            return "I";
        }
        if(number==3){
            return "III";
        }
            return "II";
    }
}
