package baseball;

public class BaseBallTeam {
	private String name;
	private int win;
	private int lose;
	private int draw;
	
	public BaseBallTeam (String name, int win, int lose, int draw) {
		this.name = name;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
	}
	
	public String getName() {
		return name;
	}
	public int getWin() {
		return win;
	}
	public int getLose() {
		return lose;
	}
	public int getDraw() {
		return draw;
	}
	public double getRate() {
		return (double) win / (win + lose);
	}	
	public void report() {
		double rate = getRate();
		System.out.println( name + "の2022年の成績は " + win + "数 " + lose + "敗 " + draw + "分、勝率は"+ rate + "です。");
	}
}
