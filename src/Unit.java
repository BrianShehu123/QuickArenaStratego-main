public abstract class Unit extends Actor{
    public static final int MARSHAL_VALUE = 1;
    public static final int GENERAL_VALUE = 2;
    public static final int COLONEL_VALUE = 3;
    public static final int MAJOR_VALUE = 4;
    public static final int CAPTAIN_VALUE = 5;
    public static final int LIEUTENANT_VALUE = 6;
    public static final int SERGEANT_VALUE = 7;
    public static final int MINER_VALUE = 8;
    public static final int SCOUT_VALUE = 9;
    public static final int SPY_VALUE = 10;

    private int actorClass;
    private String name;

    public Unit(int rows, int cols, int actorClass, String name){
        super(rows, cols);
        this.actorClass = actorClass;
        this.name = name;
    }

    
    /** 
     * @return int
     */
    public int getUnitClass(){
        return actorClass;
    }

    
    /** 
     * @return String
     */
    public String getName(){
        return name;
    }
    
    
    /** 
     * @return String
     */
    public String toString(){
        return name + " " + super.toString();
    }
}
