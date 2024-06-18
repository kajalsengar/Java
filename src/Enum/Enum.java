package Enum;

public class Enum {
    enum Direction{
        NORTH,SOUTH ,EAST ,WEST;
    }

    public static void main(String[] args) {
        Direction side= Direction.NORTH;
        if (side==Direction.SOUTH) {
            System.out.println("its north side direction");
        }else {
            System.out.println("north directon");
        }
    }
}
