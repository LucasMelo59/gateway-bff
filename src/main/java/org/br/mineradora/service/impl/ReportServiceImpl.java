package org.br.mineradora.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.br.mineradora.client.ReportRestClient;
import org.br.mineradora.dto.OpportunityDTO;
import org.br.mineradora.service.ReportService;
import org.br.mineradora.utils.CSVHelper;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

@ApplicationScoped
public class ReportServiceImpl implements ReportService {
    //bff chamando a mesma informação e tratando ela de forma diferente
    @Inject
    @RestClient
    ReportRestClient reportRestClient;

    @Override
    public ByteArrayInputStream generateCSVOpportunityReport() throws IOException {

        List<OpportunityDTO> opportunityData = reportRestClient.requestOpportunitiesData();
        return CSVHelper.OpportunitiesToCSV(opportunityData);

    }

    @Override
    public List<OpportunityDTO> getOpportunitiesData() {

        return reportRestClient.requestOpportunitiesData();


    }
}
