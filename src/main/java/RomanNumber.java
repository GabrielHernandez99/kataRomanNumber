public class RomanNumber {

    public RomanNumber() {
    }

    public String romanConverter (Integer number){
        char [] numerosChar= number.toString().toCharArray();
        if(numerosChar.length >=2){
            String secondDigit= secondDigitNumber(Character.getNumericValue(numerosChar[0]));
            String firstDigit= firstDigitNumber(Character.getNumericValue(numerosChar[1]));
            return secondDigit+firstDigit;
        }
        if(numerosChar.length >=1){
            return firstDigitNumber(Character.getNumericValue(numerosChar[0]));
        }


        return null;
    }

    private String secondDigitNumber(Integer numericValue) {
        switch (numericValue){
            case 1:
                return "X";
            case 2:
                return "XX";
        }
        return null;
    }

    private String firstDigitNumber(Integer number){
        switch (number){
            case 4:
                return "IV";
            case 9:
                return "IX";

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
