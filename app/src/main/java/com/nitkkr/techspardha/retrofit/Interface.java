package com.nitkkr.techspardha.retrofit;

import com.nitkkr.techspardha.Fragments.sponsership.sponsorshipPojo.SponsorshipData;
import com.nitkkr.techspardha.events.categoryPojo.CategoryData;
import com.nitkkr.techspardha.events.categoryPojo.EventCategory;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Interface {
    @GET("events/description")
    Observable<EventCategory> getData(
            @Query("eventCategory") String category,
            @Query("eventName") String eName
    );

    @GET("events/description")
    Observable<CategoryData> getCatData(
            @Query("eventCategory") String category
    );

    @GET("sponsors/")
    Observable<SponsorshipData> getSponsorship(
    );
}
