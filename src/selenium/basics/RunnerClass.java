package selenium.basics;

import java.sql.SQLException;

public class RunnerClass {

	public static void main(String[] args) {

		DBUtilities.setupConnection();
		DBUtilities.runQuery();
	}

}
