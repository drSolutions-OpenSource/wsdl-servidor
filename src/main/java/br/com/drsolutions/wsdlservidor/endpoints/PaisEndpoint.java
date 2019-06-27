package br.com.drsolutions.wsdlservidor.endpoints;

import br.com.drsolutions.wsdlservidor.assets.GetPaisRequest;
import br.com.drsolutions.wsdlservidor.assets.GetPaisResponse;
import br.com.drsolutions.wsdlservidor.repositories.PaisRepository;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PaisEndpoint {
    private static final String NAMESPACE_URI = "http://drsolutions.com.br/wsdlservidor/assets";

    private final PaisRepository paisRepository;

    public PaisEndpoint(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPaisRequest")
    @ResponsePayload
    public GetPaisResponse getPais(@RequestPayload GetPaisRequest request) {
        GetPaisResponse response = new GetPaisResponse();
        response.setPais(paisRepository.buscarPorPais(request.getNome()));

        return response;
    }
}
