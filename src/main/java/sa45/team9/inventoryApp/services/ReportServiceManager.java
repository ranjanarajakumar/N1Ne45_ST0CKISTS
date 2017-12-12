package sa45.team9.inventoryApp.services;

import java.util.ArrayList;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sa45.team9.inventoryApp.model.Parts;
import sa45.team9.inventoryApp.repository.ReportRepository;

@Service
public class ReportServiceManager implements IReportService{
	@Resource
	private ReportRepository reportRepository;
	
	@Override
	@Transactional
	public ArrayList<Parts> findAllParts(){
		ArrayList<Parts> l =(ArrayList<Parts>) reportRepository.findAll();
		return l;
		
	}

	@Override
	@Transactional
	public ArrayList<Parts> findPendingProductByID(String eid) {
        ArrayList<Parts> lw = reportRepository.findPendingProductByID(eid);
		return lw;
	}

}
