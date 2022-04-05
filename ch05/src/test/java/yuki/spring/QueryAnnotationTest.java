package yuki.spring;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yuki.spring.domain.Board;
import yuki.spring.persistence.BoardRepository;

@SpringBootTest
class QueryAnnotationTest {

	@Autowired
	private BoardRepository boardRepo;

	@Test
	public void testQueryAnnotationTest1() {
		List<Board> boardList = boardRepo.queryAnnotationTest1("테스트 제목 : 7");
		System.out.println("검색 결과");
		for (Board board : boardList) {
			System.out.println("---> " + board.toString());
		}
	}

}
