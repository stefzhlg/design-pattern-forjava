package us.echo.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午01:43:13
 */
public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
	}

	@Override
	public void remove(Company c) {
	}

	@Override
	public void display(int depth) {
		System.out.println(Util.getString(depth) + name);
	}

	@Override
	public void lineOfDuty() {
		System.out.format(" %s 公司财务收支管理", name);
	}

}
