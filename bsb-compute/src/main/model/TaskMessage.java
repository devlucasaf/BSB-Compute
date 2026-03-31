package main.model;

public class TaskMessage {
    public Request  request;
    public double   absoluteArrivalTs;

    public TaskMessage(Request request, double absoluteArrivalTs) {
        this.request = request;
        this.absoluteArrivalTs = absoluteArrivalTs;
    }
}
