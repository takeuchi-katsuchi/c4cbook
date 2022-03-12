package jp.co.c4c.db.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.c4c.db.dto.SampleDto;

@Component
public class SampleDao {

	// @Autowiredがうまくいかない
//	@Autowired
//	public SqlManager sqlManager;

	public List<SampleDto> selectNames() {
		System.out.print("Daoが接続されたよ");

//      final SqlResource sqlSrc = new StringSqlResource("select * from SAMPLE;");
//      return sqlManager.getResultList(SampleDto.class, sqlSrc);

		return null;
	}
}
