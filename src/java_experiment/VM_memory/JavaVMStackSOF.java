/**
 * ������ʹ��-Xss��������ջ�ڴ�����
 * ������׳�StackOverflowError�쳣���쳣����ʱ����Ķ�ջ�����Ӧ��С
 */
package java_experiment.VM_memory;

/**
 * VM Args:-Xss128k
 * @author zerofang
 *
 */
public class JavaVMStackSOF {
	private int stackLength = 1;
	public void stackLeak(){
		stackLength += stackLength;
		stackLeak();
	}
	
	public static void main(String[] args) throws Throwable{
		JavaVMStackSOF sof = new JavaVMStackSOF();
		try{
			sof.stackLeak();
		}catch(Throwable te){
			System.out.println("the stacklength is " + sof.stackLength);
			throw te;
		}
		
	}
}
