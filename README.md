# API-test 
_WAP 프로젝트 api 통신 테스트_


* **전체 게시글 보기(paging)**
	* GET /board/all/{int page}
	* Request: {int page}
	* Response:
		* success: Class[]{id, topic, category, likes, date}
    
* **요약 등록**
	* POST /board/summary/{String category}
	* Request: {String category}, Class{topic, content}
	* Response:
		* success: 200
    
    
## 목표
위의 두 api에서,

1. 전체 게시글에서 3 페이지의 내용을 조회하시오.**(3 이외의 페이지는 빈 배열로 응답)**
2. "연어" 카테고리에 원하는 제목(topic)과 내용(content)으로 글을 등록하시오.**(제목과 내용 중 하나라도 없으면 X)**
