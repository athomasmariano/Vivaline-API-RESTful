package fiap.tds;

import fiap.tds.dtos.FaqDto;
import fiap.tds.services.FaqService;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/faq")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FaqResource {

    private FaqService faqService = new FaqService();

    @GET
    public List<FaqDto> getFaqs() {
        return faqService.listarFaqs();
    }

    @POST
    @Path("/contato")
    public Response enviarContato(FaqDto dto) {
        String resultado = faqService.registrarContato(dto);
        return Response.ok(resultado).build();
    }
}
