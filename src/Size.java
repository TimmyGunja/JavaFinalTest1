public enum Size {
    XXS ("XXS"),
    XS  ("XS"),
    S   ("S"),
    M   ("M"),
    L   ("L");

    String classicSize;
    int euroSize;

    Size(String classicSize){
        this.classicSize = classicSize;
        this.euroSize = getEuroSize(classicSize);
    }

    public String getDescription(){
        if (classicSize.equals("XXS"))
            return "Детский размер";
        return "Взрослый размер";
    }

    public int getEuroSize(String classicSize){
        int euroSize = 36;
        if (classicSize.equals("XXS"))
            euroSize = 32;
        else if (classicSize.equals("XS"))
            euroSize = 34;
        else if (classicSize.equals("S"))
            euroSize = 36;
        else if (classicSize.equals("M"))
            euroSize = 38;
        else if (classicSize.equals("L"))
            euroSize = 40;
        return euroSize;
    }

    public static void main(String[] args) {
        Size small = Size.XXS;
        Size medium = Size.M;
        System.out.println(small.getDescription());
        System.out.println(medium.getDescription());
        System.out.println(medium.euroSize);
    }
}



