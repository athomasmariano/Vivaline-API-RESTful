package fiap.tds.resources;

import fiap.tds.entities.Faq;
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
    public List<Faq> getFaqs() {
        return faqService.listarFaqs();
    }

    @POST
    @Path("/contato")
    public Response enviarContato(Faq dto) {
        String resultado = faqService.registrarContato(dto);
        return Response.ok(resultado).build();
    }
}
