public class EmptyBox extends Tile{
    enum empty_enum {empty, near}
    private empty_enum emptyStatus;
    EmptyBox()
    {
        super();
        emptyStatus = empty_enum.empty;
    }

    public void setEmptyNearStatus() {
        emptyStatus = empty_enum.empty;
    }
    public void setNearStatus(){
        emptyStatus = empty_enum.near;
    }

    public empty_enum getEmptyStatus() {
        return emptyStatus;
    }

}
