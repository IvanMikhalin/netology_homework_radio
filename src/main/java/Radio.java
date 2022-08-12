public class Radio {

    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setDirectStation(int newcurrentStation) {
        if (newcurrentStation < 0) {
            return;
        }
        if (newcurrentStation > 9) {
            return;
        }
        currentStation = newcurrentStation;
    }

    public void setPrevStation(int newcurrentStation) {
        if (newcurrentStation == 0) {
            currentStation = 9;
        }
        if (newcurrentStation > 0) {
            currentStation = newcurrentStation - 1;
        }
    }

    public void setNextStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }
        if (newCurrentStation < 9) {
            currentStation = newCurrentStation + 1;
        }
    }

    public void setVolumeUp(int newCurrentVolume) {
        if (newCurrentVolume >= 10) {
            currentVolume = 10;
        }
        if (currentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        }
    }

    public void reduceVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume <= 0) {
            currentVolume = 0;
        }
    }
}