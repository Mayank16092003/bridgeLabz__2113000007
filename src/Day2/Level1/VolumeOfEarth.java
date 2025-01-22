package Day2.Level1;

public class VolumeOfEarth {
    public static void main(String[] args) {
        int radiusInKm=6378;
        float radiusInMiles=(float)radiusInKm/1.609f;
        float volumeInCubicKm=(float)(4/3)*3.14f*(float)(radiusInKm*radiusInKm*radiusInKm);
        float volumeInCubicMiles=(float)(4/3)*3.14f*(float)(radiusInMiles*radiusInMiles*radiusInMiles);
        System.out.println("The volume of earth in cubic kilometers is "+ volumeInCubicKm+" and cubic miles is "+volumeInCubicMiles);
    }

}
