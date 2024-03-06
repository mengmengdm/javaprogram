abstract class Tile {
    enum tile_status{
        initial, opened
    }
    //status use to check if the tile has been clicked, and initial means unclicked
    private tile_status status;
    private boolean flag;
    //private Shape shape;  shape is for future ui designs
    public Tile() {
        status = tile_status.initial;
    }

    public void setFlag() {
        flag = true;
    }
    public void releaseFlag(){
        flag = false;
    }
    public void leftClick(){

    }
}
