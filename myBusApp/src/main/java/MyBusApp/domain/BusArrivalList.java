package MyBusApp.domain;

import lombok.Data;

@Data
public class BusArrivalList {
    private int stationId;
    private int routId;
    private long loacationNo1;
    private int predictTime1;
    private int lowPlate1;
    private String plateNo1;
    private int remainSeatCnt1;
    private long locationNo2;
    private int predictTime2;
    private int lowPlate2;
    private String plateNo2;
    private int remainSeatCnt2;
    private int staOrder;
    private String flag;
}
