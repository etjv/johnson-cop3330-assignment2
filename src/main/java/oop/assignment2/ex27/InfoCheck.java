package oop.assignment2.ex27;

public class InfoCheck {
    public String validateInput(String firstName, String lastName, String zip, String id) {
        String firstValid = getFirstValid(firstName);
        String lastValid = getLastValid(lastName);
        String ZIPValid = getZIPValid(zip);
        String IDValid = getIdValid(id);
        if(firstValid.equals("") && lastValid.equals("") && ZIPValid.equals("") && IDValid.equals("")){
            return "There were no errors found.";
        }
        else{
            return firstValid + lastValid + ZIPValid + IDValid;
        }
    }

    private String getFirstValid(String fn) {
        if(fn.length() < 2){
            if(fn.length() == 0){
                return "The first name must be at least 2 characters long.\nThe first name must be filled in.\n";
            }
            else{
                return "The first name must be at least 2 characters long.\n";
            }
        }
        return "";
    }

    private String getLastValid(String ln) {
        if(ln.length() < 2){
            if(ln.length() == 0){
                return "The last name must be at least 2 characters long.\nThe last name must be filled in.\n";
            }
            else{
                return "The last name must be at least 2 characters long.\n";
            }
        }
        return "";
    }
    private String getZIPValid(String ZIP) {
        if(ZIP.matches("[0-9]+") && ZIP.length() == 5){
            return "";
        }
        else{
            return "The zipcode must be a 5 digit number.\n";
        }
    }

    private String getIdValid(String id) {
        char[] a = id.toCharArray();
        for(int i = 0; i < 2; i++){
            if((a[i] < 'a' || a[i] > 'z') && (a[i] < 'A' || a[i] > 'Z')){
                return "The employee ID must be in the format of AA-1234.\n";
            }
        }
        if(a[2] != '-'){
            return "The employee ID must be in the format of AA-1234.\n";
        }
        for(int i = 3; i < 7; i++){
            if(a[i] < '0' && a[i] > '9'){
                return "The employee ID must be in the format of AA-1234.\n";
            }
        }
        return "";
    }

}
