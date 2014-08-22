package us.echo.pattern.composite;

/**
 * 
 * 组合模式：将对象组合成树形结构以表示‘部分-整体’的层次结构。组合模式使得用户对单个对象和组合对象的适用具有一致性。
 * 
 * 当你发现需求中是提现部分与整体层次结构时，以及你希望用户可以忽略组合对象与单个对象的不同，统一地使用组合结构中的所有对象时， 就应该考虑用组合模式了。
 * 
 * @author stefanie zhao
 * @date 2014-8-21 下午01:52:26
 */
public class Main {
	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("总人力资源"));
		root.add(new FinanceDepartment("总财务"));

		ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
		comp.add(new HRDepartment("华东分公司人力资源"));
		comp.add(new FinanceDepartment("华东分公司财务"));
		root.add(comp);

		ConcreteCompany nj = new ConcreteCompany("南京办事处");
		nj.add(new HRDepartment("南京办事处人力资源"));
		nj.add(new FinanceDepartment("南京办事处财务"));
		comp.add(nj);

		root.display(1);

		root.lineOfDuty();

	}
}
