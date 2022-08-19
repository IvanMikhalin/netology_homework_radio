public class Radio {

    private int numberOfStations;
    private int maxStation;
    private int minStation;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int numberOfStations) {
        this.minStation = minStation;
        this.maxStation = numberOfStations - 1;
        this.currentStation = minStation = 0;
        this.currentVolume = minVolume;
        this.currentVolume = maxVolume;
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
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;

    }

    public void setPrevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }

        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
    }

    public void setNextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
    }

    public void setVolumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        }

    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
    }
}