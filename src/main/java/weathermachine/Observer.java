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
     * @param   temp        温度
     * @param   humidity    湿度
     * @param   windPower   风力
     */
    void update(int temp, int humidity, int windPower);
}
