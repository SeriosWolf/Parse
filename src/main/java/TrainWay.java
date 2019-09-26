public class TrainWay {

    private String numTrain;
    private String wayBegin;
    private String wayEnd;
    private String timeArrive;
    private String timeDepart;
    private Boolean periodicity;

    public TrainWay(String numTrain,String wayBegin,String wayEnd,String timeArrive,String timeDepart,Boolean periodicity){
        this.numTrain = numTrain;
        this.wayBegin = wayBegin;
        this.wayEnd = wayEnd;
        this.timeArrive = timeArrive;
        this.timeDepart = timeDepart;
        this.periodicity = periodicity;

    }

    public TrainWay(){

        public String getNumTrain() {
            return numTrain;
        }

        public void setNumTrain(String numTrain) {
            this.numTrain = numTrain;
        }

        public String getWayBegin() {
            return wayBegin;
        }

        public void setWayBegin(String wayBegin) {
            this.wayBegin = wayBegin;
        }

        public String getWayEnd() {
            return wayEnd;
        }

        public void setWayEnd(String wayEnd) {
            this.wayEnd = wayEnd;
        }

        public String getTimeArrive() {
            return timeArrive;
        }

        public void setTimeArrive(String timeArrive) {
            this.timeArrive = timeArrive;
        }

        public String getTimeDepart() {
            return timeDepart;
        }

        public void setTimeDepart(String timeDepart) {
            this.timeDepart = timeDepart;
        }

        public Boolean getPeriodicity() {
            return periodicity;
        }

        public void setPeriodicity(Boolean periodicity) {
            this.periodicity = periodicity;
        }
    }
}
