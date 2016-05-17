package com.yc.vote.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.vote.entity.Item;
import com.yc.vote.entity.OptionBean;
import com.yc.vote.entity.Subject;
import com.yc.vote.entity.SubjectBean;
import com.yc.vote.entity.VoteBean;
import com.yc.vote.mapper.SubjectMapper;
import com.yc.vote.service.VoteService;
@Service("voteService")
public class VoteServiceImpl implements VoteService {
	@Autowired
	private SubjectMapper subjectMapper;
	
	@Override
	public List<Subject> findAllSubjects() {
		
		return subjectMapper.getAllSubjects();
	}
	@Override
	public List<SubjectBean> findAllSubjectBeans() {
		
		return subjectMapper.getAllSubjectBeans();
	}

	@Override
	public OptionBean findOptionsByVsId(int vsId) {
	
		return subjectMapper.getOptionsByVsId(vsId);
	}
	@Override
	public VoteBean findVoteBeanByVsId(int vsId) {
		
		return subjectMapper.getVoteBeanByVsId(vsId);
	}
	@Override
	public boolean saveVote(Item item) {
		try{
			subjectMapper.insertItem(item);
			return true;
		}catch (Exception e){
			LogManager.getLogger().error("Í¶Æ±Ê§°Ü£¡£¡",e);
		}
		return false;
	}
	@Override
	public boolean saveVote(Item item, String[] voId) {
		boolean flag=true;
		if(voId.length>1){
			for(String v:voId){
				item.setVoId(Integer.parseInt(v));
				if(!saveVote(item)){
					return false;
				}
			}
			return true;
		}
		return saveVote(item);
	}
}
