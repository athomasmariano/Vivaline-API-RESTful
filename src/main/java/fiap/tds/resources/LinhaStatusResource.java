package fiap.tds.resources;

import fiap.tds.services.LinhaStatusService;
import fiap.tds.entities.LinhaStatus;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/linhas")
@Produces(MediaType.APPLICATION_JSON)
public class LinhaStatusResource {
    private LinhaStatusService statusService = new LinhaStatusService();

    @GET
    public List<LinhaStatus> getStatus() {
        return statusService.listarStatus();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addStatus(LinhaStatus linhaStatus) {
        boolean isValid = statusService.validarStatus(linhaStatus);
        if (!isValid) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Status inválido")
                    .build();
        }
        statusService.adicionarStatus(linhaStatus);
        return Response.status(Response.Status.CREATED)
                .entity(linhaStatus)
                .build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateStatus(@PathParam("id") int id, LinhaStatus linhaStatus) {
        boolean updated = statusService.atualizarStatus(id, linhaStatus);
        if (!updated) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Status não encontrado")
                    .build();
        }
        return Response.noContent().build();  // Retorna 204 No Content após a atualização
    }

    @DELETE
    @Path("/{id}")
    public Response deleteStatus(@PathParam("id") int id) {
        boolean deleted = statusService.removerStatus(id);
        if (!deleted) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Status não encontrado")
                    .build();
        }
        return Response.noContent().build();
    }
}
