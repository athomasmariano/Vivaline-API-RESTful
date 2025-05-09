package fiap.tds;

import fiap.tds.dtos.MapaDto;
import fiap.tds.services.MapaService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/mapa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MapaResource {

    private final MapaService mapaService = new MapaService();

    @GET
    public List<MapaDto> getMapa() {
        return mapaService.listarEstacoes();
    }

    @POST
    public Response adicionarEstacao(MapaDto novaEstacao) {
        mapaService.adicionarEstacao(novaEstacao);
        return Response.status(Response.Status.CREATED).entity(novaEstacao).build();
    }

    @DELETE
    @Path("/{nome}")
    public Response removerEstacao(@PathParam("nome") String nomeEstacao) {
        boolean removido = mapaService.removerEstacao(nomeEstacao);
        if (removido) {
            return Response.noContent().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Estação não encontrada").build();
        }
    }
}
