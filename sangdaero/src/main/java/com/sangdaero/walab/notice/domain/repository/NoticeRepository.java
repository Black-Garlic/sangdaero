package com.sangdaero.walab.notice.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangdaero.walab.common.board.domain.entity.Board;
import com.sangdaero.walab.notice.domain.entity.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
	List<Notice> findByTitleContaining(String keyword);
}