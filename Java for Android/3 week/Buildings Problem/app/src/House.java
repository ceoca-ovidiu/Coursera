package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {

    private String mOwner;
    private boolean mPool;


    public House (int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        mPool = false;
    }

    public House (int length, int width, int lotLength, int lotWidth, String owner){
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
    }


    public House (int length, int width, int lotLength, int lotWidth, String owner, boolean pool){
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }


    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public boolean hasPool(){
        return mPool;
    }

    @Override
    public String toString(){

        return "Owner: " + (mOwner!=null ? mOwner : "n/a") +
                (hasPool() ? "; has a pool" : "") +
                (calcLotArea() > calcBuildingArea() ? "; has a big open space" : "");

    }

    public boolean equals( Object object ){

        House house = (House) object;

        if(object instanceof House &&
                mPool == house.hasPool() &&
                calcBuildingArea() == house.calcBuildingArea()){
            return true;
        }
        return false;
    }


    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }
}
