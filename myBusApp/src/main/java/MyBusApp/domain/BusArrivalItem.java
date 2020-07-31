package MyBusApp.domain;

import lombok.Data;

@Data
public class BusArrivalItem {
    private int stationId;  //정류소 아이디
    private int routeId;    // 노선 아이디
    private long locationNo1;   //첫번째 차량 위치 정보
    private int predictTime1;   //첫번째 차량 도착 예상 시간
    private int lowPlate1;  //첫번째 차량 저상 버스 여부
    private String plateNo1;  //첫번째 차량 차량 번호
    private int remainSeatCnt1; //첫번째 차량 빈자리 수
    private long locationNo2;
    private int predictTime2;
    private int lowPlate2;
    private String plateNo2;
    private int remainSeatCnt2;
    private int staOrder;   //정류소 순번
    private String flag;  //상태 구분
}
