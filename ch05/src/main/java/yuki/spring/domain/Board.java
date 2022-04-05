package yuki.spring.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Entity implementation class for Entity: Board
 *
 */
@Getter
@Setter
@ToString//(exclude = "member")
@Entity
@Table(name = "MYBOARD")
public class Board {

	@Id
	@GeneratedValue
	private Long seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private Long cnt;
}