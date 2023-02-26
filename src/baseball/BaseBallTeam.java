package baseball;

public class BaseBallTeam {
    //フィールド
    private String name;    //球団名
    private int win;        //白星
    private int lose;       //黒星
    private int draw;       //引き分け

    //コンストラクタ
    public BaseBallTeam() {
    }

    public BaseBallTeam(String name,int win,int lose,int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getRate() {
        double rate = (double)this.win / ((double)this.win + (double)this.lose);
        return rate;
    }

    public void report() {
        System.out.println(this.name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + getRate() +"です。" );
    }

}
