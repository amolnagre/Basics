
public class ClassVariableStatic {

	public static void main(String[] args) {

		
		
		InstanceAndLocalVar stcls=new InstanceAndLocalVar();
		stcls.i++;
		System.out.println(stcls.i);
		// System.out.println(stcls.i);// print 11
		InstanceAndLocalVar stcls1=new InstanceAndLocalVar();
		stcls1.i++;
		System.out.println(stcls1.i);// print 12
		InstanceAndLocalVar stcls2=new InstanceAndLocalVar();
		//stcls2.i++;
		System.out.println(stcls2.i);// print 12 due to static keyword infront of i global variable in instanceAndLocalVar Class

	}

}
