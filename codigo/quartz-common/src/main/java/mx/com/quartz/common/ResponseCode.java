package mx.com.quartz.common;

public enum ResponseCode {
	

	EMPTY_CREDENTIALS("EMPTY_CREDENTIALS","Usuario y password no puedene estar vacios"),
	INTERNAL_ERROR("INTERNAL_ERROR","Error interno");


	
	
	private ResponseCode(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String code;
	public String desc;
	
	
	
}
