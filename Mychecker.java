class Mychecker implements StringChecker{
    @Override
    public boolean checkString(String s){
        return s.length()>5;
    }
}