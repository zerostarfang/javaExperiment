/**
 * 方法：使用-Xss参数减少栈内存容量
 * 结果：抛出StackOverflowError异常，异常出现时输出的堆栈深度相应缩小
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
