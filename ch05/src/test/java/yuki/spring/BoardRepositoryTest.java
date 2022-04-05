package yuki.spring;

import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yuki.spring.domain.Board;
import yuki.spring.persistence.BoardRepository;

@SpringBootTest
public class BoardRepositoryTest {
	@Autowired
	private BoardRepository boardRepo;

	@Test
	// 등록
//	public void testInsertBoard() {
//		Board board = new Board();
//		board.setTitle("두번째 글");
//		board.setWriter("김재우");
//		board.setContent("등록 테스트");
//		board.setRegDate(new Date());
//		board.setCnt(0L);
//		boardRepo.save(board);
//	}
	// 조회
//	public void testGetBoard() {
//		Board board = boardRepo.findById(1L).get();
//		System.out.println("---> " + board.toString());
//	}

	// 수정
//	public void testUpdateBoard() {
//		System.out.println("1번 게시글 조회");
//		Board board = boardRepo.findById(1L).get();
//		System.out.println("1번 글 수정");
//		board.setWriter("사오정");
//		boardRepo.save(board);
//	}

	// 삭제
	public void testDeleteBoard() {
		boardRepo.deleteById(1L);
	}
}
