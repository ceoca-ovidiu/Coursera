package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {

    private String mBusinessName;
    private int mParkingSpaces = 0;
    private static int sTotalOffices = 0;

    public Office(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        sTotalOffices++;

    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces){
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpaces;
        sTotalOffices++;
    }

    public String getBusinessName(){
        return mBusinessName;
    }

    public int getParkingSpaces(){
        return mParkingSpaces;
    }

    public static int getTotalOffices(){
        return sTotalOffices;
    }

    public void setBusinessName(String name){
        this.mBusinessName = name;
    }

    public void setParkingSpaces(int spaces){
        this.mParkingSpaces = spaces;
    }

    @Override
    public String toString(){

        return "Business: " +
                (mBusinessName != null ? mBusinessName : "unoccupied") +
                (mParkingSpaces != 0 ? "; has " + mParkingSpaces + " parking spaces" : "") +
                " (total offices: " + sTotalOffices + ")";


    }

    public boolean equals(Object object){

        if(!(object instanceof Office)){
            return false;
        }

        Office office = (Office) object;

        if(mParkingSpaces == office.getParkingSpaces() &&
                calcBuildingArea() == office.calcBuildingArea()){
            return true;
        }
        return false;

    }

}
