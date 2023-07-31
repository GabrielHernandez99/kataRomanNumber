public class RomanNumber {

    public RomanNumber() {
    }

    public String romanConverter (int number){
        if(number<=3){
            return (addI(number));
        }
        switch (number){
            case 4:
                return "IV";
            case 5:
                return "V";
        }
        return null;
    }
    private String addI(int num){
        String res="";
        for(int i=1;i<=num;i++){
            res +="I";
        }
        return res;
    }
}
