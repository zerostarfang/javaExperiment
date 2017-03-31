/**
 * 方法：1）限制java堆的大小为20M，不可扩展
 *     2）通过-XX:+HeapDumpOnOutOfMemoryError
 *     可让虚拟机在出现内存溢出异常时Dump出当前的内存堆转储快照以便事后分析
 * 结果：OutOfMemoryError
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
