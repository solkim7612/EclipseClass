package day05;

import java.util.ArrayList;

public class AcornService {
	DBDAO2 dao=new DBDAO2();
	
	int registerMember(Acorn acorn) {
		int rtn=dao.insert(acorn);
		
		return rtn;
		
	}
	
	ArrayList<Acorn> getMememberList(){
		return dao.selectAll();
	}
	
	int modifyMember(Acorn acorn) {
		return dao.update(acorn);
	}
}
