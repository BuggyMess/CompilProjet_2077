
public class Fragment0_Visitor implements Fragment_0Visitor {
	private int indent = 0;
	
	private String GenCode="";
	private int taille;
	
	public void printGenCode() {
		System.out.print(GenCode);
	}
	 private String indentString() {
		    StringBuffer sb = new StringBuffer();
		    for (int i = 0; i < indent; ++i) {
		      sb.append(" ");
		    }
		    return sb.toString();
		  }

	@Override
	public Object visit(SimpleNode node, Object data) {
		System.out.println(indentString() + node +
			       ": acceptor not unimplemented in subclass?");

	                       // I think UNimplemented above is a typo
	    ++indent;
	    data = node.childrenAccept(this, data);
	    --indent;
	    return data;
		
		// TODO Auto-generated method stub
		//return null;
	}

	@Override
	public Object visit(ASTStart node, Object data) {
		
		    data = node.childrenAccept(this, data);
		   
		    return data;
	}

	@Override
	public Object visit(ASTroot_programm node, Object data) {
		
		    data = node.childrenAccept(this, data);
		    
		    return data;
	}

	@Override
	public Object visit(ASTcommand node, Object data) {
		this.GenCode = node.code + this.GenCode;
		    data = node.childrenAccept(this, data);
		   
		    return data;
	}

	@Override
	public Object visit(ASTexpression node, Object data) {
		
		    data = node.childrenAccept(this, data);
		   
		    return data;
	}

	@Override
	public Object visit(ASTcond_vrai node, Object data) {
		    
		    
		    for(int i=0;i<node.jjtGetNumChildren();i++) {
		    	node.setTaille(node.getTaille()+node.jjtGetChild(i).getTaille());
		    }
		    node.setTaille(node.getTaille()+1);
		    this.GenCode = node.code+node.getTaille() +"\n"+ this.GenCode ;
		    data = node.childrenAccept(this, data);
		    
		    return data;
	}

	@Override
	public Object visit(ASTcond_faux node, Object data) {
		for(int i=0;i<node.jjtGetNumChildren();i++) {
	    	node.setTaille(node.getTaille()+node.jjtGetChild(i).getTaille());
	    }
		this.GenCode = node.code+""+node.getTaille()+"\n"+ this.GenCode ;
		    data = node.childrenAccept(this, data);
		    
		   
		    return data;
	}

	@Override
	public Object visit(ASTteste_égalité node, Object data) {
		
		for(int i=0;i<node.jjtGetNumChildren();i++) {
	    	node.setTaille(node.getTaille()+node.jjtGetChild(i).getTaille());
	    }
		this.GenCode = node.code + this.GenCode;
		    data = node.childrenAccept(this, data);
		    
		    return data;
	}

	@Override
	public Object visit(ASTop_add node, Object data) {
		
		for(int i=0;i<node.jjtGetNumChildren();i++) {
	    	node.setTaille(node.getTaille()+node.jjtGetChild(i).getTaille());
	    }
		this.GenCode = node.code + this.GenCode;
		    data = node.childrenAccept(this, data);
		   
		    return data;
	}

	@Override
	public Object visit(ASTop_moins node, Object data) {
		
		for(int i=0;i<node.jjtGetNumChildren();i++) {
	    	node.setTaille(node.getTaille()+node.jjtGetChild(i).getTaille());
	    }
		this.GenCode = node.code + this.GenCode;
		    data = node.childrenAccept(this, data);
		   
		    return data;
	}

	@Override
	public Object visit(ASTop_mult node, Object data) {
		
		for(int i=0;i<node.jjtGetNumChildren();i++) {
	    	node.setTaille(node.getTaille()+node.jjtGetChild(i).getTaille());
	    }
		this.GenCode = node.code + this.GenCode;
		    data = node.childrenAccept(this, data);
		   
		    return data;
	}

	@Override
	public Object visit(ASTop_divi node, Object data) {
		
		for(int i=0;i<node.jjtGetNumChildren();i++) {
	    	node.setTaille(node.getTaille()+node.jjtGetChild(i).getTaille());
	    }
		this.GenCode = node.code + this.GenCode;
		    data = node.childrenAccept(this, data);
		   
		    return data;
	}

	@Override
	public Object visit(ASTop_mod node, Object data) {
		
		for(int i=0;i<node.jjtGetNumChildren();i++) {
	    	node.setTaille(node.getTaille()+node.jjtGetChild(i).getTaille());
	    }
		this.GenCode = node.code + this.GenCode;
		    data = node.childrenAccept(this, data);
		    
		    return data;
	}

	@Override
	public Object visit(ASTid node, Object data) {
		
		 this.GenCode = node.code + this.GenCode;
		    data = node.childrenAccept(this, data);
		   
		    return data;
	}

	@Override
	public Object visit(ASTnombre node, Object data) {
		   this.GenCode = node.code + this.GenCode;
		   
		    data = node.childrenAccept(this, data);
		   
		    return data;
	}

	@Override
	public Object visit(ASTneg node, Object data) {
		
		for(int i=0;i<node.jjtGetNumChildren();i++) {
	    	node.setTaille(node.getTaille()+node.jjtGetChild(i).getTaille());
	    }
		 //this.GenCode+=node.code;
		 this.GenCode = node.code + this.GenCode;
		 data = node.childrenAccept(this, data);
		   
		    return data;
		// TODO Auto-generated method stub
		
	}
	

}
