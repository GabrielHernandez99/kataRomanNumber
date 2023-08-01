public class RomanNumber {

    public RomanNumber() {
    }

    public String romanConverter (int number){
        switch (number){
            case 4:
                return "IV";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 11:
                return "XI";
        }
        if(number<=3){
            return addLetters(0, number, "");
        }
        if(number<=8){
            return addLetters(5,number,"V");
        }
        return null;
    }
    private String addLetters(int count, int number, String word){
        String res=word;
        for(int i=count;i<number;i++){
            res+="I";
        }
        return res;
    }
}
