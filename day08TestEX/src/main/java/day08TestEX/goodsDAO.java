package day08TestEX;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class goodsDAO {
	
	 // 클래스 레벨에서 Random 객체를 선언하고 초기화
    private Random random;

    // 생성자를 통해 Random 객체 초기화
    public goodsDAO() {
        random = new Random();
    }
	
	//상품전체가져오기
	public ArrayList<String>  getBeautyList(){		
		ArrayList<String>  BeautyList = new ArrayList<>();		
		BeautyList.add("스킨케어");
		BeautyList.add("선케어");
		BeautyList.add("클렌징");
		BeautyList.add("메이크업");
		BeautyList.add("프레그런스");
		BeautyList.add("헤어케어");
		BeautyList.add("바디케어");
		BeautyList.add("헤어기기");
		BeautyList.add("쉐이빙/면도기");
		BeautyList.add("뷰티디바이스");
		BeautyList.add("미용소품");
		BeautyList.add("건강/위생용품");
		return BeautyList;		
	}
	
	//상품전체가져오기
		public ArrayList<String>  getShoesList(){		
			ArrayList<String>  ShoesList = new ArrayList<>();		
			ShoesList.add("스니커즈");
			ShoesList.add("구두");
			ShoesList.add("샌들/슬리퍼");
			ShoesList.add("부츠/워커");
			ShoesList.add("스포츠화");
			ShoesList.add("신발용품");
			return ShoesList;		
		}
		
		//상품전체가져오기
		public ArrayList<String>  getTshirtList(){		
			ArrayList<String>  TshirtList = new ArrayList<>();		
			TshirtList.add("맨투맨/스웨트");
			TshirtList.add("셔츠/블라우스");
			TshirtList.add("후드 티셔츠");
			TshirtList.add("니트/스웨터");
			TshirtList.add("피케/카라 티셔츠");
			TshirtList.add("긴소매티셔츠");
			TshirtList.add("반소매티셔츠");
			TshirtList.add("민소매티셔츠");
			TshirtList.add("스포츠 상의");
			TshirtList.add("기타 상의");
			return TshirtList;		
		}
		
		//상품전체가져오기
		public ArrayList<String>  getOuterList(){		
			ArrayList<String>  OuterList = new ArrayList<>();		
			OuterList.add("후드 집업");
			OuterList.add("블루종/MA-1");
			OuterList.add("레더/라이더스재킷");
			OuterList.add("무스탕/퍼");
			OuterList.add("트러커 재킷");
			OuterList.add("슈트/블레이저재킷");
			OuterList.add("카디건");
			OuterList.add("아노락 재킷");
			OuterList.add("플리스/뽀글이");
			OuterList.add("트레이닝재킷");
			OuterList.add("스타디움재킷");
			OuterList.add("환절기 코트");
			OuterList.add("겨울 싱글코트");
			OuterList.add("겨울 더블코트");
			OuterList.add("겨울 기타코트");
			OuterList.add("롱패팅/헤비 아우터");
			OuterList.add("숏패딩/헤비 아우터");
			OuterList.add("패딩 베스트");
			OuterList.add("베스트");
			OuterList.add("사파리/헛팅 재킷");
			OuterList.add("나일론/코치 재킷");
			OuterList.add("기타 아우터");
			return OuterList;		
		}
		
		//상품전체가져오기
		public ArrayList<String>  getPantsList(){		
			ArrayList<String> PantsList = new ArrayList<>();		
			PantsList.add("데님 팬츠");
			PantsList.add("코튼 팬츠");
			PantsList.add("슈트 팬츠/슬랙스");
			PantsList.add("트레이닝/조거 팬츠");
			PantsList.add("숏 팬츠");
			PantsList.add("레깅스");
			PantsList.add("점프 슈트/오버올");
			PantsList.add("스포츠 하의");
			PantsList.add("기타 바지");
			return PantsList;		
		}
		
		//상품전체가져오기
		public ArrayList<String>  getSkirtList(){		
			ArrayList<String>  SkirtList = new ArrayList<>();		
			SkirtList.add("미니원피스");
			SkirtList.add("미디원피스");
			SkirtList.add("맥시원피스");
			SkirtList.add("미니스커트");
			SkirtList.add("미디스커트");
			SkirtList.add("롱스커트");
			return SkirtList;		
		}
		
		//상품전체가져오기
		public ArrayList<String>  getBagList(){		
			ArrayList<String>  BagList = new ArrayList<>();		
			BagList.add("백팩");
			BagList.add("메신저/크로스 백");
			BagList.add("숄더백");
			BagList.add("토트백");
			BagList.add("에코백");
			BagList.add("보스턴/더플백");
			BagList.add("웨이스트 백");
			BagList.add("파우치 백");
			BagList.add("브리프케이스");
			BagList.add("캐리어");
			BagList.add("가방 소품");
			BagList.add("지갑/머니클립");
			BagList.add("클러치 백");
			return BagList;		
		}
		
		//상품전체가져오기
		public ArrayList<String>  getPropsList(){		
			ArrayList<String>  PropsList = new ArrayList<>();		
			PropsList.add("모자");
			PropsList.add("양말/레그웨어");
			PropsList.add("선글라스/안경테");
			PropsList.add("액세서리");
			PropsList.add("시계");
			PropsList.add("주얼리");
			return PropsList;		
		}
		
		public ArrayList<String>  getHomewearList(){		
			ArrayList<String>  HomewearList = new ArrayList<>();		
			HomewearList.add("여성 속옷 상의");
			HomewearList.add("여성 속옷 하의");
			HomewearList.add("여성 속옷 세트");
			HomewearList.add("남성 속옷");
			HomewearList.add("홈웨어");
			return HomewearList;		
		}
		
		public ArrayList<String>  getSportsList(){		
			ArrayList<String>  SportsList = new ArrayList<>();		
			SportsList.add("상의");
			SportsList.add("하의");
			SportsList.add("아우터");
			SportsList.add("스커트");
			SportsList.add("원피스");
			SportsList.add("상하의세트");
			SportsList.add("수영복/비치웨어");
			SportsList.add("스포츠신발");
			SportsList.add("기구/용품/장비");
			SportsList.add("스포츠가방");
			SportsList.add("스포츠잡화");
			SportsList.add("스포츠모자");
			return SportsList;		
		}
		
		public ArrayList<String>  getDigitalList(){		
			ArrayList<String> DigitalList = new ArrayList<>();		
			DigitalList.add("디지털/가전");
			DigitalList.add("가구/인테리어");
			DigitalList.add("생활/주방");
			DigitalList.add("컬처/취미/소품");
			DigitalList.add("반려동물");
			return DigitalList;		
		}
	
	
		// 공통된 상품 정보 가져오기 (모든 카테고리에서 사용할 수 있는 메서드)
		 public String getRandomItem(List<String> items) {
		        if (items == null || items.isEmpty()) {
		            return null; // 리스트가 비어있다면 null 반환
		        }
		        return items.get(random.nextInt(items.size()));
		    }

		    // 상품 코드로 상품 정보 가져오기 - 개선된 메서드
		    public String getBeautyList(String code) {
		        return getRandomItem(getBeautyList());
		    }

		    public String getShoesList(String code) {
		        return getRandomItem(getShoesList());
		    }

		    public String getTshirtList(String code) {
		        return getRandomItem(getTshirtList());
		    }

		    public String getOuterList(String code) {
		        return getRandomItem(getOuterList());
		    }

}
