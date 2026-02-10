package mock.lib;

import mock.Meter;

// 백엔드 개발자가 만들 예정
public class RealMeter implements Meter {

    @Override
    public int getStep() {
        // 1. 블루투스 연결
        // 2. 프로토콜 지킨 통신으로 버퍼 다운
        // 3. 리스너 구현
        return 10;
    }
}