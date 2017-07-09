package com.obob.test.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.analysis.solvers.RiddersSolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obob.test.po.RolePo;
import com.obob.test.service.support.RoleSupportService;

@Service
public class RoleService {
	
	@Autowired
	private RoleSupportService roleSupportService;
	
	public void initRole() {
		List<RolePo> list = this.initPoList();
		for(RolePo po : list) {
			roleSupportService.insert(po);
		}
	}
	
	private List<RolePo> initPoList() {
		List<RolePo> rolePos = new ArrayList<>();
		RolePo ancestor = new RolePo();
		ancestor.setCreateOperatorId(0);
		ancestor.setRoleName("祖先");
		ancestor.setRoleDesc("祖先，包括男女");
		rolePos.add(ancestor);
		RolePo grandpa = new RolePo();
		grandpa.setRoleName("爷爷");
		rolePos.add(grandpa);
		
		RolePo grandma = new RolePo();
		grandma.setRoleName("奶奶");
		rolePos.add(grandpa);
		
		RolePo father = new RolePo();
		father.setRoleName("爸爸");
		rolePos.add(father);
		
		RolePo mother = new RolePo();
		mother.setRoleName("妈妈");
		rolePos.add(mother);
		
		RolePo son = new RolePo();
		son.setRoleName("儿子");
		rolePos.add(mother);
		
		RolePo daughter = new RolePo();
		daughter.setRoleName("女儿");
		rolePos.add(daughter);
		
		RolePo grandChild = new RolePo();
		grandChild.setRoleName("孙子");
		rolePos.add(grandChild);
		
		RolePo grandDaughter = new RolePo();
		grandDaughter.setRoleName("孙女");
		rolePos.add(grandDaughter);
		
		return rolePos;
	}
}
