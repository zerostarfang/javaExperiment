/**
 * ������1������java�ѵĴ�СΪ20M��������չ
 *     2��ͨ��-XX:+HeapDumpOnOutOfMemoryError
 *     ����������ڳ����ڴ�����쳣ʱDump����ǰ���ڴ��ת�������Ա��º����
 * �����OutOfMemoryError
 */
package java_experiment.VM_memory;
import java.util.ArrayList;
import java.util.List;

/**
 * VM Args:-verbose:gc -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
 * @author zerofang
 *
 */
public class HeapOOM {
	static class OOMObject{
	
	}
	public static void main(String[] arg){
		List<OOMObject> list = new ArrayList<OOMObject> ();
		while(true){
			list.add(new OOMObject());
		}
	}
}
