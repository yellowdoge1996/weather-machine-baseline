package weathermachine;

/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2020/10/30 ： NWT)hxl ： 新規作成
 * @date 2020/10/30 12:30
 */
public interface Observer {
    /**
     * 更新状态
     * @param args  参数
     */
    void update(int... args);
}
