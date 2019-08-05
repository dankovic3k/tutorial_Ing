
public class CsharpConsumer {

	static{
		System.load("C:\\Users\\dcrodriguez\\Downloads\\CppClrPrj\\CppClrPrj\\x64\\Debug\\JNICsharpBridge.dll");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CsharpConsumer csc = new CsharpConsumer();
		csc.reigsterAssemblyHandler("C:\\Users\\dcrodriguez\\Downloads\\CppClrPrj\\CppClrPrj\\x64\\Debug\\");
		//System.out.println("Result of adding = "+ csc.addTwoNos(1, 5));
		csc.StartPclService();
	}

	native int addTwoNos(int a,int b);
	native int StartPclService();
	native int reigsterAssemblyHandler(String str);
}
