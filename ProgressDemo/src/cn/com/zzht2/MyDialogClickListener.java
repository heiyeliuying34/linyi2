package cn.com.zzht2;
/***
 * 回调函数。该函数在dialog消失时触发
 * @author 陈正
 *
 */
public interface MyDialogClickListener {

	public static final int BUTTON_MODE_OK = 1;// ok按钮
	public static final int BUTTON_MODE_CANCEL = 2;// cancel按钮
	/***
	 * 
	 * @param BUTTON_MODE  用于判断用户点击了哪个按钮
	 * @param result 返回值数组
	 */
	void OnClick(int BUTTON_MODE,String result[]);
	
}
