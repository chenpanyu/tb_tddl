/*(C) 2007-2012 Alibaba Group Holding Limited.	

public class ParseSQLJEPException extends TDLCheckedExcption{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7724677712426352259L;
	public ParseSQLJEPException(Throwable th){
		super("����sqlJep��parseExpression��ʱ��������"+th.getMessage());
	}

}