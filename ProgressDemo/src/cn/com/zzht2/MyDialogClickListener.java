package cn.com.zzht2;
/***
 * �ص��������ú�����dialog��ʧʱ����
 * @author ����
 *
 */
public interface MyDialogClickListener {

	public static final int BUTTON_MODE_OK = 1;// ok��ť
	public static final int BUTTON_MODE_CANCEL = 2;// cancel��ť
	/***
	 * 
	 * @param BUTTON_MODE  �����ж��û�������ĸ���ť
	 * @param result ����ֵ����
	 */
	void OnClick(int BUTTON_MODE,String result[]);
	
}
