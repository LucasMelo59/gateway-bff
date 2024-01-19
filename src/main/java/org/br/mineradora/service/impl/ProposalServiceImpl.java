package org.br.mineradora.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.br.mineradora.client.ProposalRestClient;
import org.br.mineradora.dto.ProposalDetailsDTO;
import org.br.mineradora.service.ProposalService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class ProposalServiceImpl implements ProposalService {

    @Inject
    @RestClient
    ProposalRestClient proposalRestClient;


    @Override
    public ProposalDetailsDTO getProposalDetailsById(long proposalId) {
        return null;
    }

    @Override
    public Response createProposal(ProposalDetailsDTO proposalDetails) {
        return null;
    }

    @Override
    public Response removeProposal(long id) {
        return null;
    }
}
