package com.adam.Shifty.resources;

import com.adam.Shifty.model.Profile;
import service.ProfileService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by adam on 10/02/2017.
 */
@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

    private ProfileService profileService = new ProfileService();

    @GET
    public List<Profile> getProfiles(){
        return profileService.getAllProfiles();
    }


    @POST
    public Profile addProfile(Profile profile){
        profileService.addProfile(profile);
        return profile;
    }

    @PUT
    @Path("/{profileId}")
    public Profile updateProfile(@PathParam("profileId") String profileID, Profile profile){
        profile.setProfileName(profileID);
        profileService.updateProfile(profile);
        return profile;
    }

    @DELETE
    @Path("/{profileId}")
    public void deleteProfile(@PathParam("profileId") String profileId){
        profileService.removeProfile(profileId);
    }

    @GET
    @Path("/{profileId}")
    public Profile getProfile(@PathParam("profileId") String profileId){

        return profileService.getProfile(profileId);
    }

}
