package cn.cocho.sdk.http.utils;

import com.tbc.soa.json.JsonCodec;

import java.lang.reflect.Type;


/**
 * Json转换工具包
 * @author keqikeji
 *
 */
public class JsonUtilSdk {
	private static final JsonCodec jsonUtil = new JsonCodec();

	public static JsonCodec getJsonutil() {
		return jsonUtil;
	}
	
	public static String toJson(Object obj){
		return jsonUtil.toJson(obj);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T toObject(String json,Type objType){
		return (T)jsonUtil.toObject(json, objType);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T toObject(String json){
		return (T)jsonUtil.toObject(json);
	}
}
