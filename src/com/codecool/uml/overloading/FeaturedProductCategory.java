package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {

    private Date startDate;
    private Date endDate;

    public void schedule(Date startDate, Date endDate){
        this.startDate = startDate;
        this.endDate = endDate;



    }

    @Override
    public  String toString() {
        String className = getClass().getSimpleName();
        return String.format(
                "%s:id:%d,name:%s,department:%s,description:%s,startDate:%s,endDate:%s",
                className, this.getId(), this.getName(), this.getDepartment(), this.getDescription(), startDate, endDate
        );
    }
}

