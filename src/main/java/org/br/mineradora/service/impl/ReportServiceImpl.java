package org.br.mineradora.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import org.br.mineradora.dto.OpportunityDTO;
import org.br.mineradora.service.ReportService;

import java.io.ByteArrayInputStream;
import java.util.List;

@ApplicationScoped
public class ReportServiceImpl implements ReportService {
    @Override
    public ByteArrayInputStream generateCSVOpportunityReport() {
        return null;
    }

    @Override
    public List<OpportunityDTO> getOpportunitiesData() {
        return null;
    }
}
