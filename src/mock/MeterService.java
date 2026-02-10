package mock;

public class MeterService {

    private Meter meter; // RealMeter, MockMeter

    public MeterService(Meter meter) {
        this.meter = meter;
    }

    public void render(){
        int step = meter.getStep();
        System.out.println("걸음수 "+step+" 만큼 그림 그리기 완료");
    }
}