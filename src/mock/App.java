package mock;

import mock.lib.RealMeter;

/**
 * 상황 : 만보기 라이브러리를 만드는 개발자, 만보기 메서드를 사용하는 프론트 개발자
 * 문제 : 만보기 라이브러리 개발자가 일이 늦어서 30일 걸리고, 프론트 개발자는 10일만에 개발 해야됨.
 * 프론트개발자(나) vs 백앤드개발자(동료)
 *
 * 아직 만들어지지 않았다면 Mock으로 구현!! -> 나중에 붙일때 인터페이스가 없으면 어댑터로 연결해야함!
 */

public class App {
    public static void main(String[] args) {
        MeterService ms = new MeterService(new RealMeter());
        ms.render();
    }
}