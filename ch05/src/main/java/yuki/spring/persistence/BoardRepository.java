package yuki.spring.persistence;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import yuki.spring.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{
	List<Board> findByTitle(String searchKeyword);
	List<Board> findByContentContaining(String string);
	List<Board> findByTitleContainingOrContentContaining(String title, String content);
	List<Board> findByTitleContainingOrderBySeqDesc(String searchKeyword);
	//List<Board> findByTitleContaining(String searchKeyword, Pageable paging);
	Page<Board> findByTitleContaining(String searchKeyword, Pageable paging);
	@Query("SELECT b FROM Board b WHERE b.title like %?1% ORDER BY b.seq DESC")
	List<Board> queryAnnotationTest1(String searchKeyword);
}
