package com.springbook.biz.board;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "boardList") // 루트(최상위의) 엘리머트에 해당하는 객체의 이름을 BoardList로 지정한다. 
@XmlAccessorType(XmlAccessType.FIELD)
public class BoardListVO {
	
	@XmlElement(name="board") // 속해지는 엘리먼트를 Board라는 이름으로 들어간다. 
	private List<BoardVO> boardList;
	
	public List<BoardVO> getBoardList(){
		return boardList;
	}
	
	public void setBoardList(List<BoardVO> boardList) {
		this.boardList = boardList;
	}
}
