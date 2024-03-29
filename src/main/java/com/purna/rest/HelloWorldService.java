package com.purna.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.purna.rest.bean.*;

@Path("/charts")
public class HelloWorldService {

    @GET
    @Path("/linechart1")
    @Produces(MediaType.APPLICATION_JSON)
    public DataBean linechart1() {

        List<SeriesBean> list = new ArrayList<SeriesBean>();
        list.add(new SeriesBean("Tokyo", "#3366cc", new double[] {7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6}));
        list.add(new SeriesBean("New York", "#8BBC21", new double[] {0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5}));
        list.add(new SeriesBean("London", "#ff33ff", new double[] {3.9, 4.2, 5.7, 8.5, 12.9, 15.2, 15.0, 16.6, 14.2, 10.3, 6.6, 4.8}));

        String[] categories = new String[] {"9 Jan '13", "8 Feb '13","5 Mar '13","12 Apr '13","14 May '13","21 Jun '13","30 Jul '13","8 Aug '13","5 Sep '13","17 Oct '13","23 Nov '13","5 Dec '13"};
        
        return new DataBean("chart1-container", "LineChart Title", "Y Values (%)", "Run Dates", Arrays.asList(categories), list);
    }
    
    @GET
    @Path("/linechart2")
    @Produces(MediaType.APPLICATION_JSON)
    public DataBean linechart2() {

        List<SeriesBean> list = new ArrayList<SeriesBean>();
        list.add(new SeriesBean("Munich", "#76FF32", new double[] {8.0, 6.9, 9.5, 12.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6}));
        list.add(new SeriesBean("Paris", "#a209f4", new double[] {0.8, 0.8, 6.7, 11.3, 17.0, 22.0, 23.8, 24.1, 20.1, 14.1, 8.6, 2.5}));
        list.add(new SeriesBean("Rome", "#f42109", new double[] {3.8, 8.2, 5.7, 8.5, 11.9, 17.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8}));

        String[] categories = new String[] {"2 Jan '13", "4 Feb '13","5 Mar '13","10 Apr '13","8 May '13","30 Jun '13","3 Jul '13","8 Aug '13","5 Sep '13","17 Oct '13","23 Nov '13","5 Dec '13"};
        return new DataBean("chart2-container", "LineChart Title", "Y Values (%)", "Run Dates", Arrays.asList(categories), list);
    }

    @GET
    @Path("/linechart3")
    @Produces(MediaType.APPLICATION_JSON)
    public DataBean linechart3() {

        List<SeriesBean> list = new ArrayList<SeriesBean>();
        list.add(new SeriesBean("Chicago", "#993333", new double[] {17.0, 16.9, 4.5, 9.5, 15.2, 12.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6}));
        list.add(new SeriesBean("Dublin", "#0033FF", new double[] {9.2, 10.8, 25.7, 18.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 23.5}));
        list.add(new SeriesBean("Madrid", "#ffa632", new double[] {8.8, 8.2, 9.7, 8.5, 10.9, 16.2, 16.0, 16.6, 11.2, 10.3, 6.6, 9.8}));

        String[] categories = new String[] {"4 Jan '13", "14 Feb '13","15 Mar '13","11 Apr '13","19 May '13","23 Jun '13","3 Jul '13","8 Aug '13","5 Sep '13","17 Oct '13","23 Nov '13","5 Dec '13"};
        return new DataBean("chart3-container", "LineChart Title", "Y Values (%)", "Run Dates", Arrays.asList(categories), list);
    }
}