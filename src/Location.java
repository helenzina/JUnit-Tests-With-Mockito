public class Location {

    private int x;
    private int y;

    public Location(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getDistanceFromLocation(Location location){
        return (int) Math.sqrt(Math.pow(location.getX()-this.x, 2) +
                Math.pow(location.getY()-this.y, 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
