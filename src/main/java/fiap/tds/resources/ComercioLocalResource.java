package fiap.tds.resources;

import fiap.tds.services.ComercioLocalService;
import fiap.tds.entities.ComercioLocal;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/comercios")
@Produces(MediaType.APPLICATION_JSON)
public class ComercioLocalResource {
    private final ComercioLocalService comercioService = new ComercioLocalService();

    // GET: Listar todos os comércios
    @GET
    public Response getComercios() {
        List<ComercioLocal> comercios = comercioService.listarComercios();

        if (comercios.isEmpty()) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Nenhum comércio encontrado.")
                    .build();
        }

        return Response.ok(comercios).build();
    }

    // POST: Adicionar um novo comércio
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addComercio(ComercioLocal comercio) {
        // Verifica se o comércio foi adicionado com sucesso
        boolean isAdded = comercioService.adicionarComercio(comercio);

        if (!isAdded) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Erro ao adicionar o comércio. Verifique se todos os campos estão preenchidos corretamente.")
                    .build();
        }

        return Response.status(Response.Status.CREATED)
                .entity(comercio)
                .build();
    }

    // DELETE: Remover um comércio
    @DELETE
    @Path("/{nome}")
    public Response deleteComercio(@PathParam("nome") String nome) {
        boolean isRemoved = comercioService.removerComercio(nome);

        if (!isRemoved) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Comércio não encontrado para remoção.")
                    .build();
        }

        return Response.noContent().build();
    }
}
