package org.assessment.rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.assessment.entity.Book;
import org.assessment.service.DiscountService;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookResource {

    // TODO: Task 3 - Inject DiscountService

    @POST
    public Response createBook(Book book) {
        // TODO: Task 3 - Save book with Transactional integrity
        return Response.status(Response.Status.CREATED).entity(book).build();
    }

    @GET
    @Path("/{id}")
    public Book getBook(@PathParam("id") Long id) {
        // TODO: Task 3 & 4 - Implement logic and handle Not Found
        return null;
    }
}
