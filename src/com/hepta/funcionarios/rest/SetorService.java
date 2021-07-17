package com.hepta.funcionarios.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


import com.hepta.funcionarios.entity.Setor;
import com.hepta.funcionarios.persistence.SetorDAO;

@Path("/setores")
public class SetorService {

	
	@Context
	private HttpServletRequest request;

	@Context
	private HttpServletResponse response;

	private SetorDAO dao;
	
	public SetorService() {
		dao = new SetorDAO();
	}

	protected void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Response SetorCreate(Setor setor) {
		
		try {
			dao.save(setor);
		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Erro ao cadastrar o Setor").build();
		}
		return Response.status(Status.OK).build();
	}
	
	
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Response SetorRead() {
		List<Setor> setores = new ArrayList<>();
		try {
			setores = dao.getAll();
		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Erro ao buscar Setores").build();
		}

		GenericEntity<List<Setor>> entity = new GenericEntity<List<Setor>>(setores) {
		};
		return Response.status(Status.OK).entity(entity).build();
	}
	
	
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@PUT
	public Response SetorUpdate(@PathParam("id") Integer id, Setor setor) {
		
		
		try {
			Setor s = dao.find(id);
			
			if (s == null) {
				return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Setor não encontrado").build();
			}
			
			dao.update(setor);
		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Erro ao editar o Setor").build();
		}
		
		return Response.status(Status.OK).build();
	}
	
	
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@DELETE
	public Response SetorDelete(@PathParam("id") Integer id) {
		
		try {
			Setor s = dao.find(id);
			
			if (s == null) {
				return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Setor não encontrado").build();
			}
			
			dao.delete(id);
			
		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Erro ao excluir o Setor").build();
		}
		
		return Response.status(Status.OK).build();

	}

}
