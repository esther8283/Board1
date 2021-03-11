package board.service;

import java.util.List;

public interface BoardDto {
	List<BoardDto> selectBoardList() throws Exception;
}
