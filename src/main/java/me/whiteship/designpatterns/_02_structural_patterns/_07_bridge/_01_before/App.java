package me.whiteship.designpatterns._02_structural_patterns._07_bridge._01_before;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new KDA아리();
        kda아리.skillQ();
        kda아리.skillR();

        Champion kda카이사 = new KDA카이사();
        kda카이사.skillQ();
        kda카이사.skillR();

        Champion poolParty아리 = new PoolParty아리();
        poolParty아리.skillQ();
        poolParty아리.skillR();
    }
}
