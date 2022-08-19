public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newcurrentStation) {

        if (newcurrentStation < 0) {
            return;
        }
        if (newcurrentStation > 9) {
            return;
        }
        currentStation = newcurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }

    }

    public void setNextStation() {
        if (currentStation == 9) {
            currentStation = 0;
            return;
        }
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void setVolumeUp() {
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setVolumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }
}