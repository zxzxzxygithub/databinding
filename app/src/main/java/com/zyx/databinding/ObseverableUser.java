package com.zyx.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class ObseverableUser extends BaseObservable {
   public String firstName;
   public  String lastName;
   public ObseverableUser(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
   }

   @Bindable
   public String getFirstName() {
      return firstName;
   }

   @Bindable
   public void setFirstName(String firstName) {
      this.firstName = firstName;
      notifyPropertyChanged(com.zyx.databinding.BR.firstName);//注解和这句是关键
   }
   @Bindable
   public String getLastName() {
      return lastName;
   }
   @Bindable
   public void setLastName(String lastName) {
      this.lastName = lastName;
      notifyPropertyChanged(com.zyx.databinding.BR.lastName);
   }
}