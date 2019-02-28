package problem02;

public class MyService extends BaseService {
		
		public MyService() {
			super();

		}
		@Override
		public void service(String state) {
			if(state.equals("낮")||state.equals("밤")) {
				String result = state.equals("낮") ? day() : night() ;
				System.out.println(result+"서비스시작");
			}
			if(state.equals("오후")) {
				String result = afternoon() ;
				System.out.println(result+"서비스시작");
			}else {
				
			}
			
		}
	public String afternoon() {
		return "오후";
	}
}
