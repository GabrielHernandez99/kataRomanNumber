public class RomanNumber {

    public RomanNumber() {
    }

    public String romanConverter (int number){
        switch (number){
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
        }
        return null;
    }
}
