package us.echo.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefanie zhao
 * @date 2014-8-21 下午01:43:13
 */
public class HRDepartment extends Company {

	public HRDepartment(String name) {
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
		System.out.format(" %s 员工招聘培训管理", name);
	}

}
