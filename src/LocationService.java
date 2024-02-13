public class LocationService {

    int x, y;
    private Location location;

    public LocationService(Location location){
        this.location= location;
    }

    public Location getLocation(){
        return new Location(location.getX(), location.getY());
    }
}
