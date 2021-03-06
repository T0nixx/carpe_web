package com.carpe.overview;

import java.util.List;
import java.util.Map;

public interface OverviewService {

	public Map selectCaseInfo(Map<String, Object> paramMap) throws Exception;

	public List<Map> selectCaseUserList(Map<String, Object> paramMap) throws Exception;
	
	public List<Map> selectEvidenceList(Map<String, Object> paramMap) throws Exception;
}