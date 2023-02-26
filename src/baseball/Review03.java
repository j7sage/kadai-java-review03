package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam baseballteam01 = new BaseBallTeam();
        baseballteam01.setName("東京ヤクルトスワローズ");
        baseballteam01.setWin(80);
        baseballteam01.setLose(59);
        baseballteam01.setDraw(4);
        baseballteam01.report();

        BaseBallTeam baseballteam02 = new BaseBallTeam();
        baseballteam02.setName("横浜ＤｅＮＡベイスターズ");
        baseballteam02.setWin(73);
        baseballteam02.setLose(68);
        baseballteam02.setDraw(2);
        baseballteam02.report();

        BaseBallTeam baseballteam03 = new BaseBallTeam();
        baseballteam03.setName("阪神タイガース");
        baseballteam03.setWin(68);
        baseballteam03.setLose(71);
        baseballteam03.setDraw(4);
        baseballteam03.report();

        BaseBallTeam baseballteam04 = new BaseBallTeam();
        baseballteam04.setName("読売ジャイアンツ");
        baseballteam04.setWin(68);
        baseballteam04.setLose(72);
        baseballteam04.setDraw(3);
        baseballteam04.report();

        BaseBallTeam baseballteam05 = new BaseBallTeam();
        baseballteam05.setName("広島東洋カープ");
        baseballteam05.setWin(66);
        baseballteam05.setLose(74);
        baseballteam05.setDraw(3);
        baseballteam05.report();

        BaseBallTeam baseballteam06 = new BaseBallTeam();
        baseballteam06.setName("中日ドラゴンズ");
        baseballteam06.setWin(66);
        baseballteam06.setLose(75);
        baseballteam06.setDraw(2);
        baseballteam06.report();
    }



}
