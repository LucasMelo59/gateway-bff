package org.br.mineradora.service;

import org.br.mineradora.dto.OpportunityDTO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

public interface ReportService {

    ByteArrayInputStream generateCSVOpportunityReport() throws IOException;

    List<OpportunityDTO> getOpportunitiesData();
}
