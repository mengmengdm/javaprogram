abstract class Tile {
    enum tile_status{
        initial, opened
    }
    //status use to check if the tile has been clicked, and initial means unclicked
    private tile_status status;
    private boolean flag;
    public Tile()
    {
        status = tile_status.initial;
    }

    public void setFlag()
    {
        flag = true;
    }
    public void releaseFlag()
    {
        flag = false;
    }
    public void open(){
        status = tile_status.opened;
    }

    public tile_status getStatus() {
        return status;
    }

    public void setEmptyNearStatus() {

    }
    public void setNearStatus(){

    }
    public EmptyBox.empty_enum getEmptyStatus() {
        return null;
    }
}
