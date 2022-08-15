public class Radio {

    private int numberOfStations;
    private int maxStation;
    private int minStation;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio (int numberOfStations){
        this.minStation = minStation;
        this.maxStation = numberOfStations - 1;
        this.currentStation = minStation = 0;
        this.currentVolume = minVolume;
        this.numberOfStations = numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public int getMinStation() {
        return minStation;
    }
    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }



    public void setDirectStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        else {
            currentStation = newCurrentStation;
        }
    }

    public void setPrevStation(int newCurrentStation) {
        if (newCurrentStation == minStation) {
            currentStation = maxStation;
        }
        if (newCurrentStation > minStation) {
            currentStation = newCurrentStation - 1;
        }
    }

    public void setNextStation(int newCurrentStation) {
        if (newCurrentStation == maxStation) {
            currentStation = minStation;
        }
        if (newCurrentStation < maxStation) {
            currentStation = newCurrentStation + 1;
        }
    }

    public void setVolumeUp(int newCurrentVolume) {
        if (newCurrentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < maxVolume) {
            currentVolume = newCurrentVolume + 1;
        }
    }

    public void reduceVolume(int newCurrentVolume) {
        if (newCurrentVolume > minVolume) {
            currentVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume <= minVolume) {
            newCurrentVolume = minVolume;
        }
    }
}