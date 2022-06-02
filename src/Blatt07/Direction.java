package Blatt07;

public enum Direction {
    NORTHEAST(1,-1,0),
    EAST(1,0,-1);

    private final int deltaX;
    private final int deltaY;
    private final int deltaZ;

    Direction(int deltaX, int deltaY, int deltaZ){
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.deltaZ = deltaZ;
    }
    //dummes beispiel
    public int getDeltaX(){
        if(this == EAST){
            return 1;
        }
        else return 2;
    }



}
