import net.sf.json.JSONObject;
public class JsonEx {

	public static void main(String args[])
	{
		JSONObject jo=new JSONObject();
		 jo.put("site","java4s.com");
		 jo.put("content","Java");
		 jo.put("TotalLinks",927);
		 System.out.println(jo);
	}

}
