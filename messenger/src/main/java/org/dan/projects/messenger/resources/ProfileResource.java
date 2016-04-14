package org.dan.projects.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dan.projects.messenger.model.Profile;
import org.dan.projects.messenger.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
	
	private ProfileService pService = new ProfileService();
	
	@GET
	public List<Profile> getAllProfiles() {
		return pService.getAllProfiles();
	}
	
	@GET
	@Path("/{profileName}")
	public Profile getMessage(@PathParam("profileName") String profileName) {
		return pService.getProfile(profileName);
	}
	
	@POST
	public Profile addProfile(Profile profile) {
		return pService.addProfile(profile);
	}
	
	@PUT
	@Path("/{profileName}")
	public Profile updateMessage(@PathParam("profileName") String profileName, Profile profile) {
		profile.setProfileName(profileName);
		return pService.updateProfile(profile);
	}
	
	@DELETE
	@Path("/{profileName}")
	public void deleteMessage(@PathParam("profileName") String profileName) {
		pService.removeProfile(profileName);
	}
	
}
