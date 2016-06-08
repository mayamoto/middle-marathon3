package baseball;

public class DetailDto {
	/** チームID */
	private int id;
	/** チーム名 */
	private String teamName;
	/** 本拠地 */
	private String headQuarters;
	/** 発足 */
	private String inauguration;
	/** 歴史 */
	private String history;


	/**
	 * チームIDを取得します。
	 * @return チームID
	 */
	public int getId() {
	    return id;
	}
	/**
	 * チームIDを設定します。
	 * @param id チームID
	 */
	public void setId(int id) {
	    this.id = id;
	}
	/**
	 * チーム名を取得します。
	 * @return チーム名
	 */
	public String getTeamName() {
	    return teamName;
	}
	/**
	 * チーム名を設定します。
	 * @param teamName チーム名
	 */
	public void setTeamName(String teamName) {
	    this.teamName = teamName;
	}
	/**
	 * 本拠地を取得します。
	 * @return 本拠地
	 */
	public String getHeadQuarters() {
	    return headQuarters;
	}
	/**
	 * 本拠地を設定します。
	 * @param headQuarters 本拠地
	 */
	public void setHeadQuarters(String headQuarters) {
	    this.headQuarters = headQuarters;
	}
	/**
	 * 発足を取得します。
	 * @return 発足
	 */
	public String getInauguration() {
	    return inauguration;
	}
	/**
	 * 発足を設定します。
	 * @param inauguration 発足
	 */
	public void setInauguration(String inauguration) {
	    this.inauguration = inauguration;
	}
	/**
	 * 歴史を取得します。
	 * @return 歴史
	 */
	public String getHistory() {
	    return history;
	}
	/**
	 * 歴史を設定します。
	 * @param history 歴史
	 */
	public void setHistory(String history) {
	    this.history = history;
	}

}
